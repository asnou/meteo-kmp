package com.devmind.meteo.kmp.di

import com.devmind.meteo.kmp.config.BuildConfig
import com.devmind.meteo.kmp.data.api.WeatherApiClient
import com.devmind.meteo.kmp.data.repository.WeatherRepository
import com.devmind.meteo.kmp.services.Greeting
import com.devmind.meteo.kmp.services.NotificationService
import com.devmind.meteo.kmp.ui.screens.HomeScreenViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val sharedModule = module {
    single { NotificationService() }
    single { Greeting(get()) }

    single { WeatherApiClient(BuildConfig.WEATHER_API_KEY) }
    single { WeatherRepository(get()) }

    viewModelOf(::HomeScreenViewModel)
}
