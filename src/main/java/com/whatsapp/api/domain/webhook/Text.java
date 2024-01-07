package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Text.
 *
 * @param body The text of the text message.
 */
public class Text {

    @JsonProperty("body")
    String body;

    public Text(String body) {
        this.body = body;
    }

    public String body() {
        return body;
    }

    public void body(String body) {
        this.body = body;
    }

}
