package com.devmind.meteo.kmp.services

import com.devmind.meteo.kmp.getPlatform

class Greeting(private val notificationService: NotificationService) {
    private val platform = getPlatform()

    fun greet(): String {
        return notificationService.sayHello(platform.name)
    }
}
