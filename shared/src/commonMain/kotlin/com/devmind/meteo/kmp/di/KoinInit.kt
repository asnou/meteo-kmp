package com.devmind.meteo.kmp.di

import org.koin.core.context.startKoin
import org.koin.core.KoinApplication
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.includes

private var isKoinStarted = false

fun initKoin(appDeclaration: KoinApplication.() -> Unit = {}) {
    if (!isKoinStarted) {
        startKoin {
            appDeclaration()
            modules(sharedModule)
        }
        isKoinStarted = true
    }
}

