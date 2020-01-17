package com.example.intprepfinal;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.os.Bundle;

import com.example.intprepfinal.data.GsonCatFacts;
import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends AppCompatActivity {
final String BASE_URL ="https://cat-fact.herokuapp.com/";
 Api service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initApiCall();
    }
    private void initApiCall() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();

    service = retrofit.create(Api.class);
    service.getCatFactList().enqueue(new Callback<GsonCatFacts>() {
        @Override
        public void onResponse(Call<GsonCatFacts> call, Response<GsonCatFacts> response) {
            response.body().getAll();
        }

        @Override
        public void onFailure(Call<GsonCatFacts> call, Throwable t) {

        }
    });

    }
}
