package com.sydneyhass.weatherstation.repository;

import com.sydneyhass.weatherstation.model.Station;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StationRepository extends CrudRepository<Station, Long> {

    default List<Station> findResults(int page, int count) {
        return findAll(PageRequest.of(page, count));
    }

    List<Station> findAll(Pageable pageable);

    Optional<Station> findById(Long id);

    Station findByStationName(String stationName);

}
