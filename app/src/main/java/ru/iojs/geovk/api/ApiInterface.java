package ru.iojs.geovk.api;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by sibirsky on 13.09.17.
 */

public interface ApiInterface {

    @FormUrlEncoded
    @Headers("Content-type: application/json")
    @POST("/places/predict")
    Call<Place> predictPlace(@Field("userId") Integer userId,
                             @Field("latitude") Float latitude,
                             @Field("longitude") Float longitude,
                             @Field("text") String text);
}
