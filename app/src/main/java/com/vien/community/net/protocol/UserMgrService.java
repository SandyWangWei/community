package com.vien.community.net.protocol;

import com.vien.community.database.entity.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by VienWang on 2020/11/22
 * Describe:login for user
 */
interface UserMgrService {

    @POST("login")
    @FormUrlEncoded
    Call<User> login(@Field("username") String username, @Field("password") String password);
}
