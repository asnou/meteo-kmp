package com.devmind.meteo.kmp.ui.images

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PartlyCloudy: ImageVector
    get() {
        if (_PartlyCloudy != null) {
            return _PartlyCloudy!!
        }
        _PartlyCloudy = ImageVector.Builder(
            name = "PartlyCloudy",
            defaultWidth = 30.dp,
            defaultHeight = 30.dp,
            viewportWidth = 14f,
            viewportHeight = 14f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 9.464f)
                curveToRelative(0f, 0.402f, 0.098f, 0.772f, 0.295f, 1.112f)
                curveToRelative(0.196f, 0.339f, 0.464f, 0.607f, 0.804f, 0.804f)
                curveToRelative(0.339f, 0.196f, 0.705f, 0.295f, 1.103f, 0.295f)
                lineToRelative(4.835f, 0f)
                curveToRelative(0.397f, 0f, 0.768f, -0.098f, 1.107f, -0.295f)
                curveTo(9.482f, 11.183f, 9.754f, 10.915f, 9.951f, 10.576f)
                curveTo(10.147f, 10.237f, 10.25f, 9.866f, 10.25f, 9.464f)
                curveToRelative(0f, -0.295f, -0.063f, -0.594f, -0.188f, -0.893f)
                curveToRelative(0.339f, -0.411f, 0.509f, -0.906f, 0.509f, -1.473f)
                curveToRelative(0f, -0.317f, -0.063f, -0.621f, -0.183f, -0.911f)
                curveToRelative(-0.121f, -0.29f, -0.29f, -0.536f, -0.5f, -0.746f)
                curveTo(9.679f, 5.232f, 9.433f, 5.063f, 9.143f, 4.942f)
                curveTo(8.853f, 4.817f, 8.549f, 4.759f, 8.232f, 4.759f)
                curveTo(7.571f, 4.759f, 6.996f, 5.018f, 6.5f, 5.536f)
                curveTo(6.156f, 5.339f, 5.754f, 5.241f, 5.295f, 5.241f)
                curveTo(4.665f, 5.241f, 4.112f, 5.438f, 3.629f, 5.826f)
                curveTo(3.147f, 6.214f, 2.835f, 6.714f, 2.701f, 7.321f)
                curveTo(2.201f, 7.438f, 1.795f, 7.692f, 1.478f, 8.094f)
                curveTo(1.161f, 8.496f, 1f, 8.951f, 1f, 9.464f)
                close()
                moveTo(1.763f, 9.464f)
                curveToRelative(0f, -0.375f, 0.125f, -0.696f, 0.375f, -0.969f)
                curveToRelative(0.25f, -0.272f, 0.563f, -0.429f, 0.938f, -0.473f)
                lineToRelative(0.223f, -0.013f)
                curveToRelative(0.054f, 0f, 0.085f, -0.027f, 0.085f, -0.08f)
                lineTo(3.415f, 7.688f)
                curveTo(3.478f, 7.205f, 3.688f, 6.799f, 4.045f, 6.478f)
                curveTo(4.402f, 6.152f, 4.821f, 5.991f, 5.299f, 5.991f)
                curveToRelative(0.491f, 0f, 0.92f, 0.165f, 1.281f, 0.491f)
                curveToRelative(0.366f, 0.326f, 0.567f, 0.728f, 0.612f, 1.21f)
                lineToRelative(0.031f, 0.259f)
                curveToRelative(0.009f, 0.049f, 0.04f, 0.076f, 0.094f, 0.076f)
                lineToRelative(0.719f, 0f)
                curveToRelative(0.393f, 0f, 0.732f, 0.143f, 1.018f, 0.429f)
                curveToRelative(0.286f, 0.286f, 0.429f, 0.621f, 0.429f, 1.013f)
                curveToRelative(0f, 0.406f, -0.143f, 0.75f, -0.424f, 1.036f)
                curveToRelative(-0.281f, 0.286f, -0.625f, 0.429f, -1.018f, 0.429f)
                lineToRelative(-4.839f, 0f)
                curveTo(2.808f, 10.933f, 2.473f, 10.79f, 2.188f, 10.5f)
                curveTo(1.906f, 10.21f, 1.763f, 9.866f, 1.763f, 9.464f)
                close()
                moveTo(4.754f, 3.987f)
                curveToRelative(0f, 0.107f, 0.036f, 0.201f, 0.107f, 0.281f)
                lineTo(5.156f, 4.554f)
                curveToRelative(0.112f, 0.085f, 0.205f, 0.121f, 0.286f, 0.112f)
                curveToRelative(0.094f, 0f, 0.174f, -0.04f, 0.246f, -0.116f)
                curveToRelative(0.071f, -0.076f, 0.107f, -0.17f, 0.107f, -0.277f)
                curveToRelative(0f, -0.107f, -0.04f, -0.196f, -0.116f, -0.263f)
                lineTo(5.415f, 3.714f)
                curveTo(5.335f, 3.643f, 5.246f, 3.607f, 5.143f, 3.607f)
                curveTo(5.036f, 3.607f, 4.942f, 3.643f, 4.866f, 3.719f)
                curveTo(4.79f, 3.79f, 4.754f, 3.879f, 4.754f, 3.987f)
                close()
                moveTo(7.138f, 5.964f)
                curveTo(7.446f, 5.665f, 7.813f, 5.518f, 8.232f, 5.518f)
                curveToRelative(0.442f, 0f, 0.817f, 0.152f, 1.125f, 0.46f)
                curveTo(9.665f, 6.286f, 9.821f, 6.656f, 9.821f, 7.098f)
                curveTo(9.821f, 7.375f, 9.746f, 7.652f, 9.594f, 7.92f)
                curveTo(9.161f, 7.491f, 8.643f, 7.277f, 8.036f, 7.277f)
                lineToRelative(-0.143f, 0f)
                curveTo(7.781f, 6.79f, 7.531f, 6.353f, 7.138f, 5.964f)
                close()
                moveTo(7.866f, 3.607f)
                curveToRelative(0f, 0.116f, 0.036f, 0.205f, 0.103f, 0.277f)
                curveToRelative(0.067f, 0.071f, 0.156f, 0.103f, 0.263f, 0.103f)
                curveToRelative(0.116f, 0f, 0.205f, -0.036f, 0.277f, -0.103f)
                curveToRelative(0.071f, -0.071f, 0.103f, -0.161f, 0.103f, -0.277f)
                lineToRelative(0f, -0.915f)
                curveTo(8.612f, 2.585f, 8.576f, 2.5f, 8.504f, 2.429f)
                curveTo(8.433f, 2.357f, 8.344f, 2.326f, 8.232f, 2.326f)
                curveTo(8.125f, 2.326f, 8.04f, 2.362f, 7.969f, 2.429f)
                curveTo(7.897f, 2.496f, 7.866f, 2.585f, 7.866f, 2.692f)
                lineToRelative(0f, 0.915f)
                close()
                moveTo(10.33f, 4.629f)
                curveToRelative(0f, 0.116f, 0.031f, 0.205f, 0.098f, 0.277f)
                curveToRelative(0.094f, 0.071f, 0.188f, 0.107f, 0.277f, 0.107f)
                curveToRelative(0.08f, 0f, 0.17f, -0.036f, 0.263f, -0.107f)
                lineToRelative(0.638f, -0.638f)
                curveToRelative(0.071f, -0.08f, 0.107f, -0.174f, 0.107f, -0.286f)
                curveToRelative(0f, -0.107f, -0.036f, -0.196f, -0.107f, -0.268f)
                curveToRelative(-0.071f, -0.071f, -0.161f, -0.107f, -0.263f, -0.107f)
                curveToRelative(-0.107f, 0f, -0.192f, 0.036f, -0.259f, 0.107f)
                lineToRelative(-0.656f, 0.638f)
                curveToRelative(-0.067f, 0.085f, -0.098f, 0.174f, -0.098f, 0.277f)
                close()
                moveTo(10.683f, 9.915f)
                curveToRelative(0f, 0.107f, 0.036f, 0.201f, 0.112f, 0.281f)
                lineToRelative(0.29f, 0.281f)
                curveToRelative(0.067f, 0.071f, 0.152f, 0.107f, 0.259f, 0.107f)
                curveToRelative(0.107f, 0f, 0.196f, -0.036f, 0.268f, -0.112f)
                curveToRelative(0.071f, -0.076f, 0.107f, -0.165f, 0.107f, -0.277f)
                curveToRelative(0f, -0.098f, -0.036f, -0.188f, -0.107f, -0.259f)
                lineTo(11.321f, 9.647f)
                curveToRelative(-0.071f, -0.071f, -0.156f, -0.107f, -0.254f, -0.107f)
                curveToRelative(-0.107f, 0f, -0.196f, 0.036f, -0.268f, 0.107f)
                curveToRelative(-0.076f, 0.071f, -0.116f, 0.161f, -0.116f, 0.268f)
                close()
                moveTo(11.339f, 7.098f)
                curveToRelative(0f, 0.103f, 0.04f, 0.188f, 0.116f, 0.259f)
                curveToRelative(0.071f, 0.071f, 0.165f, 0.107f, 0.272f, 0.107f)
                lineToRelative(0.911f, 0f)
                curveToRelative(0.103f, 0f, 0.188f, -0.036f, 0.259f, -0.103f)
                curveTo(12.969f, 7.295f, 13f, 7.205f, 13f, 7.098f)
                curveTo(13f, 6.991f, 12.964f, 6.902f, 12.897f, 6.83f)
                curveTo(12.83f, 6.759f, 12.741f, 6.719f, 12.638f, 6.719f)
                lineToRelative(-0.911f, 0f)
                curveToRelative(-0.107f, 0f, -0.196f, 0.036f, -0.272f, 0.112f)
                curveToRelative(-0.08f, 0.076f, -0.116f, 0.165f, -0.116f, 0.268f)
                close()
            }
        }.build()

        return _PartlyCloudy!!
    }

@Suppress("ObjectPropertyName")
private var _PartlyCloudy: ImageVector? = null

