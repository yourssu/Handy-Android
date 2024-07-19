package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Layoutfilled, null)
}

private var _Layoutfilled: ImageVector? = null

public val Layoutfilled: ImageVector
    get() {
        if (_Layoutfilled != null) {
            return _Layoutfilled!!
        }
        _Layoutfilled = ImageVector.Builder(
            name = "Layoutfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(3f, 5.25977f)
                curveTo(3f, 4.0171f, 4.0074f, 3.0098f, 5.25f, 3.0098f)
                horizontalLineTo(8.34f)
                curveTo(9.5826f, 3.0098f, 10.59f, 4.0171f, 10.59f, 5.2598f)
                verticalLineTo(8.34976f)
                curveTo(10.59f, 9.5924f, 9.5826f, 10.5998f, 8.34f, 10.5998f)
                horizontalLineTo(5.25f)
                curveTo(4.0074f, 10.5998f, 3f, 9.5924f, 3f, 8.3498f)
                verticalLineTo(5.25977f)
                close()
            }
            handyPath {
                moveTo(13.41f, 5.25977f)
                curveTo(13.41f, 4.0171f, 14.4174f, 3.0098f, 15.66f, 3.0098f)
                horizontalLineTo(18.75f)
                curveTo(19.9926f, 3.0098f, 21f, 4.0171f, 21f, 5.2598f)
                verticalLineTo(8.34976f)
                curveTo(21f, 9.5924f, 19.9926f, 10.5998f, 18.75f, 10.5998f)
                horizontalLineTo(15.66f)
                curveTo(14.4174f, 10.5998f, 13.41f, 9.5924f, 13.41f, 8.3498f)
                verticalLineTo(5.25977f)
                close()
            }
            handyPath {
                moveTo(3f, 15.6598f)
                curveTo(3f, 14.4171f, 4.0074f, 13.4098f, 5.25f, 13.4098f)
                horizontalLineTo(8.34f)
                curveTo(9.5826f, 13.4098f, 10.59f, 14.4171f, 10.59f, 15.6598f)
                verticalLineTo(18.7498f)
                curveTo(10.59f, 19.9924f, 9.5826f, 20.9998f, 8.34f, 20.9998f)
                horizontalLineTo(5.25f)
                curveTo(4.0074f, 20.9998f, 3f, 19.9924f, 3f, 18.7498f)
                verticalLineTo(15.6598f)
                close()
            }
            handyPath {
                moveTo(13.41f, 15.6598f)
                curveTo(13.41f, 14.4171f, 14.4174f, 13.4098f, 15.66f, 13.4098f)
                horizontalLineTo(18.75f)
                curveTo(19.9926f, 13.4098f, 21f, 14.4171f, 21f, 15.6598f)
                verticalLineTo(18.7498f)
                curveTo(21f, 19.9924f, 19.9926f, 20.9998f, 18.75f, 20.9998f)
                horizontalLineTo(15.66f)
                curveTo(14.4174f, 20.9998f, 13.41f, 19.9924f, 13.41f, 18.7498f)
                verticalLineTo(15.6598f)
                close()
            }
        }.build()
        return _Layoutfilled!!
    }

