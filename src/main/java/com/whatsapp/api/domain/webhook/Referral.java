package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Referral.
 *
 * @param videoUrl Added if media_type is “video”. Contains a URL to the video.
 * @param mediaType Media present in the ad or post the user clicked. Supported
 * values are "image" or "video".
 * @param imageUrl Added if media_type is “image”. Contains a URL to the raw
 * image.
 * @param sourceType Specifies the type of the ad's source. Supported values are
 * "ad" or "post".
 * @param sourceId Specifies the Meta ID for an ad or post.
 * @param body The description, or body, from the ad or post that generated the
 * message.
 * @param thumbnailUrl Added if media_type is “video”. Contains a URL to the
 * thumbnail image of the clicked video.
 * @param headline Specifies the headline used in the ad or post that generated
 * the message.
 * @param sourceUrl Specifies the URL that leads to the ad or post clicked by
 * the user. Opening this URL takes you to the ad viewed by your user.
 */
public class Referral {

    @JsonProperty("video_url")
    String videoUrl;

    @JsonProperty("media_type")
    String mediaType;

    @JsonProperty("image_url")
    String imageUrl;

    @JsonProperty("source_type")
    String sourceType;

    @JsonProperty("source_id")
    String sourceId;

    @JsonProperty("body")
    String body;

    @JsonProperty("thumbnail_url")
    String thumbnailUrl;

    @JsonProperty("headline")
    String headline;

    @JsonProperty("source_url")
    String sourceUrl;

    public Referral() {
    }

    public Referral(String videoUrl, String mediaType, String imageUrl, String sourceType, String sourceId, String body, String thumbnailUrl, String headline, String sourceUrl) {
        this.videoUrl = videoUrl;
        this.mediaType = mediaType;
        this.imageUrl = imageUrl;
        this.sourceType = sourceType;
        this.sourceId = sourceId;
        this.body = body;
        this.thumbnailUrl = thumbnailUrl;
        this.headline = headline;
        this.sourceUrl = sourceUrl;
    }

    public String videoUrl() {
        return videoUrl;
    }

    public void videoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String mediaType() {
        return mediaType;
    }

    public void mediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String imageUrl() {
        return imageUrl;
    }

    public void imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String sourceType() {
        return sourceType;
    }

    public void sourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String sourceId() {
        return sourceId;
    }

    public void sourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String body() {
        return body;
    }

    public void body(String body) {
        this.body = body;
    }

    public String thumbnailUrl() {
        return thumbnailUrl;
    }

    public void thumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String headline() {
        return headline;
    }

    public void headline(String headline) {
        this.headline = headline;
    }

    public String sourceUrl() {
        return sourceUrl;
    }

    public void sourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

}
