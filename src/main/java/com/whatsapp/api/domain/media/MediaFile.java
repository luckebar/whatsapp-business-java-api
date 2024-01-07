package com.whatsapp.api.domain.media;

/**
 * @param fileName file name
 * @param content  file content
 */
public class MediaFile {
    public String fileName;
    public byte[] content;

    public MediaFile(String fileName, byte[] content) {
        this.fileName = fileName;
        this.content = content;
    }

    public String fileName() {
        return fileName;
    }

    public void fileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] content() {
        return content;
    }

    public void content(byte[] content) {
        this.content = content;
    }
    
    
}
