package com.devmind.meteo.kmp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.devmind.meteo.kmp.ui.PhonePreview
import com.devmind.meteo.kmp.ui.theme.Typography.titleFont
import com.devmind.meteo.kmp.ui.theme.AppColor
import com.devmind.meteo.kmp.ui.theme.FontType
import com.devmind.meteo.kmp.ui.theme.Typography.defaultFont
import com.devmind.meteo.kmp.ui.theme.Typography.fontSizes


@Composable
fun TitleLevel1(
    text: String,
    color: Color = AppColor.TextColor,
    fontWeight: FontWeight? = null,
    modifier: Modifier = Modifier,
) = CustomText(FontType.H1, text, color, fontWeight, modifier)

@Composable
fun TitleLevel2(
    text: String,
    color: Color = AppColor.TextColor,
    fontWeight: FontWeight? = null,
    modifier: Modifier = Modifier,
) = CustomText(FontType.H2, text, color, fontWeight, modifier)

@Composable
fun TitleLevel3(
    text: String,
    color: Color = AppColor.TextColor,
    fontWeight: FontWeight? = null,
    modifier: Modifier = Modifier,
) = CustomText(FontType.H3, text, color, fontWeight, modifier)

@Composable
fun RegularText(
    text: String,
    color: Color = AppColor.TextColor,
    fontWeight: FontWeight? = null,
    modifier: Modifier = Modifier,
) = CustomText(FontType.Regular, text, color, fontWeight, modifier)

@Composable
fun DescriptionText(
    text: String,
    color: Color = AppColor.TextColor,
    fontWeight: FontWeight? = null,
    modifier: Modifier = Modifier,
) = CustomText(FontType.Description, text, color, fontWeight, modifier)

@Composable
fun MinusText(
    text: String,
    color: Color = AppColor.TextColor,
    fontWeight: FontWeight? = null,
    modifier: Modifier = Modifier,
) = CustomText(FontType.Minus, text, color, fontWeight, modifier)

@Composable
private fun CustomText(
    fontType: FontType,
    text: String,
    color: Color = AppColor.TextColor,
    fontWeight: FontWeight? = null,
    modifier: Modifier = Modifier,
) = Text(
    text = text,
    modifier = modifier,
    color = color,
    style =
        fontSizes[fontType]!!.let {
            TextStyle(
                fontSize = it.size,
                lineHeight = it.line,
                fontFamily =
                    when (fontType) {
                        FontType.H1, FontType.H2, FontType.H3 -> titleFont(fontWeight)
                        else -> defaultFont(fontWeight)
                    },
            )
        },
)

@PhonePreview
@Composable
private fun TyposPreview() {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        TitleLevel1("Bienvenue")
        TitleLevel2("Bienvenue")
        TitleLevel3("Bienvenue")
        RegularText("Bienvenue")
        RegularText("Bienvenue", fontWeight = FontWeight.Bold)
        DescriptionText("Bienvenue")
    }
}
