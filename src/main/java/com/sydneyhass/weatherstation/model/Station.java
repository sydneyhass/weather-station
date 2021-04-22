package com.sydneyhass.weatherstation.model;

import java.util.Date;

public class Station {
    private String stationName;
    private String province;
    private Date date;
    private float meanTemp;
    private float highestTemp;
    private float lowestTemp;

    public Station(String stationName, String province, Date date, float meanTemp, float highestTemp, float lowestTemp) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getMeanTemp() {
        return meanTemp;
    }

    public void setMeanTemp(float meanTemp) {
        this.meanTemp = meanTemp;
    }

    public float getHighestTemp() {
        return highestTemp;
    }

    public void setHighestTemp(float highestTemp) {
        this.highestTemp = highestTemp;
    }

    public float getLowestTemp() {
        return lowestTemp;
    }

    public void setLowestTemp(float lowestTemp) {
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
