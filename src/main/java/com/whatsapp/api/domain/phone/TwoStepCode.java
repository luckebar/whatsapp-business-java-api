package com.whatsapp.api.domain.phone;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Two-Step Code
 *
 * @param pin Required. A 6-digit PIN you wish to use for two-step verification.
 */
public class TwoStepCode {

    @JsonProperty("pin")
    String pin;

    public TwoStepCode() {
    }

    public TwoStepCode(String pin) {
        this.pin = pin;
    }

    public String pin() {
        return pin;
    }

    public void pin(String pin) {
        this.pin = pin;
    }

}
