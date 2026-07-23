package com.devmind.meteo.kmp.model

import kotlinx.serialization.Serializable

@Serializable
data class MeteoOnTimeRange(
    val datetime: String,
    val datetimeEpoch: Long,
    val temp: Double,
    val feelslike: Double,
    val humidity: Double,
    val dew: Double,
    val precip: Double,
    val precipprob: Double,
    val snow: Double,
    val snowdepth: Double,
    val preciptype: String?,
    val windgust: Double,
    val windspeed: Double,
    val winddir: Double,
    val pressure: Double,
    val visibility: Double,
    val cloudcover: Double,
    val solarradiation: Double,
    val solarenergy: Double,
    val uvindex: Double,
    val severerisk: Double,
    val conditions: String,
    val icon: String,
    val stations: String?,
    val source: String?,
) {
}
