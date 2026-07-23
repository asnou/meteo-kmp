package com.devmind.meteo.kmp.ui.images

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Drizzle: ImageVector
    get() {
        if (_Drizzle != null) {
            return _Drizzle!!
        }
        _Drizzle = ImageVector.Builder(
            name = "Drizzle",
            defaultWidth = 30.dp,
            defaultHeight = 30.dp,
            viewportWidth = 14f,
            viewportHeight = 14f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 7.654f)
                curveTo(1f, 6.988f, 1.208f, 6.398f, 1.625f, 5.877f)
                curveTo(2.042f, 5.356f, 2.569f, 5.026f, 3.205f, 4.876f)
                curveTo(3.385f, 4.088f, 3.79f, 3.44f, 4.421f, 2.936f)
                curveTo(5.052f, 2.433f, 5.781f, 2.178f, 6.598f, 2.178f)
                curveToRelative(0.799f, 0f, 1.505f, 0.249f, 2.13f, 0.735f)
                curveToRelative(0.619f, 0.492f, 1.03f, 1.123f, 1.221f, 1.899f)
                lineToRelative(0.179f, 0f)
                curveToRelative(0.515f, 0f, 0.996f, 0.127f, 1.436f, 0.376f)
                curveToRelative(0.44f, 0.249f, 0.793f, 0.596f, 1.048f, 1.03f)
                curveTo(12.867f, 6.653f, 13f, 7.133f, 13f, 7.648f)
                curveToRelative(0f, 0.776f, -0.266f, 1.441f, -0.799f, 1.997f)
                curveToRelative(-0.533f, 0.556f, -1.187f, 0.851f, -1.957f, 0.874f)
                curveToRelative(-0.075f, 0f, -0.116f, -0.035f, -0.116f, -0.098f)
                lineToRelative(0f, -0.77f)
                curveToRelative(0f, -0.069f, 0.041f, -0.104f, 0.116f, -0.104f)
                curveToRelative(0.498f, -0.023f, 0.915f, -0.22f, 1.262f, -0.59f)
                curveToRelative(0.347f, -0.37f, 0.521f, -0.805f, 0.521f, -1.308f)
                curveToRelative(0f, -0.504f, -0.185f, -0.938f, -0.567f, -1.308f)
                curveTo(11.084f, 5.97f, 10.638f, 5.784f, 10.123f, 5.784f)
                lineToRelative(-0.926f, 0f)
                curveToRelative(-0.069f, 0f, -0.11f, -0.035f, -0.11f, -0.098f)
                lineTo(9.046f, 5.35f)
                curveTo(8.983f, 4.731f, 8.716f, 4.204f, 8.247f, 3.781f)
                curveTo(7.773f, 3.359f, 7.223f, 3.145f, 6.598f, 3.145f)
                curveToRelative(-0.631f, 0f, -1.187f, 0.208f, -1.656f, 0.631f)
                curveToRelative(-0.469f, 0.423f, -0.735f, 0.944f, -0.799f, 1.569f)
                lineToRelative(-0.035f, 0.313f)
                curveToRelative(0f, 0.069f, -0.041f, 0.104f, -0.116f, 0.104f)
                lineTo(3.686f, 5.779f)
                curveTo(3.211f, 5.802f, 2.812f, 5.993f, 2.476f, 6.357f)
                curveTo(2.14f, 6.722f, 1.978f, 7.151f, 1.978f, 7.643f)
                curveToRelative(0f, 0.504f, 0.174f, 0.938f, 0.521f, 1.308f)
                curveToRelative(0.347f, 0.37f, 0.77f, 0.567f, 1.262f, 0.59f)
                curveToRelative(0.064f, 0f, 0.098f, 0.035f, 0.098f, 0.104f)
                lineToRelative(0f, 0.77f)
                curveToRelative(0f, 0.064f, -0.035f, 0.098f, -0.098f, 0.098f)
                curveTo(2.986f, 10.479f, 2.331f, 10.184f, 1.793f, 9.628f)
                curveTo(1.255f, 9.072f, 1f, 8.424f, 1f, 7.654f)
                close()
                moveTo(4.433f, 8.164f)
                curveToRelative(0f, -0.139f, 0.069f, -0.33f, 0.214f, -0.573f)
                curveTo(4.786f, 7.347f, 4.919f, 7.156f, 5.041f, 7.006f)
                curveTo(5.162f, 6.867f, 5.237f, 6.786f, 5.26f, 6.763f)
                lineToRelative(0.208f, 0.232f)
                curveToRelative(0.151f, 0.162f, 0.289f, 0.353f, 0.417f, 0.59f)
                curveToRelative(0.127f, 0.232f, 0.191f, 0.428f, 0.191f, 0.579f)
                curveToRelative(0f, 0.226f, -0.075f, 0.417f, -0.232f, 0.567f)
                curveToRelative(-0.156f, 0.151f, -0.347f, 0.226f, -0.579f, 0.226f)
                curveToRelative(-0.226f, 0f, -0.423f, -0.075f, -0.585f, -0.232f)
                curveTo(4.514f, 8.575f, 4.433f, 8.384f, 4.433f, 8.164f)
                close()
                moveTo(6.158f, 10.473f)
                curveToRelative(0f, -0.162f, 0.046f, -0.342f, 0.139f, -0.556f)
                curveTo(6.389f, 9.703f, 6.499f, 9.512f, 6.638f, 9.327f)
                curveTo(6.742f, 9.177f, 6.87f, 9.014f, 7.026f, 8.841f)
                curveTo(7.177f, 8.667f, 7.292f, 8.54f, 7.373f, 8.465f)
                curveToRelative(0.041f, -0.035f, 0.087f, -0.081f, 0.139f, -0.133f)
                lineToRelative(0.139f, 0.133f)
                curveToRelative(0.22f, 0.191f, 0.463f, 0.475f, 0.735f, 0.845f)
                curveToRelative(0.139f, 0.191f, 0.249f, 0.394f, 0.342f, 0.602f)
                curveToRelative(0.093f, 0.208f, 0.133f, 0.394f, 0.133f, 0.562f)
                curveToRelative(0f, 0.37f, -0.133f, 0.689f, -0.394f, 0.955f)
                curveToRelative(-0.26f, 0.266f, -0.585f, 0.394f, -0.961f, 0.394f)
                curveToRelative(-0.37f, 0f, -0.689f, -0.133f, -0.955f, -0.388f)
                curveToRelative(-0.266f, -0.266f, -0.394f, -0.585f, -0.394f, -0.961f)
                close()
                moveTo(7.009f, 6.618f)
                curveToRelative(0f, -0.243f, 0.185f, -0.55f, 0.562f, -0.926f)
                lineTo(7.709f, 5.836f)
                curveTo(7.813f, 5.958f, 7.9f, 6.097f, 7.987f, 6.247f)
                curveTo(8.068f, 6.398f, 8.114f, 6.52f, 8.114f, 6.618f)
                curveTo(8.114f, 6.768f, 8.062f, 6.896f, 7.952f, 7f)
                curveTo(7.848f, 7.104f, 7.721f, 7.162f, 7.57f, 7.162f)
                curveTo(7.414f, 7.162f, 7.281f, 7.11f, 7.171f, 7f)
                curveTo(7.061f, 6.896f, 7.009f, 6.768f, 7.009f, 6.618f)
                close()
            }
        }.build()

        return _Drizzle!!
    }

@Suppress("ObjectPropertyName")
private var _Drizzle: ImageVector? = null

