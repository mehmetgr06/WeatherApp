package com.example.weatherapp.domain.repository

import com.example.weatherapp.domain.model.WeatherInfo
import com.example.weatherapp.domain.util.Resource

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}