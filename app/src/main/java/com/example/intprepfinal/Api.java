package com.example.intprepfinal;

import com.example.intprepfinal.data.GsonCatFacts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
@GET("facts")
Call<GsonCatFacts> getCatFactList();
}
