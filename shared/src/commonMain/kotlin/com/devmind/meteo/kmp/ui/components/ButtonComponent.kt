package com.devmind.automation.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.devmind.meteo.kmp.ui.PhonePreview
import com.devmind.meteo.kmp.ui.theme.AppColor
import com.devmind.meteo.kmp.ui.theme.AppTheme

enum class ButtonType(
    val background: Color,
    val activeBackground: Color,
    val disabledBackground: Color,
    val textColor: Color,
    val disabledTextColor: Color,
) {
    PRIMARY(
        background = AppColor.PrimaryColor,
        activeBackground = AppColor.PrimaryActiveColor,
        textColor = AppColor.OnPrimaryColor,
        disabledBackground = AppColor.PrimaryDisabledColor,
        disabledTextColor = AppColor.OnPrimaryDisabledColor,
    ),
    SECONDARY(
        background = AppColor.SecondaryColor,
        activeBackground = AppColor.SecondaryActiveColor,
        textColor = AppColor.OnSecondaryColor,
        disabledBackground = AppColor.SecondaryDisabledColor,
        disabledTextColor = AppColor.OnSecondaryDisabledColor,
    ),
}

@Composable
fun ButtonComponent(
    text: String,
    outline: Boolean = false,
    active: Boolean = false,
    disabled: Boolean = false,
    isWorking: Boolean = false,
    buttonType: ButtonType = ButtonType.PRIMARY,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = { },
) {
    val disabledOrWorking = disabled || isWorking
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(AppTheme.buttonCornerRadius),
        modifier = modifier,
        border = BorderStroke(
            1.dp,
            if (disabledOrWorking && !outline) buttonType.disabledBackground else buttonType.background
        ),
        enabled = !disabledOrWorking,
        colors =
            ButtonDefaults.buttonColors().copy(
                containerColor =
                    if (outline) {
                        Color.White
                    } else if (active) {
                        buttonType.activeBackground
                    } else {
                        buttonType.background
                    },
                disabledContainerColor =
                    if (outline) {
                        Color.Transparent
                    } else {
                        buttonType.disabledBackground
                    },
            ),
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            if (isWorking) {
                CircularProgressIndicator(
                    modifier = Modifier.size(20.dp),
                    color = AppColor.SecondaryColor,
                )
            }
            Text(
                text = text,
                color = if (disabledOrWorking) buttonType.disabledTextColor else if (outline) buttonType.activeBackground else buttonType.textColor,
            )

        }
    }
}

@PhonePreview
@Composable
private fun ButtonComponentPreview() {
    Column {
        ButtonComponentRowPreview(ButtonType.PRIMARY)
        ButtonComponentRowPreview(ButtonType.SECONDARY)
    }
}

@Composable
private fun ButtonComponentRowPreview(type: ButtonType) {
    Column {

        ButtonComponent(
            text = "My ${type.name} button",
            buttonType = type,
            onClick = { },
        )
        ButtonComponent(
            text = "My ${type.name} disabled button",
            buttonType = type,
            isWorking = true,
            disabled = true,
            onClick = { },
        )
        ButtonComponent(
            text = "My ${type.name} outline button",
            buttonType = type,
            isWorking = true,
            outline = true,
            onClick = { },
        )
    }

}
