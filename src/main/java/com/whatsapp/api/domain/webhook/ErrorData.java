package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Error data.
 */
public class ErrorData {

    @JsonProperty("details")
    String details;

    public ErrorData(String details) {
        this.details = details;
    }

    public String details() {
        return details;
    }

    public void details(String details) {
        this.details = details;
    }

}
