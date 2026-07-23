package com.devmind.meteo.kmp

import androidx.compose.ui.window.ComposeUIViewController
import com.devmind.meteo.kmp.di.initKoin

fun MainViewController() = ComposeUIViewController {
    initKoin()
    App()
}
