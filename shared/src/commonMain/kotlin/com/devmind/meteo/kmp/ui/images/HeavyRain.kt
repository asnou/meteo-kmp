package com.devmind.meteo.kmp.ui.images

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HeavyRain: ImageVector
    get() {
        if (_HeavyRain != null) {
            return _HeavyRain!!
        }
        _HeavyRain = ImageVector.Builder(
            name = "HeavyRain",
            defaultWidth = 30.dp,
            defaultHeight = 30.dp,
            viewportWidth = 14f,
            viewportHeight = 14f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 6.676f)
                curveTo(1f, 6.01f, 1.208f, 5.42f, 1.625f, 4.899f)
                curveTo(2.042f, 4.378f, 2.569f, 4.048f, 3.205f, 3.897f)
                curveTo(3.385f, 3.11f, 3.796f, 2.462f, 4.427f, 1.952f)
                curveTo(5.058f, 1.443f, 5.781f, 1.194f, 6.598f, 1.194f)
                curveToRelative(0.799f, 0f, 1.505f, 0.249f, 2.13f, 0.741f)
                curveToRelative(0.625f, 0.492f, 1.03f, 1.129f, 1.216f, 1.904f)
                lineToRelative(0.185f, 0f)
                curveToRelative(0.515f, 0f, 0.996f, 0.127f, 1.436f, 0.376f)
                curveToRelative(0.44f, 0.249f, 0.793f, 0.596f, 1.048f, 1.03f)
                curveTo(12.867f, 5.68f, 13f, 6.161f, 13f, 6.676f)
                curveToRelative(0f, 0.509f, -0.122f, 0.978f, -0.365f, 1.412f)
                curveToRelative(-0.243f, 0.434f, -0.579f, 0.781f, -1.001f, 1.042f)
                curveToRelative(-0.423f, 0.26f, -0.886f, 0.399f, -1.389f, 0.411f)
                curveToRelative(-0.075f, 0f, -0.116f, -0.035f, -0.116f, -0.098f)
                lineToRelative(0f, -0.77f)
                curveToRelative(0f, -0.069f, 0.041f, -0.104f, 0.116f, -0.104f)
                curveToRelative(0.492f, -0.023f, 0.915f, -0.22f, 1.262f, -0.59f)
                curveToRelative(0.347f, -0.37f, 0.521f, -0.805f, 0.521f, -1.308f)
                curveToRelative(0f, -0.504f, -0.191f, -0.938f, -0.567f, -1.308f)
                curveTo(11.084f, 4.991f, 10.638f, 4.806f, 10.123f, 4.806f)
                lineToRelative(-0.932f, 0f)
                curveToRelative(-0.069f, 0f, -0.104f, -0.035f, -0.104f, -0.098f)
                lineTo(9.041f, 4.372f)
                curveTo(8.977f, 3.747f, 8.705f, 3.22f, 8.236f, 2.803f)
                curveTo(7.761f, 2.381f, 7.217f, 2.172f, 6.586f, 2.172f)
                curveToRelative(-0.631f, 0f, -1.187f, 0.208f, -1.65f, 0.631f)
                curveToRelative(-0.469f, 0.423f, -0.729f, 0.944f, -0.787f, 1.569f)
                lineToRelative(-0.041f, 0.307f)
                curveToRelative(0f, 0.069f, -0.041f, 0.11f, -0.116f, 0.11f)
                lineTo(3.686f, 4.806f)
                curveTo(3.205f, 4.864f, 2.8f, 5.072f, 2.47f, 5.425f)
                curveTo(2.14f, 5.779f, 1.978f, 6.195f, 1.978f, 6.676f)
                curveToRelative(0f, 0.504f, 0.174f, 0.938f, 0.521f, 1.308f)
                curveToRelative(0.347f, 0.37f, 0.77f, 0.567f, 1.262f, 0.59f)
                curveToRelative(0.064f, 0f, 0.098f, 0.035f, 0.098f, 0.104f)
                lineToRelative(0f, 0.77f)
                curveToRelative(0f, 0.064f, -0.035f, 0.098f, -0.098f, 0.098f)
                curveTo(2.986f, 9.512f, 2.331f, 9.217f, 1.793f, 8.661f)
                curveTo(1.255f, 8.106f, 1f, 7.446f, 1f, 6.676f)
                close()
                moveTo(4.097f, 10.548f)
                curveToRelative(0f, -0.023f, 0.006f, -0.064f, 0.023f, -0.116f)
                lineToRelative(0.944f, -3.34f)
                curveToRelative(0.035f, -0.11f, 0.098f, -0.197f, 0.185f, -0.255f)
                curveToRelative(0.087f, -0.058f, 0.179f, -0.087f, 0.266f, -0.087f)
                curveToRelative(0.041f, 0f, 0.087f, 0.006f, 0.139f, 0.017f)
                curveToRelative(0.139f, 0.023f, 0.243f, 0.098f, 0.313f, 0.214f)
                curveToRelative(0.069f, 0.116f, 0.087f, 0.243f, 0.046f, 0.388f)
                lineTo(5.069f, 10.687f)
                curveTo(5f, 10.936f, 4.838f, 11.058f, 4.595f, 11.058f)
                curveToRelative(-0.023f, 0f, -0.041f, -0.006f, -0.064f, -0.012f)
                curveToRelative(-0.035f, -0.012f, -0.052f, -0.017f, -0.058f, -0.017f)
                curveToRelative(-0.127f, -0.035f, -0.22f, -0.098f, -0.284f, -0.191f)
                curveToRelative(-0.064f, -0.098f, -0.093f, -0.191f, -0.093f, -0.289f)
                close()
                moveTo(5.614f, 12.175f)
                lineTo(7.026f, 7.098f)
                curveToRelative(0.023f, -0.11f, 0.081f, -0.197f, 0.174f, -0.255f)
                curveToRelative(0.093f, -0.058f, 0.185f, -0.087f, 0.284f, -0.087f)
                curveToRelative(0.052f, 0f, 0.104f, 0.006f, 0.156f, 0.017f)
                curveToRelative(0.127f, 0.035f, 0.22f, 0.11f, 0.284f, 0.226f)
                curveToRelative(0.064f, 0.116f, 0.075f, 0.237f, 0.041f, 0.37f)
                lineToRelative(-1.407f, 5.082f)
                curveToRelative(-0.023f, 0.098f, -0.075f, 0.179f, -0.168f, 0.249f)
                curveToRelative(-0.093f, 0.069f, -0.185f, 0.104f, -0.295f, 0.104f)
                curveToRelative(-0.052f, 0f, -0.104f, -0.012f, -0.145f, -0.029f)
                curveToRelative(-0.116f, -0.029f, -0.214f, -0.104f, -0.301f, -0.226f)
                curveToRelative(-0.064f, -0.104f, -0.075f, -0.226f, -0.035f, -0.376f)
                close()
                moveTo(8.004f, 10.56f)
                curveToRelative(0f, -0.023f, 0.006f, -0.064f, 0.023f, -0.133f)
                lineToRelative(0.944f, -3.34f)
                curveToRelative(0.035f, -0.11f, 0.093f, -0.197f, 0.174f, -0.255f)
                curveToRelative(0.087f, -0.058f, 0.174f, -0.087f, 0.266f, -0.087f)
                curveToRelative(0.046f, 0f, 0.098f, 0.006f, 0.151f, 0.017f)
                curveToRelative(0.122f, 0.035f, 0.208f, 0.093f, 0.266f, 0.179f)
                curveToRelative(0.058f, 0.087f, 0.087f, 0.179f, 0.087f, 0.272f)
                curveToRelative(0f, 0.017f, -0.006f, 0.046f, -0.012f, 0.081f)
                curveToRelative(-0.006f, 0.035f, -0.012f, 0.058f, -0.012f, 0.069f)
                lineToRelative(-0.944f, 3.317f)
                curveToRelative(-0.023f, 0.11f, -0.075f, 0.203f, -0.162f, 0.266f)
                curveToRelative(-0.087f, 0.064f, -0.185f, 0.098f, -0.295f, 0.098f)
                lineToRelative(-0.139f, -0.029f)
                curveToRelative(-0.116f, -0.035f, -0.203f, -0.093f, -0.266f, -0.185f)
                curveToRelative(-0.052f, -0.087f, -0.081f, -0.179f, -0.081f, -0.272f)
                close()
            }
        }.build()

        return _HeavyRain!!
    }

@Suppress("ObjectPropertyName")
private var _HeavyRain: ImageVector? = null

