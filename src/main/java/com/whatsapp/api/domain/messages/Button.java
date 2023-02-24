
package com.whatsapp.api.domain.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.messages.type.ButtonType;


/**
 * <p>Required for Reply Buttons.</p>
 *
 * <p>A button object can contain the following parameters:</p>
 *
 * <ul>
 *     <li><b>type:</b> only supported type is reply</li>
 *     <li><b>reply:</b> required for Reply Buttons</li>
 * </ul>
 * <p>You can have up to 3 buttons. You cannot have leading or trailing spaces when setting the ID.</p>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Button {

    @JsonProperty("type")
    public ButtonType type;
    @JsonProperty("reply")
    public Reply reply;

    public ButtonType getType() {
        return type;
    }

    public Button setType(ButtonType type) {
        this.type = type;
        return this;
    }

    public Reply getReply() {
        return reply;
    }

    public Button setReply(Reply reply) {
        this.reply = reply;
        return this;
    }
}