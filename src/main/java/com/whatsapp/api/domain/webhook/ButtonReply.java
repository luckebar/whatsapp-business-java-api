package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Button reply.
 *
 * @param id The unique identifier of the button.
 * @param title The title of the button.
 */
public class ButtonReply {

    @JsonProperty("id")
    String id;

    @JsonProperty("title")
    String title;

    public ButtonReply() {
    }

    public ButtonReply(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String id() {
        return id;
    }

    public void id(String id) {
        this.id = id;
    }

    public String title() {
        return title;
    }

    public void title(String title) {
        this.title = title;
    }

}
