package com.devmind.meteo.kmp.ui.images

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cloudy: ImageVector
    get() {
        if (_Cloudy != null) {
            return _Cloudy!!
        }
        _Cloudy = ImageVector.Builder(
            name = "Cloudy",
            defaultWidth = 30.dp,
            defaultHeight = 30.dp,
            viewportWidth = 14f,
            viewportHeight = 14f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 8.305f)
                curveToRelative(0f, -0.664f, 0.208f, -1.253f, 0.624f, -1.773f)
                curveToRelative(0.416f, -0.52f, 0.941f, -0.855f, 1.582f, -0.999f)
                curveToRelative(0.179f, -0.791f, 0.589f, -1.438f, 1.218f, -1.946f)
                curveToRelative(0.629f, -0.508f, 1.357f, -0.762f, 2.171f, -0.762f)
                curveToRelative(0.797f, 0f, 1.507f, 0.248f, 2.131f, 0.739f)
                curveToRelative(0.624f, 0.491f, 1.028f, 1.126f, 1.213f, 1.9f)
                lineToRelative(0.191f, 0f)
                curveToRelative(0.52f, 0f, 0.999f, 0.127f, 1.438f, 0.375f)
                curveToRelative(0.439f, 0.248f, 0.791f, 0.595f, 1.045f, 1.034f)
                curveTo(12.867f, 7.312f, 13f, 7.785f, 13f, 8.305f)
                curveToRelative(0f, 0.508f, -0.121f, 0.982f, -0.364f, 1.415f)
                curveToRelative(-0.243f, 0.433f, -0.577f, 0.78f, -0.999f, 1.039f)
                curveToRelative(-0.422f, 0.26f, -0.889f, 0.398f, -1.392f, 0.416f)
                lineToRelative(-6.474f, 0f)
                curveTo(2.998f, 11.141f, 2.346f, 10.846f, 1.808f, 10.292f)
                curveTo(1.271f, 9.743f, 1f, 9.079f, 1f, 8.305f)
                close()
                moveTo(1.987f, 8.305f)
                curveToRelative(0f, 0.502f, 0.173f, 0.936f, 0.52f, 1.305f)
                curveToRelative(0.346f, 0.37f, 0.768f, 0.566f, 1.265f, 0.595f)
                lineToRelative(6.462f, 0f)
                curveToRelative(0.497f, -0.023f, 0.918f, -0.225f, 1.265f, -0.595f)
                curveToRelative(0.352f, -0.37f, 0.526f, -0.808f, 0.526f, -1.305f)
                curveToRelative(0f, -0.508f, -0.191f, -0.941f, -0.566f, -1.311f)
                curveToRelative(-0.375f, -0.37f, -0.82f, -0.554f, -1.34f, -0.554f)
                lineToRelative(-0.924f, 0f)
                curveToRelative(-0.064f, 0f, -0.098f, -0.035f, -0.098f, -0.104f)
                lineTo(9.056f, 6.007f)
                curveTo(8.992f, 5.383f, 8.721f, 4.858f, 8.247f, 4.436f)
                curveTo(7.774f, 4.014f, 7.225f, 3.801f, 6.596f, 3.801f)
                curveToRelative(-0.629f, 0f, -1.184f, 0.214f, -1.646f, 0.635f)
                curveToRelative(-0.468f, 0.422f, -0.733f, 0.947f, -0.791f, 1.571f)
                lineToRelative(-0.046f, 0.329f)
                curveToRelative(0f, 0.069f, -0.04f, 0.104f, -0.115f, 0.104f)
                lineToRelative(-0.306f, 0f)
                curveToRelative(-0.485f, 0.058f, -0.889f, 0.266f, -1.213f, 0.618f)
                curveToRelative(-0.323f, 0.352f, -0.491f, 0.768f, -0.491f, 1.247f)
                close()
            }
        }.build()

        return _Cloudy!!
    }

@Suppress("ObjectPropertyName")
private var _Cloudy: ImageVector? = null

