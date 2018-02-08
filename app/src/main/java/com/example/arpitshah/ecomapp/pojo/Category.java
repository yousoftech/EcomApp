package com.example.arpitshah.ecomapp.pojo;

/**
 * Created by Admin on 09-02-2018.
 */

public class Category {

    public String CategoryImage;

    public String getCategoryDescription() {
        return CategoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        CategoryDescription = categoryDescription;
    }

    public String CategoryDescription;
    public String getCategoryImage() {
        return CategoryImage;
    }

    public void setCategoryImage(String categoryImage) {
        CategoryImage = categoryImage;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getCategoryPrice() {
        return CategoryPrice;
    }

    public void setCategoryPrice(String categoryPrice) {
        CategoryPrice = categoryPrice;
    }

    public String CategoryName;
    public String CategoryPrice;

}
