package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The type Contact.
 *
 * @param profile The {@link Profile} object.
 * @param waId The WhatsApp ID of the customer. You can send messages using this
 * wa_id.
 */
public class Contact {

    @JsonProperty("profile")
    Profile profile;

    @JsonProperty("name")
    Name name;

    @JsonProperty("phones")
    List<Phone> phones;

    @JsonProperty("wa_id")
    String waId;

    public Contact(Profile profile, Name name, List<Phone> phones, String waId) {
        this.profile = profile;
        this.name = name;
        this.phones = phones;
        this.waId = waId;
    }

    public Profile profile() {
        return profile;
    }

    public void profile(Profile profile) {
        this.profile = profile;
    }

    public Name name() {
        return name;
    }

    public void name(Name name) {
        this.name = name;
    }

    public List<Phone> phones() {
        return phones;
    }

    public void phones(List<Phone> phones) {
        this.phones = phones;
    }

    public String waId() {
        return waId;
    }

    public void waId(String waId) {
        this.waId = waId;
    }

}
