package com.sydneyhass.weatherstation.model;

import java.time.LocalDate;

public class Station {
    private String stationName;
    private String province;
    private LocalDate date;
    private Float meanTemp;
    private Float highestTemp;
    private Float lowestTemp;

    public Station(String stationName, String province, LocalDate date, Float meanTemp, Float highestTemp, Float lowestTemp) {
        this.stationName = stationName;
        this.province = province;
        this.date = date;
        this.meanTemp = meanTemp;
        this.highestTemp = highestTemp;
        this.lowestTemp = lowestTemp;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Float getMeanTemp() {
        return meanTemp;
    }

    public void setMeanTemp(Float meanTemp) {
        this.meanTemp = meanTemp;
    }

    public Float getHighestTemp() {
        return highestTemp;
    }

    public void setHighestTemp(Float highestTemp) {
        this.highestTemp = highestTemp;
    }

    public Float getLowestTemp() {
        return lowestTemp;
    }

    public void setLowestTemp(Float lowestTemp) {
        this.lowestTemp = lowestTemp;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationName='" + stationName + '\'' +
                ", province='" + province + '\'' +
                ", date=" + date +
                ", meanTemp=" + meanTemp +
                ", highestTemp=" + highestTemp +
                ", lowestTemp=" + lowestTemp +
                '}';
    }
}
