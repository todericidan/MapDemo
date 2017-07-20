package com.evozon.SimpleMvc.model;

/**
 * Created by toderici_dan on 20.07.2017.
 */
public class Cluster {

    private int id;
    private Centroid center;
    private int radius;

    public Cluster(int id, Centroid center, int radius) {
        this.id = id;
        this.center = center;
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public Centroid getCenter() {
        return center;
    }

    public void setCenter(Centroid center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Cluster{" +
                "id=" + id +
                ", center=" + center +
                ", radius=" + radius +
                '}';
    }
}
