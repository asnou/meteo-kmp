package com.devmind.meteo.kmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "meteo-kmp",
    ) {
        App()
    }
}