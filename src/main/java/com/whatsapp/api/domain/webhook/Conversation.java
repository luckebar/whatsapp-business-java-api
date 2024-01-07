package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Conversation.
 *
 * @param expirationTimestamp The timestamp when the current ongoing
 * conversation expires. This field is not present in all Webhook types.
 * @param origin Describes where the conversation originated from. See
 * {@link Origin} object for more information.
 * @param id The ID of the conversation the given status notification belongs
 * to.
 */
public class Conversation {

    @JsonProperty("expiration_timestamp")
    String expirationTimestamp;

    @JsonProperty("origin")
    Origin origin;

    @JsonProperty("id")
    String id;

    public Conversation(String expirationTimestamp, Origin origin, String id) {
        this.expirationTimestamp = expirationTimestamp;
        this.origin = origin;
        this.id = id;
    }

    public String expirationTimestamp() {
        return expirationTimestamp;
    }

    public void expirationTimestamp(String expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
    }

    public Origin origin() {
        return origin;
    }

    public void origin(Origin origin) {
        this.origin = origin;
    }

    public String id() {
        return id;
    }

    public void id(String id) {
        this.id = id;
    }

}
