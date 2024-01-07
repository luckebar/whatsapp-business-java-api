package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Phone.
 */
public class Phone {

    @JsonProperty("phone")
    String phone;

    @JsonProperty("wa_id")
    String waId;

    @JsonProperty("type")
    String type;

    public Phone() {
    }

    public Phone(String phone, String waId, String type) {
        this.phone = phone;
        this.waId = waId;
        this.type = type;
    }

    public String phone() {
        return phone;
    }

    public void phone(String phone) {
        this.phone = phone;
    }

    public String waId() {
        return waId;
    }

    public void waId(String waId) {
        this.waId = waId;
    }

    public String type() {
        return type;
    }

    public void type(String type) {
        this.type = type;
    }

}
