package com.devmind.meteo.kmp.ui.images

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Wind: ImageVector
    get() {
        if (_Wind != null) {
            return _Wind!!
        }
        _Wind = ImageVector.Builder(
            name = "Wind",
            defaultWidth = 640.dp,
            defaultHeight = 640.dp,
            viewportWidth = 640f,
            viewportHeight = 640f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(352f, 96f)
                curveTo(352f, 113.7f, 366.3f, 128f, 384f, 128f)
                lineTo(424f, 128f)
                curveTo(437.3f, 128f, 448f, 138.7f, 448f, 152f)
                curveTo(448f, 165.3f, 437.3f, 176f, 424f, 176f)
                lineTo(96f, 176f)
                curveTo(78.3f, 176f, 64f, 190.3f, 64f, 208f)
                curveTo(64f, 225.7f, 78.3f, 240f, 96f, 240f)
                lineTo(424f, 240f)
                curveTo(472.6f, 240f, 512f, 200.6f, 512f, 152f)
                curveTo(512f, 103.4f, 472.6f, 64f, 424f, 64f)
                lineTo(384f, 64f)
                curveTo(366.3f, 64f, 352f, 78.3f, 352f, 96f)
                close()
                moveTo(416f, 448f)
                curveTo(416f, 465.7f, 430.3f, 480f, 448f, 480f)
                lineTo(480f, 480f)
                curveTo(533f, 480f, 576f, 437f, 576f, 384f)
                curveTo(576f, 331f, 533f, 288f, 480f, 288f)
                lineTo(96f, 288f)
                curveTo(78.3f, 288f, 64f, 302.3f, 64f, 320f)
                curveTo(64f, 337.7f, 78.3f, 352f, 96f, 352f)
                lineTo(480f, 352f)
                curveTo(497.7f, 352f, 512f, 366.3f, 512f, 384f)
                curveTo(512f, 401.7f, 497.7f, 416f, 480f, 416f)
                lineTo(448f, 416f)
                curveTo(430.3f, 416f, 416f, 430.3f, 416f, 448f)
                close()
                moveTo(192f, 576f)
                lineTo(232f, 576f)
                curveTo(280.6f, 576f, 320f, 536.6f, 320f, 488f)
                curveTo(320f, 439.4f, 280.6f, 400f, 232f, 400f)
                lineTo(96f, 400f)
                curveTo(78.3f, 400f, 64f, 414.3f, 64f, 432f)
                curveTo(64f, 449.7f, 78.3f, 464f, 96f, 464f)
                lineTo(232f, 464f)
                curveTo(245.3f, 464f, 256f, 474.7f, 256f, 488f)
                curveTo(256f, 501.3f, 245.3f, 512f, 232f, 512f)
                lineTo(192f, 512f)
                curveTo(174.3f, 512f, 160f, 526.3f, 160f, 544f)
                curveTo(160f, 561.7f, 174.3f, 576f, 192f, 576f)
                close()
            }
        }.build()

        return _Wind!!
    }

@Suppress("ObjectPropertyName")
private var _Wind: ImageVector? = null

