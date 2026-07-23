package com.devmind.meteo.kmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.devmind.meteo.kmp.di.initKoin

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "meteo-kmp",
    ) {
        initKoin()
        App()
    }
}
