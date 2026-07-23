package com.devmind.meteo.kmp.di

import com.devmind.meteo.kmp.services.Greeting
import com.devmind.meteo.kmp.services.NotificationService
import org.koin.dsl.module

val sharedModule = module {
    single { NotificationService() }
    single { Greeting(get()) }

}
