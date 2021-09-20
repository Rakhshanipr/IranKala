package com.example.irankala.data.network;

import java.util.HashMap;
import java.util.Map;

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
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(BASE_PATH)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
}