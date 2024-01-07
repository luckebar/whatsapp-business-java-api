package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Generic webhook class wrapper. All Webhooks messages have this.
 *
 * @param changes Changes that triggered the Webhooks call. This field contains
 * an array of change objects.
 * @param id The ID of Whatsapp Business Accounts this Webhook belongs to.
 * @param time Time for the entry. (WhatsApp Business Management API)
 */
public class Entry {

    /*
        	Changes that triggered the Webhooks call. This field contains an array of change objects.
     */
    @JsonProperty("changes")
    List<Change> changes;
    /*
            The ID of Whatsapp Business Accounts this Webhook belongs to.
     */
    @JsonProperty("id")
    String id;

    @JsonProperty("time")
    long time;

    public Entry(List<Change> changes, String id, long time) {
        this.changes = changes;
        this.id = id;
        this.time = time;
    }

    public List<Change> changes() {
        return changes;
    }

    public void changes(List<Change> changes) {
        this.changes = changes;
    }

    public String id() {
        return id;
    }

    public void id(String id) {
        this.id = id;
    }

    public long time() {
        return time;
    }

    public void time(long time) {
        this.time = time;
    }

}
