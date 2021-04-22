package com.sydneyhass.weatherstation.data;

public class StationInput {

    private String stationName;
    private String province;
    private String date;
    private String meanTemp;
    private String highestTemp;
    private String lowestTemp;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMeanTemp() {
        return meanTemp;
    }

    public void setMeanTemp(String meanTemp) {
        this.meanTemp = meanTemp;
    }

    public String getHighestTemp() {
        return highestTemp;
    }

    public void setHighestTemp(String highestTemp) {
        this.highestTemp = highestTemp;
    }

    public String getLowestTemp() {
        return lowestTemp;
    }

    public void setLowestTemp(String lowestTemp) {
        this.lowestTemp = lowestTemp;
    }
}
