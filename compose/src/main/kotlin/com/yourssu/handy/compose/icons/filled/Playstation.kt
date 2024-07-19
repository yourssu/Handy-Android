package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Playstationfilled, null)
}

private var _Playstationfilled: ImageVector? = null

public val Playstationfilled: ImageVector
    get() {
        if (_Playstationfilled != null) {
            return _Playstationfilled!!
        }
        _Playstationfilled = ImageVector.Builder(
            name = "Playstationfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(10.7545f, 10.0367f)
                curveTo(10.3931f, 10.633f, 9.7473f, 10.9979f, 9.0501f, 11f)
                horizontalLineTo(5.11006f)
                curveTo(4.4057f, 11.0121f, 3.747f, 10.6527f, 3.3758f, 10.054f)
                curveTo(3.0047f, 9.4552f, 2.9759f, 8.7054f, 3.3001f, 8.08f)
                lineTo(5.30006f, 4.27998f)
                curveTo(5.6472f, 3.6191f, 6.3335f, 3.2065f, 7.0801f, 3.21f)
                curveTo(7.8122f, 3.2212f, 8.4797f, 3.6317f, 8.8201f, 4.28f)
                lineTo(10.8201f, 8.07998f)
                curveTo(11.1408f, 8.6991f, 11.116f, 9.4405f, 10.7545f, 10.0367f)
                close()
                moveTo(9.05006f, 8.99998f)
                lineTo(7.11006f, 5.20998f)
                lineTo(5.11006f, 8.99998f)
                horizontalLineTo(9.05006f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(20.9001f, 7f)
                curveTo(20.9001f, 9.2091f, 19.1092f, 11f, 16.9001f, 11f)
                curveTo(14.6909f, 11f, 12.9001f, 9.2091f, 12.9001f, 7f)
                curveTo(12.9001f, 4.7909f, 14.6909f, 3f, 16.9001f, 3f)
                curveTo(19.1092f, 3f, 20.9001f, 4.7909f, 20.9001f, 7f)
                close()
                moveTo(18.9001f, 7f)
                curveTo(18.9001f, 5.8954f, 18.0046f, 5f, 16.9001f, 5f)
                curveTo(15.7955f, 5f, 14.9001f, 5.8954f, 14.9001f, 7f)
                curveTo(14.9001f, 8.1046f, 15.7955f, 9f, 16.9001f, 9f)
                curveTo(18.0046f, 9f, 18.9001f, 8.1046f, 18.9001f, 7f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(14.9001f, 13f)
                horizontalLineTo(18.9001f)
                curveTo(20.0046f, 13f, 20.9001f, 13.8954f, 20.9001f, 15f)
                verticalLineTo(19f)
                curveTo(20.9001f, 20.1046f, 20.0046f, 21f, 18.9001f, 21f)
                horizontalLineTo(14.9001f)
                curveTo(13.7955f, 21f, 12.9001f, 20.1046f, 12.9001f, 19f)
                verticalLineTo(15f)
                curveTo(12.9001f, 13.8954f, 13.7955f, 13f, 14.9001f, 13f)
                close()
                moveTo(14.9001f, 19f)
                horizontalLineTo(18.9001f)
                verticalLineTo(15f)
                horizontalLineTo(14.9001f)
                verticalLineTo(19f)
                close()
            }
            handyPath {
                moveTo(10.7801f, 13f)
                curveTo(10.39f, 12.6123f, 9.7601f, 12.6123f, 9.3701f, 13f)
                lineTo(7.08006f, 15.27f)
                lineTo(4.78006f, 13f)
                curveTo(4.3833f, 12.6602f, 3.7919f, 12.6831f, 3.4225f, 13.0524f)
                curveTo(3.0531f, 13.4218f, 3.0303f, 14.0132f, 3.3701f, 14.41f)
                lineTo(5.66006f, 16.71f)
                lineTo(3.37006f, 19f)
                curveTo(3.0816f, 19.2861f, 2.9949f, 19.7183f, 3.1507f, 20.0935f)
                curveTo(3.3065f, 20.4687f, 3.6738f, 20.7124f, 4.0801f, 20.71f)
                curveTo(4.3438f, 20.7062f, 4.5954f, 20.5984f, 4.7801f, 20.41f)
                lineTo(7.08006f, 18.12f)
                lineTo(9.37006f, 20.41f)
                curveTo(9.5571f, 20.6009f, 9.8128f, 20.7089f, 10.0801f, 20.71f)
                curveTo(10.4845f, 20.7083f, 10.8481f, 20.4632f, 11.0013f, 20.0889f)
                curveTo(11.1546f, 19.7146f, 11.0672f, 19.2848f, 10.7801f, 19f)
                lineTo(8.49006f, 16.69f)
                lineTo(10.7801f, 14.39f)
                curveTo(11.1547f, 14.0024f, 11.1547f, 13.3876f, 10.7801f, 13f)
                close()
            }
        }.build()
        return _Playstationfilled!!
    }

