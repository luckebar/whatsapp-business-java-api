package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Interactive.
 *
 * @param listReply Used on Webhooks related to List Messages Contains a list
 * {@link ListReply} object.
 * @param type Contains the type of interactive object. Supported options
 * are:<ul>                    <li>button_reply: for responses of Reply Buttons.</li>
 *                    <li>list_reply: for responses to List Messages and other
 * interactive objects.</li></ul>
 * @param buttonReply Used on Webhooks related to Reply Buttons. Contains a
 * {@link ButtonReply} reply object.
 */
public class Interactive {

    @JsonProperty("list_reply")
    ListReply listReply;

    @JsonProperty("type")
    String type;

    @JsonProperty("button_reply")
    ButtonReply buttonReply;

    public Interactive() {
    }

    public Interactive(ListReply listReply, String type, ButtonReply buttonReply) {
        this.listReply = listReply;
        this.type = type;
        this.buttonReply = buttonReply;
    }

    public ListReply listReply() {
        return listReply;
    }

    public void listReply(ListReply listReply) {
        this.listReply = listReply;
    }

    public String type() {
        return type;
    }

    public void type(String type) {
        this.type = type;
    }

    public ButtonReply buttonReply() {
        return buttonReply;
    }

    public void buttonReply(ButtonReply buttonReply) {
        this.buttonReply = buttonReply;
    }
    
}
