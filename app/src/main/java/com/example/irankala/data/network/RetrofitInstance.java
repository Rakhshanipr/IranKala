package com.example.irankala.data.network;

import com.example.irankala.model.Product;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    public static final String BASE_PATH="https://woocommerce.maktabsharif.ir/wp-json/wc/v3/";

    public static final String CONSUMER_KEY="ck_23cd258c7b39b4820c4014c9d6be6448bb4f2264";
    public static final String CONSUMER_SECRET="cs_1d3857709fc7b5c874fcec577cf601f9f00600cc";

    public static Map<String,String> METHODS=new HashMap<String,String>(){{
       put("consumer_key",CONSUMER_KEY);
       put("consumer_secret",CONSUMER_SECRET);
    }};

    public static Retrofit getInstance(){

        Type type=new TypeToken<List<Product>>(){}.getType();
        Object typeAdapter=new GetProductDeserializer();


        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(BASE_PATH)
                .addConverterFactory(createGsonFactory(type,typeAdapter))
                .build();

        return retrofit;
    }

    public static Converter.Factory createGsonFactory(Type type,Object typeAdapter){
        GsonBuilder builder=new GsonBuilder()
                .registerTypeAdapter(type,typeAdapter);

        Gson gson= builder.create();
        return GsonConverterFactory.create(gson);
    }

}