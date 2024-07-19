package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Flamefilled, null)
}

private var _Flamefilled: ImageVector? = null

public val Flamefilled: ImageVector
    get() {
        if (_Flamefilled != null) {
            return _Flamefilled!!
        }
        _Flamefilled = ImageVector.Builder(
            name = "Flamefilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(12.0513f, 2f)
                lineTo(10.6813f, 4.8f)
                curveTo(9.7023f, 6.8003f, 8.3903f, 8.6196f, 6.8013f, 10.18f)
                lineTo(6.6213f, 10.35f)
                curveTo(5.6008f, 11.3408f, 5.0177f, 12.6977f, 5.0013f, 14.12f)
                verticalLineTo(14.3f)
                curveTo(4.9743f, 17.0851f, 6.6339f, 19.6101f, 9.2013f, 20.69f)
                lineTo(9.4613f, 20.8f)
                curveTo(11.1452f, 21.5152f, 13.0474f, 21.5152f, 14.7313f, 20.8f)
                horizontalLineTo(14.7913f)
                curveTo(17.3779f, 19.6762f, 19.0375f, 17.1099f, 19.0013f, 14.29f)
                verticalLineTo(9.95f)
                curveTo(18.1393f, 11.9185f, 16.5739f, 13.4946f, 14.6113f, 14.37f)
                curveTo(14.6113f, 14.37f, 14.6113f, 14.37f, 14.5513f, 14.37f)
                curveTo(14.4913f, 14.37f, 13.7913f, 14.66f, 13.4913f, 14.37f)
                curveTo(13.2234f, 14.0989f, 13.1977f, 13.6712f, 13.4313f, 13.37f)
                lineTo(13.5013f, 13.32f)
                horizontalLineTo(13.5513f)
                curveTo(15.8471f, 11.575f, 16.3823f, 8.3417f, 14.7713f, 5.95f)
                curveTo(13.4713f, 3.97f, 12.0513f, 2f, 12.0513f, 2f)
                close()
            }
        }.build()
        return _Flamefilled!!
    }

