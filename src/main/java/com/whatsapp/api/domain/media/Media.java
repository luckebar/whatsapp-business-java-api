package com.whatsapp.api.domain.media;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Media.
 */
public class Media {
    @JsonProperty("sha256") String sha256;

    @JsonProperty("mime_type") FileType mimeType;

    @JsonProperty("messaging_product") String messagingProduct;

    @JsonProperty("id") String id;

    @JsonProperty("url") String url;

    @JsonProperty("file_size") long fileSize;

    public Media() {
    }

    public Media(String sha256, FileType mimeType, String messagingProduct, String id, String url, long fileSize) {
        this.sha256 = sha256;
        this.mimeType = mimeType;
        this.messagingProduct = messagingProduct;
        this.id = id;
        this.url = url;
        this.fileSize = fileSize;
    }

    public String sha256() {
        return sha256;
    }

    public void sha256(String sha256) {
        this.sha256 = sha256;
    }

    public FileType mimeType() {
        return mimeType;
    }

    public void mimeType(FileType mimeType) {
        this.mimeType = mimeType;
    }

    public String messagingProduct() {
        return messagingProduct;
    }

    public void messagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public String id() {
        return id;
    }

    public void id(String id) {
        this.id = id;
    }

    public String url() {
        return url;
    }

    public void url(String url) {
        this.url = url;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void fileSize(long fileSize) {
        this.fileSize = fileSize;
    }
    
    
}