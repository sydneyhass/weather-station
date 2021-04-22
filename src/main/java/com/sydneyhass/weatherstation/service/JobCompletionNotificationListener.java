package com.sydneyhass.weatherstation.service;

import com.sydneyhass.weatherstation.model.Station;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.sql.Date;
import java.util.Calendar;
import java.util.Locale;

@Component
public class JobCompletionNotificationListener extends JobExecutionListenerSupport {
    private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JobCompletionNotificationListener(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
            log.info("!!! JOB FINISHED! Time to verify the results");

            jdbcTemplate.query("SELECT station_name, province, record_date, mean_temp, max_temp, min_temp FROM station",
                    (rs, row) -> new Station(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getDate(3).toLocalDate(),
                            rs.getFloat(4),
                            rs.getFloat(5),
                            rs.getFloat(6))
            ).forEach(station -> log.info("Found <" + station + "> in the database."));
        }
    }
}
