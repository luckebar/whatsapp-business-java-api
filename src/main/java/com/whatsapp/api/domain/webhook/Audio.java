package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Audio.
 *
 * @param sha256 The checksum of the media.
 * @param mimeType The mime type of the media. The caption that describes the
 * media.
 * @param id The ID of the medi
 */
public class Audio {

    @JsonProperty("mime_type")
    String mimeType;

    @JsonProperty("sha256")
    String sha256;

    @JsonProperty("id")
    String id;

    @JsonProperty("voice")
    boolean voice;

    public Audio(String mimeType, String sha256, String id, boolean voice) {
        this.mimeType = mimeType;
        this.sha256 = sha256;
        this.id = id;
        this.voice = voice;
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

    public boolean voice() {
        return voice;
    }

    public void voice(boolean voice) {
        this.voice = voice;
    }

}
