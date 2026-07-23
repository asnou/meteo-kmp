package com.devmind.meteo.kmp.data.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherResponse(
    val queryCost: Int = 0,
    val latitude: Double = 0.0,
    val longitude: Double = 0.0,
    val resolvedAddress: String = "",
    val address: String = "",
    val timezone: String = "",
    val tzoffset: Double = 0.0,
    val description: String = "",
    val days: List<DayData> = emptyList(),
)

@Serializable
data class DayData(
    val datetime: String,
    val datetimeEpoch: Long,
    @SerialName("tempmax") val tempMax: Double = 0.0,
    @SerialName("tempmin") val tempMin: Double = 0.0,
    val temp: Double = 0.0,
    val humidity: Double = 0.0,
    val conditions: String = "",
    val description: String = "",
    val icon: String = "",
    val hours: List<HourData> = emptyList(),
)

@Serializable
data class HourData(
    val datetime: String,
    val datetimeEpoch: Long,
    val temp: Double = 0.0,
    @SerialName("feelslike") val feelsLike: Double = 0.0,
    val humidity: Double = 0.0,
    val conditions: String = "",
    val icon: String = "",
    //    val datetime: String,
//    val datetimeEpoch: Long,
//    val temp: Double,
//    val feelslike: Double,
//    val humidity: Double,
//    val dew: Double,
//    val precip: Double,
//    val precipprob: Double,
//    val snow: Double,
//    val snowdepth: Double,
//    val preciptype: String?,
//    val windgust: Double,
//    val windspeed: Double,
//    val winddir: Double,
//    val pressure: Double,
//    val visibility: Double,
//    val cloudcover: Double,
//    val solarradiation: Double,
//    val solarenergy: Double,
//    val uvindex: Double,
//    val severerisk: Double,
//    val conditions: String,
//    val icon: String,
//    val stations: String?,
//    val source: String?,
)
