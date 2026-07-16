package com.devmind.meteo.kmp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import meteo_kmp.shared.generated.resources.Audiowide_Regular
import meteo_kmp.shared.generated.resources.MirandaSans_VariableFont_wght
import meteo_kmp.shared.generated.resources.Res

import org.jetbrains.compose.resources.Font

@Composable
fun titleFont(weight: FontWeight? = FontWeight.Bold) =
    FontFamily(Font(Res.font.Audiowide_Regular, weight ?: FontWeight.Bold))

@Composable
fun defaultFont(weight: FontWeight? = FontWeight.Normal) =
    FontFamily(Font(Res.font.MirandaSans_VariableFont_wght, weight ?: FontWeight.Normal))


@Composable
@Preview(showBackground = true)
private fun FontPreview() {
    Column {
        Text(
            text = "Title Font",
            fontFamily = titleFont(),
            fontSize = 24.sp
        )
        Text(
            text = "Default Font",
            fontFamily = defaultFont(),
            fontSize = 16.sp
        )
    }
}
