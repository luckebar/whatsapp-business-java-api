package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Image.
 *
 * @param sha256 The checksum of the media.
 * @param mimeType The mime type of the media.
 * @param caption Added to Webhooks if it has been previously specified. The
 * caption that describes the media.
 * @param id The ID of the medi
 */
public class Image {

    @JsonProperty("sha256")
    String sha256;

    @JsonProperty("mime_type")
    String mimeType;

    @JsonProperty("caption")
    String caption;

    @JsonProperty("id")
    String id;

    public Image(String sha256, String mimeType, String caption, String id) {
        this.sha256 = sha256;
        this.mimeType = mimeType;
        this.caption = caption;
        this.id = id;
    }

    public String sha256() {
        return sha256;
    }

    public void sha256(String sha256) {
        this.sha256 = sha256;
    }

    public String mimeType() {
        return mimeType;
    }

    public void mimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String caption() {
        return caption;
    }

    public void caption(String caption) {
        this.caption = caption;
    }

    public String id() {
        return id;
    }

    public void id(String id) {
        this.id = id;
    }

}
