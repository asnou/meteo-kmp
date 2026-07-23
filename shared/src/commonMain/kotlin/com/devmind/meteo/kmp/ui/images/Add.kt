package com.devmind.meteo.kmp.ui.images

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AddIcon: ImageVector
    get() {
        if (_PlusSolidFull != null) {
            return _PlusSolidFull!!
        }
        _PlusSolidFull = ImageVector.Builder(
            name = "PlusSolidFull",
            defaultWidth = 640.dp,
            defaultHeight = 640.dp,
            viewportWidth = 640f,
            viewportHeight = 640f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(352f, 128f)
                curveTo(352f, 110.3f, 337.7f, 96f, 320f, 96f)
                curveTo(302.3f, 96f, 288f, 110.3f, 288f, 128f)
                lineTo(288f, 288f)
                lineTo(128f, 288f)
                curveTo(110.3f, 288f, 96f, 302.3f, 96f, 320f)
                curveTo(96f, 337.7f, 110.3f, 352f, 128f, 352f)
                lineTo(288f, 352f)
                lineTo(288f, 512f)
                curveTo(288f, 529.7f, 302.3f, 544f, 320f, 544f)
                curveTo(337.7f, 544f, 352f, 529.7f, 352f, 512f)
                lineTo(352f, 352f)
                lineTo(512f, 352f)
                curveTo(529.7f, 352f, 544f, 337.7f, 544f, 320f)
                curveTo(544f, 302.3f, 529.7f, 288f, 512f, 288f)
                lineTo(352f, 288f)
                lineTo(352f, 128f)
                close()
            }
        }.build()

        return _PlusSolidFull!!
    }

@Suppress("ObjectPropertyName")
private var _PlusSolidFull: ImageVector? = null

