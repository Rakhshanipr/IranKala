package com.example.irankala.model;

import java.util.List;

public class Product {

    private String mName;
    private String mId;
    private String mDescription;
    private String mPrice;
    private String mRegularPrice;
    private String mAverageRating;
    private String mRatingCount;
    private List<ProductImage> mImages;
    private List<ProductCategory> mCategories;

    public Product() {
    }

    public Product(String name, String id, String description, String price, String regularPrice, String averageRating, String ratingCount, List<ProductImage> images,List<ProductCategory> categories) {
        mName = name;
        mId = id;
        mDescription = description;
        mPrice = price;
        mRegularPrice = regularPrice;
        mAverageRating = averageRating;
        mRatingCount = ratingCount;
        mImages = images;
        mCategories=categories;
    }

    public List<ProductCategory> getCategories() {
        return mCategories;
    }

    public void setCategories(List<ProductCategory> categories) {
        mCategories = categories;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String price) {
        mPrice = price;
    }

    public String getRegularPrice() {
        return mRegularPrice;
    }

    public void setRegularPrice(String regularPrice) {
        mRegularPrice = regularPrice;
    }

    public String getAverageRating() {
        return mAverageRating;
    }

    public void setAverageRating(String averageRating) {
        mAverageRating = averageRating;
    }

    public String getRatingCount() {
        return mRatingCount;
    }

    public void setRatingCount(String ratingCount) {
        mRatingCount = ratingCount;
    }

    public List<ProductImage> getImages() {
        return mImages;
    }

    public void setImages(List<ProductImage> images) {
        mImages = images;
    }
}