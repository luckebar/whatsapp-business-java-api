package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Disable info.
 */
public class DisableInfo {

    @JsonProperty("disable_date")
    String disableDate;

    public DisableInfo(String disableDate) {
        this.disableDate = disableDate;
    }

    public String disableDate() {
        return disableDate;
    }

    public void disableDate(String disableDate) {
        this.disableDate = disableDate;
    }

}
