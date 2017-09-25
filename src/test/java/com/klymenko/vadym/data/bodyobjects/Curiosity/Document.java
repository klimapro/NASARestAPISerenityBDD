package com.klymenko.vadym.data.bodyobjects.Curiosity;

import java.util.List;

public class Document {
    private List<Photos> photos;
    public Document() {
    }

    public Document(List<Photos> photos) {
        this.photos = photos;
    }

    public List<Photos> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photos> photos) {
        this.photos = photos;
    }

    @Override
    public String toString() {
        return "Document{" +
                "photos=" + photos +
                '}';
    }


}
