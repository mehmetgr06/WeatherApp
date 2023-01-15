package com.example.weatherapp.data.remote

import com.example.weatherapp.data.remote.model.WeatherDto
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET(GET_WEATHER_ENDPOINT)
    suspend fun getWeatherData(
        @Query("latitude") latitude: Double,
        @Query("longitude") longitude: Double
    ): WeatherDto

    companion object {
        private const val GET_WEATHER_ENDPOINT =
            "v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl"
    }
}
