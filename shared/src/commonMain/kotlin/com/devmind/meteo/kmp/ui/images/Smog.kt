package com.devmind.meteo.kmp.ui.images

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smog: ImageVector
    get() {
        if (_Smog != null) {
            return _Smog!!
        }
        _Smog = ImageVector.Builder(
            name = "Smog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 15f)
                horizontalLineTo(13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 17f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 15f)
                moveTo(16f, 15f)
                horizontalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 17f)
                horizontalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 15f)
                moveTo(1f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 7f)
                curveTo(7f, 4.65f, 9.3f, 3f, 12f, 3f)
                curveTo(15.43f, 3f, 18.24f, 5.66f, 18.5f, 9.03f)
                lineTo(19f, 9f)
                curveTo(21.19f, 9f, 22.97f, 10.76f, 23f, 13f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                curveTo(9.5f, 5f, 7.45f, 6.82f, 7.06f, 9.19f)
                curveTo(6.73f, 9.07f, 6.37f, 9f, 6f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
                curveTo(3f, 12.35f, 3.06f, 12.69f, 3.17f, 13f)
                horizontalLineTo(1.1f)
                lineTo(1f, 12f)
                moveTo(3f, 19f)
                horizontalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 21f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                moveTo(8f, 19f)
                horizontalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 21f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 19f)
                close()
            }
        }.build()

        return _Smog!!
    }

@Suppress("ObjectPropertyName")
private var _Smog: ImageVector? = null

