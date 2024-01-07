package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Location.
 */
public class Location {

    @JsonProperty("address")
    String address;

    @JsonProperty("latitude")
    double latitude;

    @JsonProperty("name")
    String name;

    @JsonProperty("longitude")
    double longitude;

    @JsonProperty("url")
    String url;

    public Location(String address, double latitude, String name, double longitude, String url) {
        this.address = address;
        this.latitude = latitude;
        this.name = name;
        this.longitude = longitude;
        this.url = url;
    }

    public String address() {
        return address;
    }

    public void address(String address) {
        this.address = address;
    }

    public double latitude() {
        return latitude;
    }

    public void latitude(double latitude) {
        this.latitude = latitude;
    }

    public String name() {
        return name;
    }

    public void name(String name) {
        this.name = name;
    }

    public double longitude() {
        return longitude;
    }

    public void longitude(double longitude) {
        this.longitude = longitude;
    }

    public String url() {
        return url;
    }

    public void url(String url) {
        this.url = url;
    }

}
