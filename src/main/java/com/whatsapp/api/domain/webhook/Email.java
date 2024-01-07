package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Email.
 */
public class Email {

    @JsonProperty("type")
    String type;

    @JsonProperty("email")
    String email;

    public Email() {
    }

    public Email(String type, String email) {
        this.type = type;
        this.email = email;
    }

    public String type() {
        return type;
    }

    public void type(String type) {
        this.type = type;
    }

    public String email() {
        return email;
    }

    public void email(String email) {
        this.email = email;
    }
    
}
