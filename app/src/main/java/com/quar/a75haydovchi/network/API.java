package com.quar.a75haydovchi.network;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface API {

    @FormUrlEncoded
    @POST("quar/")
    Call<String> sendLocation(@Field("param") String params);



}
