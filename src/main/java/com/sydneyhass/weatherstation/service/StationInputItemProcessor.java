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
        float meanTemp = stationInput.getMeanTemp().isEmpty()? 0: Float.parseFloat(stationInput.getMeanTemp());
        float minTemp = stationInput.getLowestTemp().isEmpty()? 0: Float.parseFloat(stationInput.getLowestTemp());
        float maxTemp = stationInput.getHighestTemp().isEmpty()? 0: Float.parseFloat(stationInput.getHighestTemp());

        return new Station(stationName, province, date, meanTemp, minTemp, maxTemp);
    }
}
