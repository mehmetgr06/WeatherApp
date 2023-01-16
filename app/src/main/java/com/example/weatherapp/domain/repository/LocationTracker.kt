package com.example.weatherapp.domain.repository

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}
