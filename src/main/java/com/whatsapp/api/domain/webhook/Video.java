package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Video.
 *
 * @param sha256 The checksum of the media.
 * @param mimeType The mime type of the media. The caption that describes the
 * media.
 * @param caption Added to Webhooks if it has been previously specified. The
 * caption that describes the media.
 * @param id The ID of the medi
 */
public class Video {

    @JsonProperty("mime_type")
    String mimeType;

    @JsonProperty("sha256")
    String sha256;

    @JsonProperty("caption")
    String caption;

    @JsonProperty("id")
    String id;

    public Video(String mimeType, String sha256, String caption, String id) {
        this.mimeType = mimeType;
        this.sha256 = sha256;
        this.caption = caption;
        this.id = id;
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
