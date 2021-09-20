package com.example.irankala.data.network;

import com.example.irankala.model.Product;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface IIranKalaService {

    @GET("products/categories")
    Call<List<Product>> getCategories(@QueryMap Map<String,String> methods);

    @GET("products")
    Call<List<Product>> getProducts(@QueryMap Map<String,String> methods);
}
