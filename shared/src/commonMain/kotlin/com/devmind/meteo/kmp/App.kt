package com.devmind.meteo.kmp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.devmind.meteo.kmp.ui.AddIcon
import com.devmind.meteo.kmp.ui.navigation.AppLayout
import com.devmind.meteo.kmp.ui.navigation.AppNavigation
import com.devmind.meteo.kmp.ui.screens.ExampleScreen
import com.devmind.meteo.kmp.ui.titleFont
import meteo_kmp.shared.generated.resources.Audiowide_Regular
import meteo_kmp.shared.generated.resources.MirandaSans_VariableFont_wght
import meteo_kmp.shared.generated.resources.Res
import meteo_kmp.shared.generated.resources.click_me
import meteo_kmp.shared.generated.resources.compose_multiplatform
import meteo_kmp.shared.generated.resources.img
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.imageResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
@Preview
fun App() {
    MaterialTheme {
        AppLayout()
    }
}
