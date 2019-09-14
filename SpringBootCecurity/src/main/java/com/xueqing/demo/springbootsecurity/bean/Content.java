package com.xueqing.demo.springbootsecurity.bean;

public class Content {
    private int id;
    private String content_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent_name() {
        return content_name;
    }

    public void setContent_name(String content_name) {
        this.content_name = content_name;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", content_name='" + content_name + '\'' +
                '}';
    }
}
