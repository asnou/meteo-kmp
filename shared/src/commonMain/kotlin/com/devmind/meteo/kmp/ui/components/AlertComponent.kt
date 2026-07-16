package com.devmind.meteo.kmp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import com.devmind.meteo.kmp.ui.PhonePreview
import com.devmind.meteo.kmp.ui.images.WarningState
import com.devmind.meteo.kmp.ui.theme.AppColor
import meteo_kmp.shared.generated.resources.Res
import meteo_kmp.shared.generated.resources.error_icon_description
import org.jetbrains.compose.resources.stringResource

enum class AlertComponentType(
    val background: Color,
    val textColor: Color,
) {
    ERROR(
        background = AppColor.ErrorBackgroundColor,
        textColor = Color.White,
    ),
    WARNING(
        background = AppColor.WarningBackgroundColor,
        textColor = AppColor.TextColor,
    ),
}

@Composable
fun AlertComponent(
    alert: String,
    modifier: Modifier = Modifier,
    alertType: AlertComponentType = AlertComponentType.ERROR,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .background(alertType.background)
            .padding(16.dp)
    ) {
        Image(
            imageVector = WarningState,
            contentDescription = stringResource(Res.string.error_icon_description),
            colorFilter = ColorFilter.tint(alertType.textColor),
            modifier = Modifier.padding(start = 8.dp).size(24.dp)
        )
        DescriptionText(alert, color = alertType.textColor, modifier = Modifier.weight(1f))
    }
}

@PhonePreview
@Composable
private fun AlertComponentPreview() {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        AlertComponent(
            "This is the text",
        )

        AlertComponent(
            "This is the text",
            alertType = AlertComponentType.WARNING
        )
    }
}
