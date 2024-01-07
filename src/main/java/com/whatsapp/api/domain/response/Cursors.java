package com.whatsapp.api.domain.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Cursors.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cursors {

    @JsonProperty("before")
    String before;

    @JsonProperty("after")
    String after;

    public Cursors() {
    }

    public Cursors(String before, String after) {
        this.before = before;
        this.after = after;
    }

    public String before() {
        return before;
    }

    public void before(String before) {
        this.before = before;
    }

    public String after() {
        return after;
    }

    public void after(String after) {
        this.after = after;
    }

}
