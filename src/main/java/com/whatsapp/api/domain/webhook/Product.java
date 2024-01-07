package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Product.
 */
public class Product {

    @JsonProperty("quantity")
    String quantity;

    @JsonProperty("product_retailer_id")
    String productRetailerId;

    @JsonProperty("item_price")
    String itemPrice;

    @JsonProperty("currency")
    String currency;

    public Product() {
    }

    public Product(String quantity, String productRetailerId, String itemPrice, String currency) {
        this.quantity = quantity;
        this.productRetailerId = productRetailerId;
        this.itemPrice = itemPrice;
        this.currency = currency;
    }

    public String quantity() {
        return quantity;
    }

    public void quantity(String quantity) {
        this.quantity = quantity;
    }

    public String productRetailerId() {
        return productRetailerId;
    }

    public void productRetailerId(String productRetailerId) {
        this.productRetailerId = productRetailerId;
    }

    public String itemPrice() {
        return itemPrice;
    }

    public void itemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String currency() {
        return currency;
    }

    public void currency(String currency) {
        this.currency = currency;
    }

}
