package com.devmind.meteo.kmp.ui.images

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HeavySnow: ImageVector
    get() {
        if (_HeavySnow != null) {
            return _HeavySnow!!
        }
        _HeavySnow = ImageVector.Builder(
            name = "HeavySnow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 16.36f)
                curveTo(3.86f, 15.82f, 4.18f, 15.25f, 4.73f, 15.11f)
                lineTo(7f, 14.5f)
                lineTo(5.33f, 12.86f)
                curveTo(4.93f, 12.46f, 4.93f, 11.81f, 5.33f, 11.4f)
                curveTo(5.73f, 11f, 6.4f, 11f, 6.79f, 11.4f)
                lineTo(8.45f, 13.05f)
                lineTo(9.04f, 10.8f)
                curveTo(9.18f, 10.24f, 9.75f, 9.92f, 10.29f, 10.07f)
                curveTo(10.85f, 10.21f, 11.17f, 10.78f, 11f, 11.33f)
                lineTo(10.42f, 13.58f)
                lineTo(12.67f, 13f)
                curveTo(13.22f, 12.83f, 13.79f, 13.15f, 13.93f, 13.71f)
                curveTo(14.08f, 14.25f, 13.76f, 14.82f, 13.2f, 14.96f)
                lineTo(10.95f, 15.55f)
                lineTo(12.6f, 17.21f)
                curveTo(13f, 17.6f, 13f, 18.27f, 12.6f, 18.67f)
                curveTo(12.2f, 19.07f, 11.54f, 19.07f, 11.15f, 18.67f)
                lineTo(9.5f, 17f)
                lineTo(8.89f, 19.27f)
                curveTo(8.75f, 19.83f, 8.18f, 20.14f, 7.64f, 20f)
                curveTo(7.08f, 19.86f, 6.77f, 19.29f, 6.91f, 18.74f)
                lineTo(7.5f, 16.5f)
                lineTo(5.26f, 17.09f)
                curveTo(4.71f, 17.23f, 4.14f, 16.92f, 4f, 16.36f)
                moveTo(1f, 10f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 5f)
                curveTo(7f, 2.65f, 9.3f, 1f, 12f, 1f)
                curveTo(15.43f, 1f, 18.24f, 3.66f, 18.5f, 7.03f)
                lineTo(19f, 7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                curveTo(9.5f, 3f, 7.45f, 4.82f, 7.06f, 7.19f)
                curveTo(6.73f, 7.07f, 6.37f, 7f, 6f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 10f)
                curveTo(3f, 10.85f, 3.35f, 11.61f, 3.91f, 12.16f)
                curveTo(4.27f, 12.55f, 4.26f, 13.16f, 3.88f, 13.54f)
                curveTo(3.5f, 13.93f, 2.85f, 13.93f, 2.47f, 13.54f)
                curveTo(1.56f, 12.63f, 1f, 11.38f, 1f, 10f)
                moveTo(14.03f, 20.43f)
                curveTo(14.13f, 20.82f, 14.5f, 21.04f, 14.91f, 20.94f)
                lineTo(16.5f, 20.5f)
                lineTo(16.06f, 22.09f)
                curveTo(15.96f, 22.5f, 16.18f, 22.87f, 16.57f, 22.97f)
                curveTo(16.95f, 23.08f, 17.35f, 22.85f, 17.45f, 22.46f)
                lineTo(17.86f, 20.89f)
                lineTo(19.03f, 22.05f)
                curveTo(19.3f, 22.33f, 19.77f, 22.33f, 20.05f, 22.05f)
                curveTo(20.33f, 21.77f, 20.33f, 21.3f, 20.05f, 21.03f)
                lineTo(18.89f, 19.86f)
                lineTo(20.46f, 19.45f)
                curveTo(20.85f, 19.35f, 21.08f, 18.95f, 20.97f, 18.57f)
                curveTo(20.87f, 18.18f, 20.5f, 17.96f, 20.09f, 18.06f)
                lineTo(18.5f, 18.5f)
                lineTo(18.94f, 16.91f)
                curveTo(19.04f, 16.5f, 18.82f, 16.13f, 18.43f, 16.03f)
                curveTo(18.05f, 15.92f, 17.65f, 16.15f, 17.55f, 16.54f)
                lineTo(17.14f, 18.11f)
                lineTo(15.97f, 16.95f)
                curveTo(15.7f, 16.67f, 15.23f, 16.67f, 14.95f, 16.95f)
                curveTo(14.67f, 17.24f, 14.67f, 17.7f, 14.95f, 17.97f)
                lineTo(16.11f, 19.14f)
                lineTo(14.54f, 19.55f)
                curveTo(14.15f, 19.65f, 13.92f, 20.05f, 14.03f, 20.43f)
                close()
            }
        }.build()

        return _HeavySnow!!
    }

@Suppress("ObjectPropertyName")
private var _HeavySnow: ImageVector? = null

