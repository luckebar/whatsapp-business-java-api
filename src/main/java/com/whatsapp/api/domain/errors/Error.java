package com.whatsapp.api.domain.errors;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object representing errors from the whatsapp api
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Error {

    @JsonProperty("code")
    Integer code;
    @JsonProperty("details")
    String details;
    @JsonProperty("error_subcode") 
    Integer errorSubcode;
    @JsonProperty("fbtrace_id")
    String fbtraceId;
    @JsonProperty("message")
    @JsonAlias({"message"})
    String message;
    @JsonProperty("messaging_product")
    String messagingProduct;
    @JsonProperty("error_data")
    ErrorData errorData;
    @JsonProperty("type")
    String type;

    @JsonProperty("is_transient")
    Boolean isTransient;
    @JsonProperty("error_user_title")
    String errorUserSubtitle;
    @JsonProperty("error_user_msg")
    String errorUserMsg;

    public Error(Integer code, String details, Integer errorSubcode, String fbtraceId, String message, String messagingProduct, ErrorData errorData, String type, Boolean isTransient, String errorUserSubtitle, String errorUserMsg) {
        this.code = code;
        this.details = details;
        this.errorSubcode = errorSubcode;
        this.fbtraceId = fbtraceId;
        this.message = message;
        this.messagingProduct = messagingProduct;
        this.errorData = errorData;
        this.type = type;
        this.isTransient = isTransient;
        this.errorUserSubtitle = errorUserSubtitle;
        this.errorUserMsg = errorUserMsg;
    }

    public Integer code() {
        return code;
    }

    public void code(Integer code) {
        this.code = code;
    }

    public String details() {
        return details;
    }

    public void details(String details) {
        this.details = details;
    }

    public String fbtraceId() {
        return fbtraceId;
    }

    public void fbtraceId(String fbtraceId) {
        this.fbtraceId = fbtraceId;
    }

    public String message() {
        return message;
    }

    public void message(String message) {
        this.message = message;
    }

    public String messagingProduct() {
        return messagingProduct;
    }

    public void messagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public ErrorData errorData() {
        return errorData;
    }

    public void errorData(ErrorData errorData) {
        this.errorData = errorData;
    }

    public String type() {
        return type;
    }

    public void type(String type) {
        this.type = type;
    }

    public Boolean isTransient() {
        return isTransient;
    }

    public void isTransient(Boolean isTransient) {
        this.isTransient = isTransient;
    }

    public String errorUserSubtitle() {
        return errorUserSubtitle;
    }

    public void errorUserSubtitle(String errorUserSubtitle) {
        this.errorUserSubtitle = errorUserSubtitle;
    }

    public String errorUserMsg() {
        return errorUserMsg;
    }

    public void errorUserMsg(String errorUserMsg) {
        this.errorUserMsg = errorUserMsg;
    }
    
    
}
