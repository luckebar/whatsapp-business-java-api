package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Address.
 */
public class Address {

    @JsonProperty("zip")
    String zip;

    @JsonProperty("country")
    String country;

    @JsonProperty("country_code")
    String countryCode;

    @JsonProperty("city")
    String city;

    @JsonProperty("street")
    String street;

    @JsonProperty("state")
    String state;

    @JsonProperty("type")
    String type;

    public Address() {
    }

    public Address(String zip, String country, String countryCode, String city, String street, String state, String type) {
        this.zip = zip;
        this.country = country;
        this.countryCode = countryCode;
        this.city = city;
        this.street = street;
        this.state = state;
        this.type = type;
    }

    public String zip() {
        return zip;
    }

    public void zip(String zip) {
        this.zip = zip;
    }

    public String country() {
        return country;
    }

    public void country(String country) {
        this.country = country;
    }

    public String countryCode() {
        return countryCode;
    }

    public void countryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String city() {
        return city;
    }

    public void city(String city) {
        this.city = city;
    }

    public String street() {
        return street;
    }

    public void street(String street) {
        this.street = street;
    }

    public String state() {
        return state;
    }

    public void state(String state) {
        this.state = state;
    }

    public String type() {
        return type;
    }

    public void type(String type) {
        this.type = type;
    }

}
