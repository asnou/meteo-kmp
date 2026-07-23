package com.devmind.meteo.kmp.ui.images

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sunny: ImageVector
    get() {
        if (_Sunny != null) {
            return _Sunny!!
        }
        _Sunny = ImageVector.Builder(
            name = "Sunny",
            defaultWidth = 340.13.dp,
            defaultHeight = 340.13.dp,
            viewportWidth = 340.13f,
            viewportHeight = 340.13f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(181.4f, 0f)
                horizontalLineToRelative(-22.67f)
                verticalLineToRelative(56.69f)
                horizontalLineToRelative(22.67f)
                verticalLineTo(0f)
                close()
                moveTo(41.79f, 282.31f)
                lineToRelative(16.03f, 16.03f)
                lineToRelative(40.09f, -40.09f)
                lineTo(81.88f, 242.22f)
                lineTo(41.79f, 282.31f)
                close()
                moveTo(56.69f, 158.73f)
                horizontalLineTo(0f)
                verticalLineToRelative(22.67f)
                horizontalLineToRelative(56.69f)
                verticalLineTo(158.73f)
                close()
                moveTo(298.34f, 57.82f)
                lineTo(282.31f, 41.79f)
                lineToRelative(-40.09f, 40.09f)
                lineToRelative(16.03f, 16.03f)
                lineTo(298.34f, 57.82f)
                close()
                moveTo(237.75f, 265.39f)
                lineToRelative(40.75f, 40.75f)
                lineToRelative(16.3f, -16.3f)
                lineToRelative(-40.75f, -40.75f)
                lineTo(237.75f, 265.39f)
                close()
                moveTo(283.44f, 158.73f)
                verticalLineToRelative(22.67f)
                horizontalLineToRelative(56.69f)
                verticalLineToRelative(-22.67f)
                horizontalLineTo(283.44f)
                close()
                moveTo(170.06f, 79.36f)
                curveToRelative(-50.09f, 0f, -90.7f, 40.61f, -90.7f, 90.7f)
                reflectiveCurveToRelative(40.61f, 90.7f, 90.7f, 90.7f)
                reflectiveCurveToRelative(90.7f, -40.61f, 90.7f, -90.7f)
                reflectiveCurveTo(220.15f, 79.36f, 170.06f, 79.36f)
                close()
                moveTo(170.06f, 238.09f)
                curveToRelative(-37.57f, 0f, -68.03f, -30.45f, -68.03f, -68.03f)
                reflectiveCurveToRelative(30.45f, -68.03f, 68.03f, -68.03f)
                reflectiveCurveToRelative(68.03f, 30.45f, 68.03f, 68.03f)
                reflectiveCurveTo(207.64f, 238.09f, 170.06f, 238.09f)
                close()
                moveTo(158.73f, 340.13f)
                horizontalLineToRelative(22.67f)
                verticalLineToRelative(-56.69f)
                horizontalLineToRelative(-22.67f)
                verticalLineTo(340.13f)
                close()
                moveTo(91.04f, 86.1f)
                lineToRelative(-40.75f, -40.77f)
                lineTo(33.99f, 61.63f)
                lineToRelative(40.75f, 40.75f)
                lineTo(91.04f, 86.1f)
                close()
            }
        }.build()

        return _Sunny!!
    }

@Suppress("ObjectPropertyName")
private var _Sunny: ImageVector? = null
