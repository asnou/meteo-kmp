package com.devmind.meteo.kmp.ui.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.devmind.meteo.kmp.ui.theme.AppColor
import com.devmind.meteo.kmp.ui.titleFont

@Composable
@Preview
fun AppLayout() {
    val navController = rememberNavController()
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = AppColor.PrimaryColor,
                    titleContentColor = Color.White,
                ),
                title = {
                    Text(
                        text = "Meteo KMP Navigation",
                        fontFamily = titleFont(),
                        fontSize = 24.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = AppColor.SecondaryColor,
                contentColor = AppColor.TextColor,
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Home",
                        textAlign = TextAlign.Center,
                                fontFamily = titleFont(),
                        fontSize = 20.sp,
                        modifier = Modifier.clickable {
                            navController.navigate(Routes.Home.name)
                        },
                    )

                    Text(
                        text = "Example",
                        textAlign = TextAlign.Center,
                        fontFamily = titleFont(),
                        fontSize = 20.sp,
                        modifier = Modifier.clickable {
                            navController.navigate(Routes.Example.name)
                        }
                    )
                }

            }
        },
    ) { innerPadding ->
        Box(
            modifier = Modifier.padding(innerPadding).fillMaxSize().background(AppColor.BackgroundColor),
        ) {
            AppNavigation(navController)
        }
    }
}
