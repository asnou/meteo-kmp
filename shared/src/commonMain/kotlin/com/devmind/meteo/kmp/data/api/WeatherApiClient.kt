package com.devmind.meteo.kmp.data.api

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class WeatherApiClient(
    private val apiKey: String,
    private val httpClient: HttpClient = HttpClient {
        install(ContentNegotiation) {
            json(
                Json {
                    ignoreUnknownKeys = true
                    isLenient = true
                }
            )
        }
    },
) {
    suspend fun getWeather(city: String): WeatherResponse {
        try {
            return httpClient.get("$BASE_URL/$city") {
                parameter("unitGroup", "us")
                parameter("key", apiKey)
                parameter("contentType", "json")
            }.body()
        } catch (e: Exception) {
            println(e)
            return WeatherResponse()
        }

    }

    companion object {
        private const val BASE_URL =
            "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline"
    }
}
