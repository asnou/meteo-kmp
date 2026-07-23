package com.devmind.meteo.kmp.ui.images

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Snow: ImageVector
    get() {
        if (_Snow != null) {
            return _Snow!!
        }
        _Snow = ImageVector.Builder(
            name = "Snow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 6f)
                curveTo(7f, 3.65f, 9.3f, 2f, 12f, 2f)
                curveTo(15.43f, 2f, 18.24f, 4.66f, 18.5f, 8.03f)
                lineTo(19f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 16f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 14f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                curveTo(9.5f, 4f, 7.45f, 5.82f, 7.06f, 8.19f)
                curveTo(6.73f, 8.07f, 6.37f, 8f, 6f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 14f)
                moveTo(7.88f, 18.07f)
                lineTo(10.07f, 17.5f)
                lineTo(8.46f, 15.88f)
                curveTo(8.07f, 15.5f, 8.07f, 14.86f, 8.46f, 14.46f)
                curveTo(8.85f, 14.07f, 9.5f, 14.07f, 9.88f, 14.46f)
                lineTo(11.5f, 16.07f)
                lineTo(12.07f, 13.88f)
                curveTo(12.21f, 13.34f, 12.76f, 13.03f, 13.29f, 13.17f)
                curveTo(13.83f, 13.31f, 14.14f, 13.86f, 14f, 14.4f)
                lineTo(13.41f, 16.59f)
                lineTo(15.6f, 16f)
                curveTo(16.14f, 15.86f, 16.69f, 16.17f, 16.83f, 16.71f)
                curveTo(16.97f, 17.24f, 16.66f, 17.79f, 16.12f, 17.93f)
                lineTo(13.93f, 18.5f)
                lineTo(15.54f, 20.12f)
                curveTo(15.93f, 20.5f, 15.93f, 21.15f, 15.54f, 21.54f)
                curveTo(15.15f, 21.93f, 14.5f, 21.93f, 14.12f, 21.54f)
                lineTo(12.5f, 19.93f)
                lineTo(11.93f, 22.12f)
                curveTo(11.79f, 22.66f, 11.24f, 22.97f, 10.71f, 22.83f)
                curveTo(10.17f, 22.69f, 9.86f, 22.14f, 10f, 21.6f)
                lineTo(10.59f, 19.41f)
                lineTo(8.4f, 20f)
                curveTo(7.86f, 20.14f, 7.31f, 19.83f, 7.17f, 19.29f)
                curveTo(7.03f, 18.76f, 7.34f, 18.21f, 7.88f, 18.07f)
                close()
            }
        }.build()

        return _Snow!!
    }

@Suppress("ObjectPropertyName")
private var _Snow: ImageVector? = null

