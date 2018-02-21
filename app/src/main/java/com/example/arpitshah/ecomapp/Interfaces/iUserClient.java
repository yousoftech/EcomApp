package com.example.arpitshah.ecomapp.Interfaces;

import com.example.arpitshah.ecomapp.pojo.Category;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Admin on 21-02-2018.
 */

public interface iUserClient {

    @GET("/getall")
    Call<List<Category>> getTasks();
}
