package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Shoppingcartfilled, null)
}

private var _Shoppingcartfilled: ImageVector? = null

public val Shoppingcartfilled: ImageVector
    get() {
        if (_Shoppingcartfilled != null) {
            return _Shoppingcartfilled!!
        }
        _Shoppingcartfilled = ImageVector.Builder(
            name = "Shoppingcartfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(20.6797f, 14.4001f)
                lineTo(21.2797f, 10.2601f)
                lineTo(21.2397f, 10.2201f)
                curveTo(21.3729f, 9.309f, 21.1047f, 8.3849f, 20.5043f, 7.6867f)
                curveTo(19.904f, 6.9886f, 19.0305f, 6.5849f, 18.1097f, 6.5801f)
                horizontalLineTo(7.67973f)
                lineTo(7.46973f, 5.89012f)
                curveTo(7.0698f, 4.5616f, 5.857f, 3.6439f, 4.4697f, 3.6201f)
                horizontalLineTo(3.46973f)
                curveTo(3.0555f, 3.6201f, 2.7197f, 3.9559f, 2.7197f, 4.3701f)
                curveTo(2.7197f, 4.7843f, 3.0555f, 5.1201f, 3.4697f, 5.1201f)
                horizontalLineTo(4.46973f)
                curveTo(5.2127f, 5.1201f, 5.8674f, 5.6081f, 6.0797f, 6.3201f)
                lineTo(8.60973f, 14.8501f)
                curveTo(9.018f, 16.1942f, 10.255f, 17.1149f, 11.6597f, 17.1201f)
                horizontalLineTo(17.5297f)
                curveTo(19.1064f, 17.1133f, 20.4432f, 15.959f, 20.6797f, 14.4001f)
                close()
            }
            handyPath {
                moveTo(11.4297f, 18.3801f)
                curveTo(10.8774f, 18.3801f, 10.4297f, 18.8278f, 10.4297f, 19.3801f)
                curveTo(10.4297f, 19.9324f, 10.8774f, 20.3801f, 11.4297f, 20.3801f)
                curveTo(11.982f, 20.3801f, 12.4297f, 19.9324f, 12.4297f, 19.3801f)
                curveTo(12.4297f, 18.8278f, 11.982f, 18.3801f, 11.4297f, 18.3801f)
                close()
            }
            handyPath {
                moveTo(17.4297f, 18.3801f)
                curveTo(16.8774f, 18.3801f, 16.4297f, 18.8278f, 16.4297f, 19.3801f)
                curveTo(16.4297f, 19.9324f, 16.8774f, 20.3801f, 17.4297f, 20.3801f)
                curveTo(17.982f, 20.3801f, 18.4297f, 19.9324f, 18.4297f, 19.3801f)
                curveTo(18.4297f, 18.8278f, 17.982f, 18.3801f, 17.4297f, 18.3801f)
                close()
            }
        }.build()
        return _Shoppingcartfilled!!
    }

