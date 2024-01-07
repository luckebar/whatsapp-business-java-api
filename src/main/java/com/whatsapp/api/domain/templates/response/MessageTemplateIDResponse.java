package com.whatsapp.api.domain.templates.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Message template id response.
 *
 * @deprecated use {@link com.whatsapp.api.domain.templates.MessageTemplate}
 * instead
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageTemplateIDResponse {

    @JsonProperty("id")
    String id;

    public MessageTemplateIDResponse() {
    }

    public MessageTemplateIDResponse(String id) {
        this.id = id;
    }

    public String id() {
        return id;
    }

    public void id(String id) {
        this.id = id;
    }

}
