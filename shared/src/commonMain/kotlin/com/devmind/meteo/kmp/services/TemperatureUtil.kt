package com.devmind.meteo.kmp.services

import kotlin.math.PI
import kotlin.math.round

fun Double.toDegree(): Double =
    round((this - 32) / 1.8)
