package com.example.testing.myapp;

import android.graphics.Bitmap;

public class ListItem {

    private String type;
    private String title;
    private String content;
    private Bitmap image;

    public String getName() {
        return type;
    }

    public void setName(String name) {
        this.type = type;
    }

    public void getContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return title;
    }

    public void setUrl(String url) {
        this.title = title;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

}
