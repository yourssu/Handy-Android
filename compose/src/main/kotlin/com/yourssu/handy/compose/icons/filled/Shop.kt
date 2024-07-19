package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Shopfilled, null)
}

private var _Shopfilled: ImageVector? = null

public val Shopfilled: ImageVector
    get() {
        if (_Shopfilled != null) {
            return _Shopfilled!!
        }
        _Shopfilled = ImageVector.Builder(
            name = "Shopfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(20.2997f, 3.70004f)
                lineTo(21.9997f, 8.30004f)
                curveTo(22.3275f, 9.2011f, 22.2048f, 10.2045f, 21.6697f, 11f)
                curveTo(21.0626f, 11.8851f, 20.0722f, 12.4303f, 18.9997f, 12.47f)
                curveTo(17.3259f, 12.5979f, 15.8145f, 11.4708f, 15.4597f, 9.83f)
                curveTo(15.4597f, 9.83f, 15.3997f, 9.83f, 15.3897f, 9.83f)
                curveTo(15.0582f, 11.4212f, 13.6236f, 12.5385f, 11.9997f, 12.47f)
                curveTo(10.3832f, 12.5285f, 8.9599f, 11.4135f, 8.6297f, 9.83f)
                curveTo(8.6297f, 9.83f, 8.5697f, 9.83f, 8.5597f, 9.83f)
                curveTo(8.3661f, 10.71f, 7.8302f, 11.4767f, 7.0703f, 11.9608f)
                curveTo(6.3104f, 12.4448f, 5.389f, 12.6065f, 4.5097f, 12.41f)
                curveTo(3.7281f, 12.2816f, 3.0185f, 11.8771f, 2.5097f, 11.27f)
                curveTo(1.85f, 10.4344f, 1.6825f, 9.3118f, 2.0697f, 8.32f)
                lineTo(3.7297f, 3.70004f)
                curveTo(4.1197f, 2.7168f, 5.0823f, 2.0817f, 6.1397f, 2.11f)
                horizontalLineTo(17.8897f)
                curveTo(18.9471f, 2.0817f, 19.9097f, 2.7168f, 20.2997f, 3.7f)
                close()
            }
            handyPath {
                moveTo(19.0997f, 14f)
                verticalLineTo(19.1f)
                curveTo(19.084f, 19.6597f, 18.8465f, 20.1902f, 18.4395f, 20.5747f)
                curveTo(18.0325f, 20.9592f, 17.4894f, 21.1662f, 16.9297f, 21.15f)
                horizontalLineTo(14.0997f)
                verticalLineTo(18f)
                curveTo(14.0458f, 16.9486f, 13.1513f, 16.1391f, 12.0997f, 16.19f)
                curveTo(11.58f, 16.1843f, 11.077f, 16.3734f, 10.6897f, 16.72f)
                curveTo(10.3171f, 17.0412f, 10.1019f, 17.5081f, 10.0997f, 18f)
                verticalLineTo(21.15f)
                horizontalLineTo(7.2697f)
                curveTo(6.7032f, 21.1662f, 6.1541f, 20.9538f, 5.7459f, 20.5606f)
                curveTo(5.3377f, 20.1675f, 5.1048f, 19.6267f, 5.0997f, 19.06f)
                verticalLineTo(14f)
                horizontalLineTo(5.1797f)
                curveTo(6.433f, 14.0024f, 7.6434f, 13.5432f, 8.5797f, 12.71f)
                curveTo(10.5421f, 14.422f, 13.4673f, 14.422f, 15.4297f, 12.71f)
                curveTo(16.3696f, 13.5503f, 17.589f, 14.0102f, 18.8497f, 14f)
                horizontalLineTo(19.0997f)
                close()
            }
        }.build()
        return _Shopfilled!!
    }

