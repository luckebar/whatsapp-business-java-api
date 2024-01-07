package com.whatsapp.api.domain.phone;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Verify code.
 */
public class VerifyCode {

    @JsonProperty("code")
    String code;

    public VerifyCode(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }

    public void code(String code) {
        this.code = code;
    }

}
