package com.example.listviewapp;
import java.io.Serializable;

public class Item implements Serializable {
    private final String title;
    private final String subtitle;
    private final int imageResId; // For bonus image
    private final String info;

    public Item(String title, String subtitle, int imageResId, String info) {
        this.title = title;
        this.subtitle = subtitle;
        this.imageResId = imageResId;
        this.info = info;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getInfo() {
        return info;
    }

}