package com.example.irankala.data.repository;

import android.content.Context;
import android.util.Log;

import com.example.irankala.data.network.IIranKalaService;
import com.example.irankala.data.network.RetrofitInstance;
import com.example.irankala.model.Product;
import com.example.irankala.ui.fragment.HomeFragment;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Repository {

    //region defins statics
    private static Repository sRepository;

    public static Repository getInstance(Context context){
        if (sRepository==null){
            sRepository=new Repository(context);
        }
        return sRepository;
    }

    //endregion

    Context mContext;

    IIranKalaService mIranKalaService;

    private Repository(Context context){
        mContext=context;



        Retrofit retrofit= RetrofitInstance.getInstance();
        mIranKalaService=retrofit.create(IIranKalaService.class);
    }

    public List<Product> getProduct(){
        Call<List<Product>> call=mIranKalaService.getProducts(RetrofitInstance.METHODS);

        try {
            Response<List<Product>> execute = call.execute();
            return execute.body();
        } catch (IOException e) {
            Log.e(HomeFragment.TAG,"crashed");
        }

        return null;
    }

}
