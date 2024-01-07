package com.whatsapp.api.domain.errors;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Whatsapp api error.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WhatsappApiError{
    @JsonProperty("error")
    Error error;

    public WhatsappApiError(Error error) {
        this.error = error;
    }

    public Error error() {
        return error;
    }

    public void error(Error error) {
        this.error = error;
    }
    
    
}
