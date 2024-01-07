package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.messages.type.MessageType;

import java.util.List;

/**
 * The type Message.
 *
 * @param reaction A reaction object. See {@link Reaction}
 * @param image A media object with the image information. Added to Webhook if
 * type is image. See {@link Image}
 * @param sticker A media object with the sticker information. Added to Webhook
 * if type is sticker. See {@link Sticker}
 * @param location Location
 * @param contacts Contacts
 * @param button Added to Webhook if type is button. This field is used when the
 * Webhook notifies you that a user clicked on a quick reply button. See
 * {@link Button}
 * @param context Added to Webhook if message is forwarded or an inbound reply.
 * See {@link Context}
 * @param from The customer's phone number.
 * @param id The unique identifier of incoming message, you can use messages
 * endpoint to mark it as read.
 * @param text A text object. Added to Webhook if type is text. See {@link Text}
 * @param errors Added to Webhook if type is unknown. See {@link Error}
 * @param type Supported values are:                                <ul>                      <li>text: for text messages.</li>
 *                      <li>image: for image (media) messages.</li>
 *                      <li>interactive: for interactive messages.</li>
 *                      <li>document: for document (media) messages.</li>
 *                      <li>audio: for audio and voice (media) messages.</li>
 *                      <li>sticker: for sticker messages.</li>                      <li>order: for
 * when a customer has placed an order.</li>                      <li>video: for video (media)
 * messages.</li>                      <li>button: for responses to interactive message
 * templates.</li>                      <li>contacts: for contact messages.</li>                      <li>location: for
 * location messages.</li>                      <li>unknown: for unknown messages.</li>                      <li>system:
 * for user number change messages.</li>                    </ul>
 * @param interactive When a customer has interacted with your message, an
 * interactive object is included in the {@link Message} object
 * @param timestamp The timestamp when a customer sends a message.
 * @param referral Added to Webhook if the message is coming from a user that
 * clicked an ad that is Click To WhatsApp. A referral object. This is how the
 * referral object works:<ul>                    <li>A user clicks on an ad with the Click to
 * WhatsApp call-to-action.</li>                    <li>User is redirected to WhatsApp and sends a
 * message to the advertising business.</li>                    <li>User sends a message to the
 * business. Be aware that users may elect to remove their referral data.</li>
 *                    <li>The advertising business gets an inbound message
 * notification including the referral object, which provides additional context
 * on the ad that triggered the message. Knowing all this information, the
 * business can appropriately reply to the user message.</li></ul>
 * @param order Included in the Messages object when a customer has placed an
 * order. See {@link Order}
 * @param system Added to Webhook if type is system. See {@link System}
 * @param video A media object with the video information. Added to Webhook if
 * type is video. See {@link Video}
 * @param audio A media object with the audio information. Added to Webhook if
 * type is audio (including voice messages). See {@link Audio}
 * @param document A media object with the document information. Added to
 * Webhook if type is document. See {@link Document}
 */
public class Message {

    @JsonProperty("reaction")
    Reaction reaction;

    @JsonProperty("image")
    Image image;

    @JsonProperty("sticker")
    Sticker sticker;

    @JsonProperty("location")
    Location location;

    @JsonProperty("contacts")
    List<Contact> contacts;

    @JsonProperty("button")
    Button button;

    @JsonProperty("context")
    Context context;

    @JsonProperty("from")
    String from;

    @JsonProperty("id")
    String id;

    @JsonProperty("text")
    Text text;

    @JsonProperty("errors")
    List<Error> errors;

    @JsonProperty("type")
    MessageType type;

    @JsonProperty("interactive")
    Interactive interactive;

    @JsonProperty("timestamp")
    String timestamp;

    @JsonProperty("referral")
    Referral referral;

    @JsonProperty("order")
    Order order;

    @JsonProperty("system")
    System system;

    @JsonProperty("video")
    Video video;

    @JsonProperty("audio")
    Audio audio;

    @JsonProperty("document")
    Document document;

    public Message(Reaction reaction, Image image, Sticker sticker, Location location, List<Contact> contacts, Button button, Context context, String from, String id, Text text, List<Error> errors, MessageType type, Interactive interactive, String timestamp, Referral referral, Order order, System system, Video video, Audio audio, Document document) {
        this.reaction = reaction;
        this.image = image;
        this.sticker = sticker;
        this.location = location;
        this.contacts = contacts;
        this.button = button;
        this.context = context;
        this.from = from;
        this.id = id;
        this.text = text;
        this.errors = errors;
        this.type = type;
        this.interactive = interactive;
        this.timestamp = timestamp;
        this.referral = referral;
        this.order = order;
        this.system = system;
        this.video = video;
        this.audio = audio;
        this.document = document;
    }

    public Reaction reaction() {
        return reaction;
    }

    public void reaction(Reaction reaction) {
        this.reaction = reaction;
    }

    public Image image() {
        return image;
    }

    public void image(Image image) {
        this.image = image;
    }

    public Sticker sticker() {
        return sticker;
    }

    public void sticker(Sticker sticker) {
        this.sticker = sticker;
    }

    public Location location() {
        return location;
    }

    public void location(Location location) {
        this.location = location;
    }

    public List<Contact> contacts() {
        return contacts;
    }

    public void contacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public Button button() {
        return button;
    }

    public void button(Button button) {
        this.button = button;
    }

    public Context context() {
        return context;
    }

    public void context(Context context) {
        this.context = context;
    }

    public String from() {
        return from;
    }

    public void from(String from) {
        this.from = from;
    }

    public String id() {
        return id;
    }

    public void id(String id) {
        this.id = id;
    }

    public Text text() {
        return text;
    }

    public void text(Text text) {
        this.text = text;
    }

    public List<Error> errors() {
        return errors;
    }

    public void errors(List<Error> errors) {
        this.errors = errors;
    }

    public MessageType type() {
        return type;
    }

    public void type(MessageType type) {
        this.type = type;
    }

    public Interactive interactive() {
        return interactive;
    }

    public void interactive(Interactive interactive) {
        this.interactive = interactive;
    }

    public String timestamp() {
        return timestamp;
    }

    public void timestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Referral referral() {
        return referral;
    }

    public void referral(Referral referral) {
        this.referral = referral;
    }

    public Order order() {
        return order;
    }

    public void order(Order order) {
        this.order = order;
    }

    public System system() {
        return system;
    }

    public void system(System system) {
        this.system = system;
    }

    public Video video() {
        return video;
    }

    public void video(Video video) {
        this.video = video;
    }

    public Audio audio() {
        return audio;
    }

    public void audio(Audio audio) {
        this.audio = audio;
    }

    public Document document() {
        return document;
    }

    public void document(Document document) {
        this.document = document;
    }

}
