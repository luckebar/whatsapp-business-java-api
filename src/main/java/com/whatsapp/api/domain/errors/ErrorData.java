package com.whatsapp.api.domain.errors;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Error data.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorData {

    @JsonProperty("messaging_product")
    String messagingProduct;
    @JsonProperty("details")
    String details;
    @JsonProperty("blame_field_specs")
    Object blameFieldSpecs;

    public ErrorData() {
    }

    public ErrorData(String messagingProduct, String details, Object blameFieldSpecs) {
        this.messagingProduct = messagingProduct;
        this.details = details;
        this.blameFieldSpecs = blameFieldSpecs;
    }

    public String messagingProduct() {
        return messagingProduct;
    }

    public void messagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public String details() {
        return details;
    }

    public void details(String details) {
        this.details = details;
    }

    public Object blameFieldSpecs() {
        return blameFieldSpecs;
    }

    public void blameFieldSpecs(Object blameFieldSpecs) {
        this.blameFieldSpecs = blameFieldSpecs;
    }
    
    

}
