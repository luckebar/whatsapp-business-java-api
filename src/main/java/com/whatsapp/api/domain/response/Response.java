package com.whatsapp.api.domain.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Message template success response.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    @JsonProperty("success")
    boolean success;

    public Response() {
    }

    public Response(boolean success) {
        this.success = success;
    }

    public boolean success() {
        return success;
    }

    public void success(boolean success) {
        this.success = success;
    }

}
