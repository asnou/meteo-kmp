package com.devmind.meteo.kmp.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.devmind.meteo.kmp.ui.screens.ExampleScreen
import com.devmind.meteo.kmp.ui.screens.HomeScreen
import com.devmind.meteo.kmp.ui.screens.HomeScreenViewModel
import org.koin.compose.viewmodel.koinViewModel

enum class Routes {
    Home,
    Example,
}
@Composable
fun AppNavigation(
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        modifier = Modifier.fillMaxWidth(),
        navController = navController,
        startDestination = Routes.Home.name
    ) {
        composable(route = Routes.Home.name) {
            val viewModel: HomeScreenViewModel = koinViewModel()
            val screenState by viewModel.screenState.collectAsStateWithLifecycle()

            HomeScreen(
                screenState,
                onUpdateCityName = { viewModel.updateCity(it) },
                onRefreshMeteo = { viewModel.refresh() }
            )
        }

        composable(route = Routes.Example.name) {
            ExampleScreen()
        }
    }
}
