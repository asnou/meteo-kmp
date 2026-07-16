package com.devmind.meteo.kmp.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import meteo_kmp.shared.generated.resources.Audiowide_Regular
import meteo_kmp.shared.generated.resources.MirandaSans_VariableFont_wght
import meteo_kmp.shared.generated.resources.Res

import org.jetbrains.compose.resources.Font

data class TextSize(
    val size: TextUnit,
    val line: TextUnit,
)

enum class FontType {
    H1,
    H2,
    H3,
    Regular,
    Description,
    Minus
}

object Typography {

    val fontSizes =
        mapOf(
            FontType.H1 to TextSize(28.8.sp, 30.8.sp),
            FontType.H2 to TextSize(25.6.sp, 27.6.sp),
            FontType.H3 to TextSize(22.8.sp, 24.8.sp),
            FontType.Regular to TextSize(16.sp, 18.sp),
            FontType.Description to TextSize(14.sp, 16.sp),
            FontType.Minus to TextSize(12.sp, 14.sp),
        )

    @Composable
    fun titleFont(weight: FontWeight? = FontWeight.Bold) =
        FontFamily(Font(Res.font.Audiowide_Regular, weight ?: FontWeight.Bold))

    @Composable
    fun defaultFont(weight: FontWeight? = FontWeight.Normal) =
        FontFamily(Font(Res.font.MirandaSans_VariableFont_wght, weight ?: FontWeight.Normal))


}

@Composable
@Preview(showBackground = true)
private fun FontPreview() {
    Column {
        Text(
            text = "Title Font",
            fontFamily = Typography.titleFont(),
            fontSize = 24.sp
        )
        Text(
            text = "Default Font",
            fontFamily = Typography.defaultFont(),
            fontSize = 16.sp
        )
    }
}
