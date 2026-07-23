package com.devmind.meteo.kmp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.devmind.automation.ui.component.ButtonComponent
import com.devmind.meteo.kmp.data.api.DayData
import com.devmind.meteo.kmp.data.api.WeatherResponse
import com.devmind.meteo.kmp.ui.PhonePreview
import com.devmind.meteo.kmp.ui.components.FormFieldComponent
import com.devmind.meteo.kmp.ui.components.MeteoRangeComponent
import com.devmind.meteo.kmp.ui.components.createRange
import com.devmind.meteo.kmp.ui.theme.Typography.titleFont
import meteo_kmp.shared.generated.resources.Res
import meteo_kmp.shared.generated.resources.city_name
import meteo_kmp.shared.generated.resources.img
import meteo_kmp.shared.generated.resources.refresh
import org.jetbrains.compose.resources.imageResource
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeScreen(
    screenState: HomeScreenState,
    onUpdateCityName: (String) -> Unit,
    onRefreshMeteo: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(imageResource(Res.drawable.img), null)
        Text(
            text = "Hello World!",
            fontFamily = titleFont(),
            fontSize = 24.sp
        )

        when (screenState) {
            is HomeScreenState.Loading -> CityForm(
                value = null,
                onUpdateCityName = onUpdateCityName,
                onRefreshMeteo = onRefreshMeteo
            )

            is HomeScreenState.Success -> {
                CityForm(
                    value = (screenState as HomeScreenState.Success).city,
                    onUpdateCityName = onUpdateCityName,
                    onRefreshMeteo = onRefreshMeteo
                )

                LazyColumn(
                    modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
                ) {
                    val currentDay = (screenState as HomeScreenState.Success).weatherResponse.days.firstOrNull()

                    items(currentDay?.hours ?: emptyList()) { hourData ->
                        MeteoRangeComponent(hourData)
                    }
                }
            }
        }

    }
}


@Composable
fun CityForm(
    value: String?,
    onUpdateCityName: (String) -> Unit,
    onRefreshMeteo: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        FormFieldComponent(
            label = stringResource(Res.string.city_name),
            value = value ?: "",
            modifier = Modifier.weight(1f).padding(16.dp),
        ) {
            onUpdateCityName(it)
        }
        ButtonComponent(
            text = stringResource(Res.string.refresh),
            modifier = Modifier.padding(end = 8.dp).width(100.dp)
        ) {
            onRefreshMeteo()
        }
    }

}

@PhonePreview
@Composable
private fun HomeScreenPreview() {
    HomeScreen(
        screenState = HomeScreenState.Success(
            city = "Paris",
            weatherResponse = WeatherResponse(
                days = listOf(
                    DayData(
                        datetime = "2023-06-01",
                        datetimeEpoch = 1685577600,
                        hours = listOf(
                            createRange(0)
                        )
                    )
                )
            )
        ),
        onUpdateCityName = {},
        onRefreshMeteo = {}
    )
}
