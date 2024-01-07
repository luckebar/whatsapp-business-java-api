package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Optional.
 *
 * @param name Specifies the sender's profile name.
 */
public class Profile {

    @JsonProperty("name")
    String name;

    public Profile(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public void name(String name) {
        this.name = name;
    }
    
}
