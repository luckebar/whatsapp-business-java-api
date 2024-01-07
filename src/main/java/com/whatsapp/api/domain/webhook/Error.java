package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Error.
 */
public class Error {

    @JsonProperty("code")
    int code;

    @JsonProperty("title")
    String title;

    @JsonProperty("message")
    String message;

    @JsonProperty("error_data")
    ErrorData errorData;
    @JsonProperty("href")
    String href;

    public Error(int code, String title, String message, ErrorData errorData, String href) {
        this.code = code;
        this.title = title;
        this.message = message;
        this.errorData = errorData;
        this.href = href;
    }

    public int code() {
        return code;
    }

    public void code(int code) {
        this.code = code;
    }

    public String title() {
        return title;
    }

    public void title(String title) {
        this.title = title;
    }

    public String message() {
        return message;
    }

    public void message(String message) {
        this.message = message;
    }

    public ErrorData errorData() {
        return errorData;
    }

    public void errorData(ErrorData errorData) {
        this.errorData = errorData;
    }

    public String href() {
        return href;
    }

    public void href(String href) {
        this.href = href;
    }

}
