package com.example.android.quakereport;


public class Earthquake {

    private double magnitude;

    private String location;

    private long timeInMilliseconds;

    private String url;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        magnitude = magnitude;
        location = location;
        timeInMilliseconds = timeInMilliseconds;
        url = url;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }

    public String getUrl() {
        return url;
    }
}
