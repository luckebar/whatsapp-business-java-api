package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Button.
 *
 * @param payload The developer-defined payload for the button when a business
 * account sends interactive messages.
 * @param text The button text
 */
public class Button {

    @JsonProperty("payload")
    String paylod;

    @JsonProperty("text")
    String text;

    public Button(String paylod, String text) {
        this.paylod = paylod;
        this.text = text;
    }

    public String paylod() {
        return paylod;
    }

    public void paylod(String paylod) {
        this.paylod = paylod;
    }

    public String text() {
        return text;
    }

    public void text(String text) {
        this.text = text;
    }

}
