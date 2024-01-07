package com.whatsapp.api.domain.messages.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Message.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Message {
    @JsonProperty("id") 
    String id;
    @JsonProperty("message_status") 
    String messageStatus;

    public Message() {
    }

    public Message(String id, String messageStatus) {
        this.id = id;
        this.messageStatus = messageStatus;
    }

    public String id() {
        return id;
    }

    public void id(String id) {
        this.id = id;
    }

    public String messageStatus() {
        return messageStatus;
    }

    public void messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }
    
    
}
