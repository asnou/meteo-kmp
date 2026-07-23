package com.devmind.meteo.kmp.ui.images

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Storm: ImageVector
    get() {
        if (_Storm != null) {
            return _Storm!!
        }
        _Storm = ImageVector.Builder(
            name = "Storm",
            defaultWidth = 30.dp,
            defaultHeight = 30.dp,
            viewportWidth = 14f,
            viewportHeight = 14f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 6.644f)
                curveTo(1f, 7.287f, 1.191f, 7.86f, 1.573f, 8.364f)
                curveTo(1.956f, 8.868f, 2.448f, 9.215f, 3.056f, 9.401f)
                lineToRelative(-0.376f, 0.973f)
                curveToRelative(-0.017f, 0.081f, 0.012f, 0.127f, 0.081f, 0.127f)
                lineToRelative(1.234f, 0f)
                lineToRelative(-0.602f, 2.189f)
                lineToRelative(0.162f, 0f)
                lineToRelative(2.299f, -3.023f)
                curveToRelative(0.023f, -0.023f, 0.023f, -0.052f, 0.012f, -0.081f)
                curveToRelative(-0.012f, -0.029f, -0.041f, -0.041f, -0.081f, -0.041f)
                lineToRelative(-1.263f, 0f)
                lineTo(5.958f, 6.858f)
                curveTo(5.992f, 6.777f, 5.969f, 6.736f, 5.876f, 6.736f)
                lineToRelative(-1.703f, 0f)
                curveToRelative(-0.052f, 0f, -0.098f, 0.029f, -0.127f, 0.081f)
                lineTo(3.415f, 8.48f)
                curveTo(3.004f, 8.375f, 2.662f, 8.15f, 2.39f, 7.808f)
                curveTo(2.118f, 7.466f, 1.985f, 7.078f, 1.985f, 6.644f)
                curveToRelative(0f, -0.481f, 0.162f, -0.898f, 0.486f, -1.251f)
                curveToRelative(0.324f, -0.353f, 0.73f, -0.556f, 1.216f, -0.614f)
                lineTo(3.988f, 4.738f)
                curveToRelative(0.075f, 0f, 0.116f, -0.035f, 0.116f, -0.098f)
                lineToRelative(0.041f, -0.301f)
                curveTo(4.203f, 3.713f, 4.463f, 3.186f, 4.932f, 2.764f)
                curveTo(5.402f, 2.341f, 5.952f, 2.126f, 6.583f, 2.126f)
                curveToRelative(0.631f, 0f, 1.181f, 0.214f, 1.651f, 0.637f)
                curveToRelative(0.475f, 0.423f, 0.741f, 0.95f, 0.811f, 1.575f)
                lineToRelative(0.035f, 0.336f)
                curveToRelative(0f, 0.069f, 0.035f, 0.104f, 0.11f, 0.104f)
                lineToRelative(0.932f, 0f)
                curveToRelative(0.527f, 0f, 0.973f, 0.185f, 1.344f, 0.55f)
                curveToRelative(0.371f, 0.365f, 0.556f, 0.805f, 0.556f, 1.32f)
                curveToRelative(0f, 0.492f, -0.174f, 0.921f, -0.515f, 1.28f)
                curveToRelative(-0.342f, 0.359f, -0.764f, 0.556f, -1.268f, 0.597f)
                curveToRelative(-0.075f, 0f, -0.116f, 0.035f, -0.116f, 0.11f)
                lineToRelative(0f, 0.793f)
                curveToRelative(0f, 0.064f, 0.041f, 0.098f, 0.116f, 0.098f)
                curveToRelative(0.376f, -0.012f, 0.736f, -0.098f, 1.077f, -0.255f)
                curveToRelative(0.342f, -0.156f, 0.637f, -0.365f, 0.88f, -0.62f)
                curveTo(12.438f, 8.399f, 12.635f, 8.097f, 12.78f, 7.744f)
                curveTo(12.925f, 7.397f, 13f, 7.032f, 13f, 6.655f)
                curveTo(13f, 6.134f, 12.873f, 5.653f, 12.612f, 5.213f)
                curveTo(12.351f, 4.773f, 12.004f, 4.426f, 11.564f, 4.171f)
                curveTo(11.124f, 3.916f, 10.643f, 3.789f, 10.127f, 3.789f)
                lineToRelative(-0.185f, 0f)
                curveTo(9.751f, 3.018f, 9.346f, 2.387f, 8.72f, 1.901f)
                curveTo(8.095f, 1.414f, 7.388f, 1.165f, 6.589f, 1.165f)
                curveTo(5.772f, 1.165f, 5.042f, 1.42f, 4.411f, 1.924f)
                curveTo(3.78f, 2.428f, 3.375f, 3.076f, 3.195f, 3.87f)
                curveTo(2.558f, 4.02f, 2.031f, 4.35f, 1.614f, 4.872f)
                curveTo(1.197f, 5.393f, 1f, 5.978f, 1f, 6.644f)
                close()
                moveTo(5.726f, 12.354f)
                curveToRelative(0f, 0.093f, 0.029f, 0.18f, 0.087f, 0.266f)
                curveToRelative(0.058f, 0.087f, 0.151f, 0.151f, 0.266f, 0.185f)
                curveToRelative(0.081f, 0.017f, 0.127f, 0.029f, 0.145f, 0.029f)
                curveToRelative(0.052f, 0f, 0.122f, -0.017f, 0.22f, -0.058f)
                curveToRelative(0.122f, -0.052f, 0.203f, -0.156f, 0.243f, -0.301f)
                lineToRelative(0.162f, -0.608f)
                curveToRelative(0.035f, -0.127f, 0.023f, -0.249f, -0.046f, -0.365f)
                curveToRelative(-0.069f, -0.116f, -0.168f, -0.191f, -0.307f, -0.232f)
                curveToRelative(-0.127f, -0.035f, -0.249f, -0.023f, -0.365f, 0.046f)
                curveToRelative(-0.116f, 0.069f, -0.197f, 0.168f, -0.237f, 0.307f)
                lineToRelative(-0.156f, 0.579f)
                curveToRelative(-0.006f, 0.098f, -0.012f, 0.151f, -0.012f, 0.151f)
                close()
                moveTo(6.502f, 9.592f)
                curveToRelative(0f, 0.081f, 0.029f, 0.168f, 0.087f, 0.255f)
                curveToRelative(0.058f, 0.087f, 0.145f, 0.151f, 0.261f, 0.191f)
                curveToRelative(0.127f, 0.041f, 0.255f, 0.035f, 0.371f, -0.029f)
                curveToRelative(0.116f, -0.064f, 0.191f, -0.162f, 0.232f, -0.301f)
                lineTo(7.625f, 9.105f)
                curveTo(7.66f, 8.978f, 7.643f, 8.856f, 7.579f, 8.74f)
                curveTo(7.51f, 8.625f, 7.405f, 8.543f, 7.272f, 8.503f)
                curveTo(7.139f, 8.468f, 7.017f, 8.48f, 6.896f, 8.549f)
                curveTo(6.774f, 8.619f, 6.699f, 8.717f, 6.658f, 8.85f)
                lineTo(6.519f, 9.435f)
                curveToRelative(-0.012f, 0.098f, -0.017f, 0.151f, -0.017f, 0.156f)
                close()
                moveTo(8.135f, 10.547f)
                curveToRelative(0f, 0.098f, 0.029f, 0.197f, 0.093f, 0.295f)
                curveToRelative(0.064f, 0.098f, 0.156f, 0.162f, 0.272f, 0.203f)
                curveToRelative(0.012f, 0f, 0.035f, 0.006f, 0.069f, 0.012f)
                curveToRelative(0.029f, 0.006f, 0.052f, 0.012f, 0.069f, 0.012f)
                curveToRelative(0.075f, 0f, 0.151f, -0.012f, 0.22f, -0.046f)
                curveToRelative(0.11f, -0.041f, 0.191f, -0.151f, 0.237f, -0.33f)
                lineTo(9.241f, 10.107f)
                curveTo(9.282f, 9.974f, 9.27f, 9.847f, 9.207f, 9.725f)
                curveTo(9.143f, 9.603f, 9.044f, 9.522f, 8.917f, 9.482f)
                curveTo(8.772f, 9.447f, 8.639f, 9.464f, 8.523f, 9.528f)
                curveTo(8.407f, 9.597f, 8.332f, 9.702f, 8.309f, 9.835f)
                lineToRelative(-0.156f, 0.597f)
                curveToRelative(-0.012f, 0.035f, -0.017f, 0.075f, -0.017f, 0.116f)
                close()
                moveTo(8.923f, 7.773f)
                curveToRelative(-0.006f, 0.093f, 0.023f, 0.18f, 0.087f, 0.272f)
                curveToRelative(0.064f, 0.093f, 0.156f, 0.162f, 0.284f, 0.22f)
                curveToRelative(0.046f, 0.023f, 0.093f, 0.035f, 0.151f, 0.035f)
                curveToRelative(0.064f, 0f, 0.127f, -0.017f, 0.197f, -0.046f)
                curveTo(9.763f, 8.196f, 9.844f, 8.086f, 9.896f, 7.924f)
                lineToRelative(0.168f, -0.597f)
                curveToRelative(0.012f, -0.075f, 0.017f, -0.116f, 0.017f, -0.127f)
                curveToRelative(0f, -0.098f, -0.029f, -0.191f, -0.093f, -0.284f)
                curveToRelative(-0.064f, -0.093f, -0.156f, -0.156f, -0.284f, -0.191f)
                curveToRelative(-0.012f, 0f, -0.035f, -0.006f, -0.064f, -0.012f)
                curveToRelative(-0.035f, -0.017f, -0.058f, -0.017f, -0.075f, -0.017f)
                curveToRelative(-0.098f, 0f, -0.191f, 0.029f, -0.284f, 0.087f)
                curveToRelative(-0.093f, 0.058f, -0.156f, 0.151f, -0.191f, 0.278f)
                lineTo(8.934f, 7.646f)
                curveToRelative(-0.006f, 0.046f, -0.012f, 0.087f, -0.012f, 0.127f)
                close()
            }
        }.build()

        return _Storm!!
    }

@Suppress("ObjectPropertyName")
private var _Storm: ImageVector? = null

