package com.sydneyhass.weatherstation.service;

import com.sydneyhass.weatherstation.data.StationInput;
import com.sydneyhass.weatherstation.model.Station;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class StationInputItemProcessor implements ItemProcessor<StationInput, Station> {

    private static final Logger log = LoggerFactory.getLogger(StationInputItemProcessor.class);

    @Override
    public Station process(StationInput stationInput) throws Exception {
        log.info(stationInput.toString());

        String stationName = stationInput.getStationName();
        String province = stationInput.getProvince();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate date = LocalDate.parse(stationInput.getDate(), formatter);
        Float meanTemp = stationInput.getMeanTemp().isEmpty()? null: Float.parseFloat(stationInput.getMeanTemp());
        Float minTemp = stationInput.getLowestTemp().isEmpty()? null: Float.parseFloat(stationInput.getLowestTemp());
        Float maxTemp = stationInput.getHighestTemp().isEmpty()? null: Float.parseFloat(stationInput.getHighestTemp());

        return new Station(stationName, province, date, meanTemp, minTemp, maxTemp);
    }
}
