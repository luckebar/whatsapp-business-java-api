package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.webhook.type.RestrictionType;

/**
 * The type Restriction info.
 */
public class RestrictionInfo {

    @JsonProperty("restriction_type")
    RestrictionType restrictionType;

    @JsonProperty("expiration")
    String expiration;

    public RestrictionInfo() {
    }

    public RestrictionInfo(RestrictionType restrictionType, String expiration) {
        this.restrictionType = restrictionType;
        this.expiration = expiration;
    }

    public RestrictionType restrictionType() {
        return restrictionType;
    }

    public void restrictionType(RestrictionType restrictionType) {
        this.restrictionType = restrictionType;
    }

    public String expiration() {
        return expiration;
    }

    public void expiration(String expiration) {
        this.expiration = expiration;
    }

}
