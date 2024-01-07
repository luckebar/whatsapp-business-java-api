package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Ban info.
 */
public class BanInfo {

    @JsonProperty("waba_ban_state")
    String wabaBanState;

    @JsonProperty("waba_ban_date")
    String wabaBanDate;

    public BanInfo() {
    }

    public BanInfo(String wabaBanState, String wabaBanDate) {
        this.wabaBanState = wabaBanState;
        this.wabaBanDate = wabaBanDate;
    }

    public String wabaBanState() {
        return wabaBanState;
    }

    public void wabaBanState(String wabaBanState) {
        this.wabaBanState = wabaBanState;
    }

    public String wabaBanDate() {
        return wabaBanDate;
    }

    public void wabaBanDate(String wabaBanDate) {
        this.wabaBanDate = wabaBanDate;
    }

}
