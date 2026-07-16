package com.devmind.meteo.kmp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devmind.meteo.kmp.ui.theme.Typography.titleFont
import meteo_kmp.shared.generated.resources.Res
import meteo_kmp.shared.generated.resources.img
import org.jetbrains.compose.resources.imageResource

@Composable
@Preview(showBackground = true)
fun HomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(imageResource( Res.drawable.img), null)
        Text(
            text = "Hello World!",
            fontFamily = titleFont(),
            fontSize = 24.sp
        )
    }
}
