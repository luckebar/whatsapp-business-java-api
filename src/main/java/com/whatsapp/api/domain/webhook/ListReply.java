package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type List reply.
 *
 * @param description The description of the selected row.
 * @param id The unique identifier (ID) of the selected row.
 * @param title The title of the selected row.
 */
public class ListReply {

    @JsonProperty("description")
    String description;

    @JsonProperty("id")
    String id;

    @JsonProperty("title")
    String title;

    public ListReply(String description, String id, String title) {
        this.description = description;
        this.id = id;
        this.title = title;
    }

    public String description() {
        return description;
    }

    public void description(String description) {
        this.description = description;
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
