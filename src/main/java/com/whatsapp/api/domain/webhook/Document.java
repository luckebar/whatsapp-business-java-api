package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * When messages type is set to document, this object is included in the
 * messages object.
 *
 * @param filename Name for the file on the sender's device
 * @param mimeType Mime type of the document file
 * @param sha256 Hash
 * @param id ID for the document
 * @param caption Caption for the document, if provided
 */
public class Document {

    @JsonProperty("filename")
    String filename;

    @JsonProperty("mime_type")
    String mimeType;

    @JsonProperty("sha256")
    String sha256;

    @JsonProperty("id")
    String id;

    @JsonProperty("caption")
    String caption;

    public Document() {
    }

    public Document(String filename, String mimeType, String sha256, String id, String caption) {
        this.filename = filename;
        this.mimeType = mimeType;
        this.sha256 = sha256;
        this.id = id;
        this.caption = caption;
    }

    public String filename() {
        return filename;
    }

    public void filename(String filename) {
        this.filename = filename;
    }

    public String mimeType() {
        return mimeType;
    }

    public void mimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String sha256() {
        return sha256;
    }

    public void sha256(String sha256) {
        this.sha256 = sha256;
    }

    public String id() {
        return id;
    }

    public void id(String id) {
        this.id = id;
    }

    public String caption() {
        return caption;
    }

    public void caption(String caption) {
        this.caption = caption;
    }

}
