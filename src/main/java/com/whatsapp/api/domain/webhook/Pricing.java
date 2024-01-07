package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Pricing.
 *
 * @param pricingModel Type of pricing model being used. Current supported
 * values are:<ul>                     <li>"CBP" (conversation-based pricing): See
 * Conversation-Based Pricing for rates based on recipient country.</li>
 *                     <li>"NBP" (notification-based pricing): Notifications are
 * also known as Template Messages (click here for details on pricing).</li>
 *                     </ul> This pricing model will be deprecated in a future
 * release early 2022.
 */
public class Pricing {

    @JsonProperty("pricing_model")
    String pricingModel;

    @JsonProperty("category")
    String category;

    @JsonProperty("billable")
    boolean billable;

    public Pricing(String pricingModel, String category, boolean billable) {
        this.pricingModel = pricingModel;
        this.category = category;
        this.billable = billable;
    }

    public String pricingModel() {
        return pricingModel;
    }

    public void pricingModel(String pricingModel) {
        this.pricingModel = pricingModel;
    }

    public String category() {
        return category;
    }

    public void category(String category) {
        this.category = category;
    }

    public boolean billable() {
        return billable;
    }

    public void billable(boolean billable) {
        this.billable = billable;
    }

}
