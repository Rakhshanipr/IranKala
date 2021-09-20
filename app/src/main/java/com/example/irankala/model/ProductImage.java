package com.example.irankala.model;

public class ProductImage {
    private String mId;
    private String mName;
    private String mUrl;

    public ProductImage(String id, String name, String url) {
        mId = id;
        mName = name;
        mUrl = url;
    }

    public ProductImage() {
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }
}
