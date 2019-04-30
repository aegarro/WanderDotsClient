package com.sourcey.materiallogindemo;

public class Dot {

    private int     id;
    private String  title;
    private String  description;
    private int     photo;
    private double  latitude;
    private double  longitude;

    public Dot(int id, String title, String description, int photo, double latitude, double longitude) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.photo = photo;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
