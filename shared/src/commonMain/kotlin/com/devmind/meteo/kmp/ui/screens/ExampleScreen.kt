package com.devmind.meteo.kmp.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.devmind.automation.ui.component.ButtonComponent
import com.devmind.meteo.kmp.services.Greeting
import com.devmind.meteo.kmp.ui.images.AddIcon
import com.devmind.meteo.kmp.ui.components.RegularText
import meteo_kmp.shared.generated.resources.Res
import meteo_kmp.shared.generated.resources.click_me
import meteo_kmp.shared.generated.resources.compose_multiplatform
import meteo_kmp.shared.generated.resources.img
import org.jetbrains.compose.resources.imageResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
@Preview
fun ExampleScreen() {
    var showContent by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primaryContainer)
            .safeContentPadding()
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ButtonComponent(
            text = stringResource(Res.string.click_me),
        ) {
            showContent = !showContent
        }

        AnimatedVisibility(showContent) {
            val greeting = remember { Greeting().greet() }
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(painterResource(Res.drawable.compose_multiplatform),null)
                Image(imageResource( Res.drawable.img), null)
                Icon(imageVector = AddIcon, null)
                RegularText("Compose: $greeting")
            }
        }
    }
}
