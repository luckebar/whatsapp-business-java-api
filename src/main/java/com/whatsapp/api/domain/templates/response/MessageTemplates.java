package com.whatsapp.api.domain.templates.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.response.Paging;

import java.util.List;

/**
 * The type Message templates.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageTemplates {

    @JsonProperty("data")
    List<Template> data;

    @JsonProperty("paging")
    Paging paging;

    public MessageTemplates(List<Template> data, Paging paging) {
        this.data = data;
        this.paging = paging;
    }

    public List<Template> data() {
        return data;
    }

    public void data(List<Template> data) {
        this.data = data;
    }

    public Paging paging() {
        return paging;
    }

    public void paging(Paging paging) {
        this.paging = paging;
    }

}
