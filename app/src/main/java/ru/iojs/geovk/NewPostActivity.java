package ru.iojs.geovk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ru.iojs.geovk.api.ApiInterface;
import ru.iojs.geovk.api.Place;
import ru.iojs.geovk.api.PlaceRequest;
import ru.iojs.geovk.api.RetrofitFactory;

public class NewPostActivity extends AppCompatActivity {

    private final ApiInterface vkGeoApi = RetrofitFactory.getApi().create(ApiInterface.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);

        predictPlace(305329040, 55.79692685F, 37.53768682F, "Ребятки, в мэйле круто");
    }

    private void predictPlace(Integer userId, Float latitude,
                              Float longitude, String text) {

        final Call<Place> call = vkGeoApi.predictPlace(
                new PlaceRequest(userId, latitude, longitude, text));
        call.enqueue(new Callback<Place>() {
            @Override
            public void onResponse(Call<Place> call, Response<Place> response) {
                if (response.body() != null) {
                    Log.d("NewPostActivity", response.body().toString());
                } else {
                    Log.d("NewPostActivity", "Returned place is null");
                }
            }

            @Override
            public void onFailure(Call<Place> call, Throwable t) {
                Log.d("NewPostActivity", "Error: " + t.getMessage());
            }
        });
    }
}
