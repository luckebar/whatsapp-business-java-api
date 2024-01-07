package com.whatsapp.api.domain.messages.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Message.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Message {
    @JsonProperty("id") String id;

    public Message() {
    }

    public Message(String id) {
        this.id = id;
    }

    public String id() {
        return id;
    }

    public void id(String id) {
        this.id = id;
    }
    
    
}
