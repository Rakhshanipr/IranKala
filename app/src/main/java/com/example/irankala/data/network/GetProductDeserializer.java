package com.example.irankala.data.network;

import com.example.irankala.model.Product;
import com.example.irankala.model.ProductCategory;
import com.example.irankala.model.ProductImage;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GetProductDeserializer implements JsonDeserializer<List<Product>> {

    @Override
    public List<Product> deserialize(JsonElement json
            , Type typeOfT
            , JsonDeserializationContext context) throws JsonParseException {

        JsonArray jsonArray = json.getAsJsonArray();
        List<Product> productList = new ArrayList<>();

        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject object = jsonArray.get(i).getAsJsonObject();

            String id = object.get("id").getAsString();
            String name = object.get("name").getAsString();
            String description = object.get("description").getAsString();
            String price = object.get("price").getAsString();
            String reqular_price = object.get("regular_price").getAsString();
            String average_rating = object.get("average_rating").getAsString();
            String rating_count = object.get("rating_count").getAsString();

            //region ListImages
            JsonArray images=object.getAsJsonArray("images");
            List<ProductImage> imageList=new ArrayList<>();

            for (int j=0;j<images.size();j++){

                JsonObject objectImage = images.get(j).getAsJsonObject();
                String imageSrc=objectImage.get("src").getAsString();
                if (imageSrc==null)
                    continue;

                String imageId= objectImage.get("id").getAsString();
                String imageName=objectImage.get("name").getAsString();
                ProductImage image=new ProductImage(imageId,imageName,imageSrc);
                imageList.add(image);
            }
            //endregion

            //region ListImages
            JsonArray categories=object.getAsJsonArray("categories");
            List<ProductCategory> categoryList=new ArrayList<>();

            for (int j=0;j<categories.size();j++){
                JsonObject objectcategory = categories.get(j).getAsJsonObject();
                String categoryId= objectcategory.get("id").getAsString();
                String categoryName=objectcategory.get("name").getAsString();
                ProductCategory category=new ProductCategory(categoryId,categoryName);
                categoryList.add(category);
            }
            //endregion

            Product product=new Product(name, id,description,price,reqular_price
                    ,average_rating,rating_count,imageList,categoryList);

            productList.add(product);

        }

        return productList;
    }
}