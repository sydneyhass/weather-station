package com.sydneyhass.weatherstation.controller;

import com.sydneyhass.weatherstation.model.Station;
import com.sydneyhass.weatherstation.repository.StationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class StationController {

    private StationRepository stationRepository;

    public StationController(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @GetMapping("/")
    public List<Station> getStations() {
        return stationRepository.findResults(1, 100);
    }

    @GetMapping("/station/id={id}")
    public Optional<Station> getStationById(@PathVariable Long id) {
        return stationRepository.findById(id);
    }

    @GetMapping("/station/stationName={stationName}")
    public Station getStationByName(@PathVariable String stationName) {
        return stationRepository.findByStationName(stationName);
    }
}
