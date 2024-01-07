package com.whatsapp.api.domain.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Paging.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Paging {

    @JsonProperty("cursors")
    Cursors cursors;

    @JsonProperty("next")
    String next;

    public Paging() {
    }

    public Paging(Cursors cursors, String next) {
        this.cursors = cursors;
        this.next = next;
    }

    public Cursors cursors() {
        return cursors;
    }

    public void cursors(Cursors cursors) {
        this.cursors = cursors;
    }

    public String next() {
        return next;
    }

    public void next(String next) {
        this.next = next;
    }

}
