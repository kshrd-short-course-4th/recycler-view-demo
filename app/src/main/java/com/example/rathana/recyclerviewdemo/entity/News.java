package com.example.rathana.recyclerviewdemo.entity;

/**
 * Created by RATHANA on 1/14/2018.
 */

public class News {
    private int id;
    private String title;
    private String content;
    private int thumb;

    public News(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
    public News(int id, String title, String content, int thumb) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.thumb = thumb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String context) {
        this.content = content;
    }

    public int getThumb() {
        return thumb;
    }

    public void setThumb(int thumb) {
        this.thumb = thumb;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", context='" + content + '\'' +
                ", thumb=" + thumb +
                '}';
    }
}
