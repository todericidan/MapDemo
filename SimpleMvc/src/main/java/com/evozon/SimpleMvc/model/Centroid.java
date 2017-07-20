package com.evozon.SimpleMvc.model;

/**
 * Created by toderici_dan on 20.07.2017.
 */
public class Centroid {
    private double latitude;
    private double longitude;

    public Centroid(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Centroid{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
