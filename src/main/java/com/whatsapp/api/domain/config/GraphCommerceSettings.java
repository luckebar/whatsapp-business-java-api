package com.whatsapp.api.domain.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GraphCommerceSettings {
    @JsonProperty("data")
    public List<CommerceDataItem> data;

    public GraphCommerceSettings() {
    }
    
    public GraphCommerceSettings(List<CommerceDataItem> data) {
        this.data = data;
    }

    public List<CommerceDataItem> data() {
        return data;
    }

    public void data(List<CommerceDataItem> data) {
        this.data = data;
    }

}