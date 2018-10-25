package com.example.aalap.cobaltdocuments

import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*

interface RetrofitAPIService {


    @FormUrlEncoded
    @Headers("Accept: application/json")
    @POST
    fun authenticate(
        @Url url: String, //url
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("deviceId") deviceId: String,
        @Field("userAgent") applicationName: String,
        @Field("userAgentVersion") appVersionCode: String,
        @Field("userOs") userOs: String,
        @Field("userOsVersion") userOsVersion: String
    ): Observable<Response<ResponseBody>>


    @Headers("Accept: application/json")
    @GET
    fun getMobileAccess(@Url url: String): Observable<Response<ResponseBody>>

}