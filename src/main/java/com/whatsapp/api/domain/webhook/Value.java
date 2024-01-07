package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.webhook.type.EventType;

import java.util.List;

/**
 * The type Value.
 *
 * @param metadata The metadata about your phone number.
 * @param messagingProduct The messaging service used for Webhooks. For WhatsApp
 * messages, this value needs to be set to “whatsapp”.
 * @param messages An array of message objects. Added to Webhooks for incoming
 * message notifications.
 * @param contacts An array of contacts
 * @param statuses An array of message status objects. Added to Webhooks for
 * message status update.
 * @param decision Used if a decision about accounts or phone numbers has been
 * made. (APPROVED or REJECTED)
 * @param displayPhoneNumber Includes the display phone number of the business
 * account that triggered the notification.
 * @param event Used when an event happened in a specific WABA. See
 * {@link EventType}
 * @param messageTemplateId The message template ID
 * @param messageTemplateLanguage The message template language
 * @param messageTemplateName The message template name
 * @param phoneNumber the phone number
 * @param reason reason
 * @param rejectionReason If a request was rejected, this field displays the
 * reason for that rejection.
 * @param requestedVerifiedName This field displays the name that was sent to be
 * verified.
 */
public class Value {

    @JsonProperty("metadata")
    Metadata metadata;

    @JsonProperty("messaging_product")
    String messagingProduct;

    @JsonProperty("messages")
    List<Message> messages;

    @JsonProperty("contacts")
    List<Contact> contacts;

    @JsonProperty("statuses")
    List<Status> statuses;

    @JsonProperty("event")
    EventType event;

    @JsonProperty("phone_number")
    String phoneNumber;

    @JsonProperty("message_template_id")
    String messageTemplateId;

    @JsonProperty("message_template_name")
    String messageTemplateName;

    @JsonProperty("message_template_language")
    String messageTemplateLanguage;

    @JsonProperty("reason")
    String reason;

    @JsonProperty("display_phone_number")
    String displayPhoneNumber;
    @JsonProperty("decision")
    String decision;

    @JsonProperty("requested_verified_name")
    String requestedVerifiedName;

    @JsonProperty("rejection_reason")
    Object rejectionReason;

    @JsonProperty("disable_info")
    DisableInfo disableInfo;

    @JsonProperty("current_limit")
    String currentLimit;

    @JsonProperty("ban_info")
    BanInfo banInfo;

    @JsonProperty("restriction_info")
    List<RestrictionInfo> restrictionInfo;

    public Value(Metadata metadata, String messagingProduct, List<Message> messages, List<Contact> contacts, List<Status> statuses, EventType event, String phoneNumber, String messageTemplateId, String messageTemplateName, String messageTemplateLanguage, String reason, String displayPhoneNumber, String decision, String requestedVerifiedName, Object rejectionReason, DisableInfo disableInfo, String currentLimit, BanInfo banInfo, List<RestrictionInfo> restrictionInfo) {
        this.metadata = metadata;
        this.messagingProduct = messagingProduct;
        this.messages = messages;
        this.contacts = contacts;
        this.statuses = statuses;
        this.event = event;
        this.phoneNumber = phoneNumber;
        this.messageTemplateId = messageTemplateId;
        this.messageTemplateName = messageTemplateName;
        this.messageTemplateLanguage = messageTemplateLanguage;
        this.reason = reason;
        this.displayPhoneNumber = displayPhoneNumber;
        this.decision = decision;
        this.requestedVerifiedName = requestedVerifiedName;
        this.rejectionReason = rejectionReason;
        this.disableInfo = disableInfo;
        this.currentLimit = currentLimit;
        this.banInfo = banInfo;
        this.restrictionInfo = restrictionInfo;
    }

    public Metadata metadata() {
        return metadata;
    }

    public void metadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String messagingProduct() {
        return messagingProduct;
    }

    public void messagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public List<Message> messages() {
        return messages;
    }

    public void messages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Contact> contacts() {
        return contacts;
    }

    public void contacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Status> statuses() {
        return statuses;
    }

    public void statuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    public EventType event() {
        return event;
    }

    public void event(EventType event) {
        this.event = event;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public void phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String messageTemplateId() {
        return messageTemplateId;
    }

    public void messageTemplateId(String messageTemplateId) {
        this.messageTemplateId = messageTemplateId;
    }

    public String messageTemplateName() {
        return messageTemplateName;
    }

    public void messageTemplateName(String messageTemplateName) {
        this.messageTemplateName = messageTemplateName;
    }

    public String messageTemplateLanguage() {
        return messageTemplateLanguage;
    }

    public void messageTemplateLanguage(String messageTemplateLanguage) {
        this.messageTemplateLanguage = messageTemplateLanguage;
    }

    public String reason() {
        return reason;
    }

    public void reason(String reason) {
        this.reason = reason;
    }

    public String displayPhoneNumber() {
        return displayPhoneNumber;
    }

    public void displayPhoneNumber(String displayPhoneNumber) {
        this.displayPhoneNumber = displayPhoneNumber;
    }

    public String decision() {
        return decision;
    }

    public void decision(String decision) {
        this.decision = decision;
    }

    public String requestedVerifiedName() {
        return requestedVerifiedName;
    }

    public void requestedVerifiedName(String requestedVerifiedName) {
        this.requestedVerifiedName = requestedVerifiedName;
    }

    public Object rejectionReason() {
        return rejectionReason;
    }

    public void rejectionReason(Object rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    public DisableInfo disableInfo() {
        return disableInfo;
    }

    public void disableInfo(DisableInfo disableInfo) {
        this.disableInfo = disableInfo;
    }

    public String currentLimit() {
        return currentLimit;
    }

    public void currentLimit(String currentLimit) {
        this.currentLimit = currentLimit;
    }

    public BanInfo banInfo() {
        return banInfo;
    }

    public void banInfo(BanInfo banInfo) {
        this.banInfo = banInfo;
    }

    public List<RestrictionInfo> restrictionInfo() {
        return restrictionInfo;
    }

    public void restrictionInfo(List<RestrictionInfo> restrictionInfo) {
        this.restrictionInfo = restrictionInfo;
    }

}
