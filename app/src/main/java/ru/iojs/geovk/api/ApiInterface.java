package ru.iojs.geovk.api;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by sibirsky on 13.09.17.
 */

public interface ApiInterface {

    @POST("/places/predict")
    Call<Place> predictPlace(@Query("userId") Integer userId,
                             @Query("latitude") Float latitude,
                             @Query("longitude") Float longitude,
                             @Query("text") String text);
}
