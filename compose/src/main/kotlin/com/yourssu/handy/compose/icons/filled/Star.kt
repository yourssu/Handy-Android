package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Starfilled, null)
}

private var _Starfilled: ImageVector? = null

public val Starfilled: ImageVector
    get() {
        if (_Starfilled != null) {
            return _Starfilled!!
        }
        _Starfilled = ImageVector.Builder(
            name = "Starfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(14.4399f, 4.53675f)
                lineTo(15.0999f, 6.53675f)
                curveTo(15.3982f, 7.4624f, 16.2574f, 8.0917f, 17.2299f, 8.0968f)
                horizontalLineTo(19.3099f)
                curveTo(20.2854f, 8.0906f, 21.1528f, 8.7164f, 21.4544f, 9.6441f)
                curveTo(21.756f, 10.5718f, 21.4226f, 11.5881f, 20.6299f, 12.1568f)
                lineTo(18.9199f, 13.3968f)
                curveTo(18.1328f, 13.9682f, 17.802f, 14.9808f, 18.0999f, 15.9068f)
                lineTo(18.7599f, 17.9068f)
                curveTo(19.0864f, 18.8359f, 18.7677f, 19.8692f, 17.9746f, 20.4531f)
                curveTo(17.1816f, 21.037f, 16.1002f, 21.0344f, 15.3099f, 20.4468f)
                lineTo(13.6299f, 19.1968f)
                curveTo(12.8424f, 18.6262f, 11.7775f, 18.6262f, 10.9899f, 19.1968f)
                lineTo(9.30993f, 20.4468f)
                curveTo(8.5241f, 21.0219f, 7.4566f, 21.0235f, 6.6691f, 20.4505f)
                curveTo(5.8816f, 19.8776f, 5.5545f, 18.8615f, 5.8599f, 17.9368f)
                lineTo(6.51993f, 15.9368f)
                curveTo(6.8179f, 15.0108f, 6.4871f, 13.9982f, 5.6999f, 13.4268f)
                lineTo(3.94993f, 12.1668f)
                curveTo(3.1412f, 11.5969f, 2.8021f, 10.5641f, 3.1156f, 9.6258f)
                curveTo(3.4292f, 8.6875f, 4.3211f, 8.066f, 5.3099f, 8.0968f)
                horizontalLineTo(7.38993f)
                curveTo(8.3571f, 8.0946f, 9.2147f, 7.4745f, 9.5199f, 6.5568f)
                lineTo(10.1799f, 4.55675f)
                curveTo(10.4758f, 3.633f, 11.3327f, 3.0046f, 12.3027f, 3f)
                curveTo(13.2727f, 2.9955f, 14.1354f, 3.6158f, 14.4399f, 4.5367f)
                close()
            }
        }.build()
        return _Starfilled!!
    }

