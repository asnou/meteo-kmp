package com.devmind.meteo.kmp.ui.images

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SuccessState: ImageVector
    get() {
        if (_CheckSolidFull1 != null) {
            return _CheckSolidFull1!!
        }
        _CheckSolidFull1 =
            ImageVector
                .Builder(
                    name = "CheckSolidFull1",
                    defaultWidth = 640.dp,
                    defaultHeight = 640.dp,
                    viewportWidth = 640f,
                    viewportHeight = 640f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(530.8f, 134.1f)
                        curveTo(545.1f, 144.5f, 548.3f, 164.5f, 537.9f, 178.8f)
                        lineTo(281.9f, 530.8f)
                        curveTo(276.4f, 538.4f, 267.9f, 543.1f, 258.5f, 543.9f)
                        curveTo(249.1f, 544.7f, 240f, 541.2f, 233.4f, 534.6f)
                        lineTo(105.4f, 406.6f)
                        curveTo(92.9f, 394.1f, 92.9f, 373.8f, 105.4f, 361.3f)
                        curveTo(117.9f, 348.8f, 138.2f, 348.8f, 150.7f, 361.3f)
                        lineTo(252.2f, 462.8f)
                        lineTo(486.2f, 141.1f)
                        curveTo(496.6f, 126.8f, 516.6f, 123.6f, 530.9f, 134f)
                        close()
                    }
                }.build()

        return _CheckSolidFull1!!
    }

@Suppress("ObjectPropertyName")
private var _CheckSolidFull1: ImageVector? = null
