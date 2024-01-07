package com.whatsapp.api.domain.phone;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.response.Paging;

import java.util.List;

/**
 * The Object with PhoneNumbers
 *
 * @param data an objetc with a PhoneNumber list
 * @param paging paging
 */
public class PhoneNumbers {

    @JsonProperty("data")
    List<PhoneNumber> data;

    @JsonProperty("paging")
    Paging paging;

    public PhoneNumbers(List<PhoneNumber> data, Paging paging) {
        this.data = data;
        this.paging = paging;
    }

    public List<PhoneNumber> data() {
        return data;
    }

    public void data(List<PhoneNumber> data) {
        this.data = data;
    }

    public Paging paging() {
        return paging;
    }

    public void paging(Paging paging) {
        this.paging = paging;
    }

}
