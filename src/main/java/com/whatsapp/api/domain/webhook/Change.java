package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.webhook.type.FieldType;

/**
 * Changes that triggered the Webhooks call.
 *
 * @param field A value object. Contains details of the changes related to the
 * specified field.
 * @param value Contains the type of notification you are getting on that
 * Webhook. Currently, the only option for this API is “messages”.
 */
public class Change {

    @JsonProperty("field")
    FieldType field;
    /*
A value object. Contains details of the changes related to the specified field.
     */
    @JsonProperty("value")
    Value value;

    public Change(FieldType field, Value value) {
        this.field = field;
        this.value = value;
    }

    public FieldType field() {
        return field;
    }

    public void field(FieldType field) {
        this.field = field;
    }

    public Value value() {
        return value;
    }

    public void value(Value value) {
        this.value = value;
    }

}
