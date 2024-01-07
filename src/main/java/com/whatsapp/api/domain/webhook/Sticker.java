package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Sticker.
 *
 * @param sha256 The checksum of the media.
 * @param mimeType The mime type of the media. The caption that describes the
 * media.
 * @param id The ID of the medi
 */
public class Sticker {

    @JsonProperty("sha256")
    String sha256;

    @JsonProperty("mime_type")
    String mimeType;

    @JsonProperty("id")
    String id;

    @JsonProperty("animated")
    boolean animated;

    public Sticker() {
    }

    public Sticker(String sha256, String mimeType, String id, boolean animated) {
        this.sha256 = sha256;
        this.mimeType = mimeType;
        this.id = id;
        this.animated = animated;
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

    public String id() {
        return id;
    }

    public void id(String id) {
        this.id = id;
    }

    public boolean animated() {
        return animated;
    }

    public void animated(boolean animated) {
        this.animated = animated;
    }

}
