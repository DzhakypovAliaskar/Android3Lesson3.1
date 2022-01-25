package com.example.android3lesson31.ui.fragment.weather;

import androidx.lifecycle.MutableLiveData;

import com.example.android3lesson31.base.BaseViewModel;
import com.example.android3lesson31.data.repositories.WeatherRepositories;
import com.example.android3lesson31.models.WeatherModel;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class WeatherViewModel extends BaseViewModel {

    String city = "Bishkek";
    private WeatherRepositories repository;

    @Inject
    public WeatherViewModel(WeatherRepositories repository) {
        this.repository = repository;
    }

    MutableLiveData<WeatherModel> getWeather(String city) {
        return repository.getWeather(city);
    }
}
