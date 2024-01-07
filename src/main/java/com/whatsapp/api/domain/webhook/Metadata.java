package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Metadata.
 *
 * @param phoneNumberId The ID of the phone number receiving the Webhooks. You
 * can use this phone_number_id to send messages back to customers.
 * @param displayPhoneNumber The phone number of the business account that is
 * receiving the Webhooks.
 */
public class Metadata {

    /*
The ID of the phone number receiving the Webhooks. You can use this phone_number_id to send messages back to customers.
     */
    @JsonProperty("phone_number_id")
    String phoneNumberId;
    /*
The phone number of the business account that is receiving the Webhooks.
     */
    @JsonProperty("display_phone_number")
    String displayPhoneNumber;

    public Metadata() {
    }

    public Metadata(String phoneNumberId, String displayPhoneNumber) {
        this.phoneNumberId = phoneNumberId;
        this.displayPhoneNumber = displayPhoneNumber;
    }

    public String phoneNumberId() {
        return phoneNumberId;
    }

    public void phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    public String displayPhoneNumber() {
        return displayPhoneNumber;
    }

    public void displayPhoneNumber(String displayPhoneNumber) {
        this.displayPhoneNumber = displayPhoneNumber;
    }

}
