import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
private fun VectorPreview() {
    Image(Notificationline, null)
}

private var _Notificationline: ImageVector? = null

public val Notificationline: ImageVector
    get() {
        if (_Notificationline != null) {
            return _Notificationline!!
        }
        _Notificationline = ImageVector.Builder(
            name = "Notificationline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.1066f, 15.48f)
                curveTo(20.6623f, 15.1f, 20.4065f, 14.5446f, 20.4066f, 13.96f)
                verticalLineTo(9.14f)
                curveTo(20.4066f, 5.19f, 16.8266f, 2f, 12.4066f, 2f)
                curveTo(7.9866f, 2f, 4.4066f, 5.19f, 4.4066f, 9.14f)
                verticalLineTo(13.96f)
                curveTo(4.4066f, 14.5446f, 4.1508f, 15.1f, 3.7066f, 15.48f)
                curveTo(2.1966f, 16.83f, 3.2666f, 19.13f, 5.4066f, 19.13f)
                horizontalLineTo(9.20657f)
                curveTo(9.6914f, 20.4804f, 10.9718f, 21.3811f, 12.4066f, 21.3811f)
                curveTo(13.8414f, 21.3811f, 15.1217f, 20.4804f, 15.6066f, 19.13f)
                horizontalLineTo(19.4066f)
                curveTo(21.5466f, 19.13f, 22.6166f, 16.83f, 21.1066f, 15.48f)
                close()
                moveTo(12.4066f, 19.88f)
                curveTo(11.8114f, 19.8778f, 11.2505f, 19.601f, 10.8866f, 19.13f)
                horizontalLineTo(13.8866f)
                curveTo(13.5342f, 19.5936f, 12.9888f, 19.87f, 12.4066f, 19.88f)
                close()
                moveTo(19.4166f, 17.63f)
                curveTo(19.7801f, 17.6629f, 20.1263f, 17.468f, 20.2866f, 17.14f)
                curveTo(20.3644f, 16.9424f, 20.2935f, 16.7173f, 20.1166f, 16.6f)
                curveTo(19.3631f, 15.9279f, 18.9275f, 14.9696f, 18.9166f, 13.96f)
                verticalLineTo(9.14f)
                curveTo(18.9166f, 6.03f, 15.9966f, 3.5f, 12.4166f, 3.5f)
                curveTo(8.8366f, 3.5f, 5.9166f, 6.03f, 5.9166f, 9.14f)
                verticalLineTo(13.96f)
                curveTo(5.9056f, 14.9696f, 5.47f, 15.9279f, 4.7166f, 16.6f)
                curveTo(4.5359f, 16.7144f, 4.4607f, 16.9401f, 4.5366f, 17.14f)
                curveTo(4.6969f, 17.468f, 5.043f, 17.6629f, 5.4066f, 17.63f)
                horizontalLineTo(19.4166f)
                close()
            }
        }.build()
        return _Notificationline!!
    }

