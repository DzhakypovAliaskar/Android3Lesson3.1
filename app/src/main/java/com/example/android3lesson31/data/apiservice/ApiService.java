package com.example.android3lesson31.data.apiservice;

import com.example.android3lesson31.models.WeatherModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("weather")
    Call<WeatherModel> getWeather(
            @Query("q") String q,
            @Query("appid") String appid,
            @Query("units") String units
    );
}
