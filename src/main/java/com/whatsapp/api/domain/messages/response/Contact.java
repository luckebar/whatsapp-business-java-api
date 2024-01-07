package com.whatsapp.api.domain.messages.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Contact.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contact {

    @JsonProperty("input")
    String input;

    @JsonProperty("wa_id")
    String waId;

    public Contact(String input, String waId) {
        this.input = input;
        this.waId = waId;
    }

    public String input() {
        return input;
    }

    public void input(String input) {
        this.input = input;
    }

    public String waId() {
        return waId;
    }

    public void waId(String waId) {
        this.waId = waId;
    }
    
}
