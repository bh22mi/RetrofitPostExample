package com.example.bhoomi.retrofitpostexample;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {

    @POST("userlogin/")
    @FormUrlEncoded
    Call<Response> getData(@Field("email") String email, @Field("password") String password);
}
