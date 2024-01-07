package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Referred product.
 */
public class ReferredProduct {

    @JsonProperty("catalog_id")
    String catalogId;

    @JsonProperty("product_retailer_id")
    String productRetailerId;

    public ReferredProduct(String catalogId, String productRetailerId) {
        this.catalogId = catalogId;
        this.productRetailerId = productRetailerId;
    }

    public String catalogId() {
        return catalogId;
    }

    public void catalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public String productRetailerId() {
        return productRetailerId;
    }

    public void productRetailerId(String productRetailerId) {
        this.productRetailerId = productRetailerId;
    }

}
