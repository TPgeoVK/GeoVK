package ru.iojs.geovk.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sibirsky on 13.09.17.
 */

public class RetrofitFactory {

    private RetrofitFactory() { }

    private final static Retrofit RETROFIT_INSTANCE = new Retrofit.Builder()
            .baseUrl("https://tpgeovk-backend.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static Retrofit getApi() {
        return RETROFIT_INSTANCE;
    }

}
