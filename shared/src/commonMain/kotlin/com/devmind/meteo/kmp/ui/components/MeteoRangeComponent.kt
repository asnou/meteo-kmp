package com.devmind.meteo.kmp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.devmind.automation.ui.image.meteo.WmoWeatherCode
import com.devmind.meteo.kmp.data.api.HourData
import com.devmind.meteo.kmp.services.toDegree
import com.devmind.meteo.kmp.ui.PhonePreview

@Composable
fun MeteoRangeComponent(meteoOnTimeRange: HourData) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        RegularText(
            text = meteoOnTimeRange.datetime.removeSuffix(":00"),
            fontWeight = FontWeight.Bold
        )
        WmoWeatherCode.fromName(meteoOnTimeRange.icon).let { icon ->
            Image(
                imageVector = icon.vector,
                contentDescription = icon.name,
                modifier = Modifier.size(40.dp),
            )
        }
        RegularText(
            text = "${meteoOnTimeRange.temp.toDegree()}°",
            fontWeight = FontWeight.Bold
        )

    }
}

@PhonePreview
@Composable
private fun MeteoRangeComponentPreview() {
    LazyColumn {
        items(24) {
            MeteoRangeComponent(
                createRange(time = it)
            )
        }
    }

}

fun createRange(time: Int) =
    HourData(
        datetime = "$time:00:00",
        datetimeEpoch = 1795007400L,
        temp = 57.0,
        feelsLike = 21.0,
        humidity = 65.0,
        conditions = "Partly cloudy",
        icon = "partly-cloudy-day",
    )
