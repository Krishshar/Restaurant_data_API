package com.example.kritesh.restaurant_data_api;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by kritesh on 29/7/18.
 */

public interface APIrefrence {
    @POST("/posts")
    @FormUrlEncoded
    Call<Post> savePost(@Field("fname") String fname,
                        @Field("lname") String lname,
                        @Field("phno") String phno,
                        @Field("add") String add,
                        @Field("resname") String resname,
                        @Field("restype") String restype,
                        @Field("userID") long userID);
}
