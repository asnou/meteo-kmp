package com.devmind.meteo.kmp.ui.images

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WarningState: ImageVector
    get() {
        if (_CircleExclamationSolidFull != null) {
            return _CircleExclamationSolidFull!!
        }
        _CircleExclamationSolidFull =
            ImageVector
                .Builder(
                    name = "CircleExclamationSolidFull",
                    defaultWidth = 640.dp,
                    defaultHeight = 640.dp,
                    viewportWidth = 640f,
                    viewportHeight = 640f,
                ).apply {
                    path(
                        stroke = SolidColor(Color.Black),
                        strokeLineWidth = 45.1f,
                    ) {
                        moveTo(320f, 576f)
                        curveTo(178.6f, 576f, 64f, 461.4f, 64f, 320f)
                        curveTo(64f, 178.6f, 178.6f, 64f, 320f, 64f)
                        curveTo(461.4f, 64f, 576f, 178.6f, 576f, 320f)
                        curveTo(576f, 461.4f, 461.4f, 576f, 320f, 576f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color.Black),
                        strokeLineWidth = 42f,
                    ) {
                        moveToRelative(317.23f, 381.08f)
                        curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                        curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                        curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                        curveToRelative(0f, -17.7f, -14.3f, -32f, -32f, -32f)
                        close()
                        moveTo(317.23f, 189.08f)
                        curveToRelative(-18.2f, 0f, -32.7f, 15.5f, -31.4f, 33.7f)
                        lineToRelative(7.4f, 104f)
                        curveToRelative(0.9f, 12.6f, 11.4f, 22.3f, 23.9f, 22.3f)
                        curveToRelative(12.6f, 0f, 23f, -9.7f, 23.9f, -22.3f)
                        lineToRelative(7.4f, -104f)
                        curveToRelative(1.3f, -18.2f, -13.1f, -33.7f, -31.4f, -33.7f)
                        close()
                    }
                }.build()

        return _CircleExclamationSolidFull!!
    }

@Suppress("ObjectPropertyName")
private var _CircleExclamationSolidFull: ImageVector? = null
