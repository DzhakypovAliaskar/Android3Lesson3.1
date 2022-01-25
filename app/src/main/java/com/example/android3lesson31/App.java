package com.example.android3lesson31;

import android.app.Application;

import com.example.android3lesson31.data.apiservice.ApiService;
import com.example.android3lesson31.data.remote.RetrofitClient;
import com.example.android3lesson31.data.repositories.WeatherRepositories;

import dagger.hilt.android.HiltAndroidApp;

@HiltAndroidApp
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
