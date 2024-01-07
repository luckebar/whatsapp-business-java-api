package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The type Order.
 */
public class Order {

    @JsonProperty("catalog_id")
    String catalogId;

    @JsonProperty("product_items")
    List<Product> productItems;

    @JsonProperty("text")
    String text;

    public Order() {
    }

    public Order(String catalogId, List<Product> productItems, String text) {
        this.catalogId = catalogId;
        this.productItems = productItems;
        this.text = text;
    }

    public String catalogId() {
        return catalogId;
    }

    public void catalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public List<Product> productItems() {
        return productItems;
    }

    public void productItems(List<Product> productItems) {
        this.productItems = productItems;
    }

    public String text() {
        return text;
    }

    public void text(String text) {
        this.text = text;
    }

}
