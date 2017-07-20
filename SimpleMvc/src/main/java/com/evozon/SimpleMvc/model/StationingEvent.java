package com.evozon.SimpleMvc.model;

/**
 * Created by toderici_dan on 20.07.2017.
 */

public class StationingEvent {

    private int carId;
    private double latitude;
    private double longitude;
    private long stationaryTime;

    public StationingEvent(int carId, double latitude, double longitude, long stationaryTime) {
        this.carId = carId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.stationaryTime = stationaryTime;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getCarId() {
        return carId;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public long getStationaryTime() {
        return stationaryTime;
    }

    public void setStationaryTime(long stationaryTime) {
        this.stationaryTime = stationaryTime;
    }

    @Override
    public String toString() {
        return "StationingEvent{" +
                "carId=" + carId +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", stationaryTime=" + stationaryTime +
                '}'+'\n';
    }
}
