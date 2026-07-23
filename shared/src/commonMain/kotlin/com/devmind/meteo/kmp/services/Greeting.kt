package com.devmind.meteo.kmp.services

import com.devmind.meteo.kmp.getPlatform

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return sayHello(platform.name)
    }
}
