package com.whatsapp.api.domain.messages.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The type Message response.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageResponse {

    @JsonProperty("messaging_product")
    String messagingProduct;

    @JsonProperty("contacts")
    List<Contact> contacts;

    @JsonProperty("messages")
    List<Message> messages;

    public MessageResponse(String messagingProduct, List<Contact> contacts, List<Message> messages) {
        this.messagingProduct = messagingProduct;
        this.contacts = contacts;
        this.messages = messages;
    }

    public String messagingProduct() {
        return messagingProduct;
    }

    public void messagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public List<Contact> contacts() {
        return contacts;
    }

    public void contacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Message> messages() {
        return messages;
    }

    public void messages(List<Message> messages) {
        this.messages = messages;
    }
    
}
