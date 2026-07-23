package com.devmind.automation.ui.image.meteo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.devmind.meteo.kmp.ui.PhonePreview
import com.devmind.meteo.kmp.ui.images.Cloudy
import com.devmind.meteo.kmp.ui.images.Drizzle
import com.devmind.meteo.kmp.ui.images.FreezingDrizzle
import com.devmind.meteo.kmp.ui.images.HeavyRain
import com.devmind.meteo.kmp.ui.images.HeavySnow
import com.devmind.meteo.kmp.ui.images.MainlySunny
import com.devmind.meteo.kmp.ui.images.PartlyCloudy
import com.devmind.meteo.kmp.ui.images.Rain
import com.devmind.meteo.kmp.ui.images.Smog
import com.devmind.meteo.kmp.ui.images.Snow
import com.devmind.meteo.kmp.ui.images.Storm
import com.devmind.meteo.kmp.ui.images.Sunny
import com.devmind.meteo.kmp.ui.images.Wind

enum class WmoWeatherCode(val code:Int, val vector: ImageVector, val names: List<String>) {
    SUNNY(0,Sunny, listOf("clear-day", "clear-night")),
    MAINLY_SUNNY(1, MainlySunny, emptyList()),
    PARTLY_CLOUDY(2, PartlyCloudy, listOf("partly-cloudy-day", "partly-cloudy-night")),
    CLOUDY(3, Cloudy, listOf("cloudy")),
    FOGGY(45, Smog, listOf("fog")),
    RIME_FOG(48, Smog, emptyList()),
    LIGHT_DRIZZLE(51, Drizzle, emptyList()),
    DRIZZLE(53, Drizzle, emptyList()),
    HEAVY_DRIZZLE(55, Drizzle, emptyList()),
    LIGHT_FREEZING_DRIZZLE(56, FreezingDrizzle, emptyList()),
    FREEZING_DRIZZLE(57, FreezingDrizzle, emptyList()),
    LIGHT_RAIN(61, Drizzle, emptyList()),
    RAIN(63, Rain, listOf("rain")),
    HEAVY_RAIN(65, HeavyRain, emptyList()),
    LIGHT_FREEZING_RAIN(66, Drizzle, emptyList()),
    FREEZING_RAIN(67, Rain, emptyList()),
    LIGHT_SNOW(71, Snow, emptyList()),
    SNOW(73, Snow, listOf("snow")),
    HEAVY_SNOW(75, HeavySnow, emptyList()),
    SNOW_GRAINS(77, Snow, emptyList()),
    LIGHT_SHOWERS(80, Rain, emptyList()),
    SHOWERS(81, HeavyRain, listOf("showers-day", "showers-night")),
    HEAVY_SHOWERS(82, HeavyRain, emptyList()),
    LIGHT_SNOW_SHOWERS(85, HeavyRain, emptyList()),
    SNOW_SHOWERS(86, HeavyRain, listOf("snow-showers-day", "snow-showers-night")),
    THUNDERSTORM(95, Storm, listOf("thunder-rain", "thunder-showers-day", "thunder-showers-night")),
    LIGHT_THUNDERSTORMS_WITH_HAIL(96, Storm, emptyList()),
    WIND(98, Wind, listOf("wind")),
    THUNDERSTORM_WITH_HAIL(99, Storm, emptyList());

    companion object {
        fun fromName(name:String):WmoWeatherCode{
            return entries.firstOrNull { it.names.contains(name) } ?: MAINLY_SUNNY
        }
    }
}


@PhonePreview
@Composable
private fun WmoWeatherCodePreview() {
    LazyColumn(verticalArrangement = Arrangement.spacedBy(4.dp)) {
        items(WmoWeatherCode.entries) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(it.name)
                Icon(
                    imageVector = it.vector,
                    contentDescription = it.name,
                    modifier = Modifier.size(60.dp)
                )
            }
        }
    }

}
