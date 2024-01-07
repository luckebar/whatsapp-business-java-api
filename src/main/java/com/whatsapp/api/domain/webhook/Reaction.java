package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Reaction.
 *
 * @param emoji The emoji used for the reaction.
 * @param messageId Specifies the wamid of the message received that contained
 * the reaction.
 */
public class Reaction {

    @JsonProperty("emoji")
    String emoji;

    @JsonProperty("message_id")
    String messageId;

    public Reaction(String emoji, String messageId) {
        this.emoji = emoji;
        this.messageId = messageId;
    }

    public String emoji() {
        return emoji;
    }

    public void emoji(String emoji) {
        this.emoji = emoji;
    }

    public String messageId() {
        return messageId;
    }

    public void messageId(String messageId) {
        this.messageId = messageId;
    }

}
