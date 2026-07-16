package com.devmind.meteo.kmp.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.devmind.meteo.kmp.ui.screens.ExampleScreen
import com.devmind.meteo.kmp.ui.screens.HomeScreen

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
            HomeScreen()
        }

        composable(route = Routes.Example.name) {
            ExampleScreen()
        }
    }
}
