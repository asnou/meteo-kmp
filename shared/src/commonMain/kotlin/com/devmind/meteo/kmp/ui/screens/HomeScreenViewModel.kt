package com.devmind.meteo.kmp.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.devmind.meteo.kmp.data.api.WeatherResponse
import com.devmind.meteo.kmp.data.repository.WeatherRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeScreenViewModel(
    private val weatherRepository: WeatherRepository
): ViewModel() {
    private val _screenState = MutableStateFlow<HomeScreenState>(HomeScreenState.Loading)
    val screenState: StateFlow<HomeScreenState> = _screenState.asStateFlow()

    fun updateCity(city: String) {
        viewModelScope.launch {
            when(_screenState.value) {
                is HomeScreenState.Loading -> _screenState.value = HomeScreenState.Success(city = city, WeatherResponse())
                is HomeScreenState.Success -> _screenState.update {
                  (screenState.value as HomeScreenState.Success).copy(city = city)
                }
            }
        }
    }

    fun refresh() {
        viewModelScope.launch {
            when(_screenState.value) {
                is HomeScreenState.Loading -> HomeScreenState.Loading
                is HomeScreenState.Success -> _screenState.update {
                    val state = (_screenState.value as HomeScreenState.Success)
                    state.copy(
                        weatherResponse = weatherRepository.getWeather(state.city),
                    )
                }
            }
        }
    }
}

sealed interface HomeScreenState {

    data class Success(
        val city: String,
        val weatherResponse: WeatherResponse
    ) : HomeScreenState

    data object Loading : HomeScreenState
}
