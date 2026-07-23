package com.devmind.meteo.kmp.data.repository

import com.devmind.meteo.kmp.data.api.WeatherApiClient
import com.devmind.meteo.kmp.data.api.WeatherResponse

class WeatherRepository(private val apiClient: WeatherApiClient) {
    suspend fun getWeather(city: String): WeatherResponse = apiClient.getWeather(city)
}
