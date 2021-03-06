package com.sydneyhass.weatherstation.service;

import com.sydneyhass.weatherstation.data.StationInput;
import com.sydneyhass.weatherstation.model.Station;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    private final String[] FIELDS = new String[] {"stationName","province","date","meanTemp","highestTemp","lowestTemp"};

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public FlatFileItemReader<StationInput> reader() {
        return new FlatFileItemReaderBuilder<StationInput>()
                .name("stationInputItemReader")
                .resource(new ClassPathResource("eng-climate-summary.csv"))
                .linesToSkip(1)
                .delimited()
                .names(FIELDS)
                .fieldSetMapper(new BeanWrapperFieldSetMapper<StationInput>() {{
                    setTargetType(StationInput.class);
                }})
                .build();
    }

    @Bean
    public StationInputItemProcessor processor() {
        return new StationInputItemProcessor();
    }

    @Bean
    public JdbcBatchItemWriter<Station> writer(DataSource dataSource) {
        return new JdbcBatchItemWriterBuilder<Station>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql("INSERT INTO station (id, station_name, province, date, mean_temp, highest_temp, lowest_temp) " +
                        "VALUES (:id, :stationName, :province, :date, :meanTemp, :highestTemp, :lowestTemp)")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
        return jobBuilderFactory.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1)
                .end()
                .build();
    }

    @Bean
    public Step step1(JdbcBatchItemWriter<Station> writer) {
        return stepBuilderFactory.get("step1")
                .<StationInput, Station> chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer)
                .build();
    }
}
