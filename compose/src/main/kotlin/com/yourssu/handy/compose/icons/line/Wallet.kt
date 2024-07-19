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
    Image(Walletline, null)
}

private var _Walletline: ImageVector? = null

public val Walletline: ImageVector
    get() {
        if (_Walletline != null) {
            return _Walletline!!
        }
        _Walletline = ImageVector.Builder(
            name = "Walletline",
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
                moveTo(22f, 15.8182f)
                curveTo(22f, 18.3286f, 19.9649f, 20.3636f, 17.4545f, 20.3636f)
                horizontalLineTo(6.54545f)
                curveTo(4.0351f, 20.3636f, 2f, 18.3286f, 2f, 15.8182f)
                verticalLineTo(8.54545f)
                curveTo(2f, 6.0351f, 4.0351f, 4f, 6.5454f, 4f)
                horizontalLineTo(17.4545f)
                curveTo(19.9649f, 4f, 22f, 6.0351f, 22f, 8.5455f)
                verticalLineTo(15.8182f)
                close()
                moveTo(6.54545f, 5.62727f)
                horizontalLineTo(17.4545f)
                curveTo(19.0662f, 5.6273f, 20.3727f, 6.9338f, 20.3727f, 8.5455f)
                verticalLineTo(9.45455f)
                horizontalLineTo(17.4545f)
                curveTo(15.9483f, 9.4545f, 14.7273f, 10.6756f, 14.7273f, 12.1818f)
                curveTo(14.7273f, 13.688f, 15.9483f, 14.9091f, 17.4545f, 14.9091f)
                horizontalLineTo(20.3727f)
                verticalLineTo(15.8182f)
                curveTo(20.3727f, 17.4298f, 19.0662f, 18.7364f, 17.4545f, 18.7364f)
                horizontalLineTo(6.54545f)
                curveTo(4.9338f, 18.7364f, 3.6273f, 17.4298f, 3.6273f, 15.8182f)
                verticalLineTo(8.54545f)
                curveTo(3.6273f, 6.9338f, 4.9338f, 5.6273f, 6.5454f, 5.6273f)
                close()
                moveTo(20.3727f, 13.2818f)
                verticalLineTo(11.0818f)
                horizontalLineTo(17.4545f)
                curveTo(16.847f, 11.0818f, 16.3545f, 11.5743f, 16.3545f, 12.1818f)
                curveTo(16.3545f, 12.7893f, 16.847f, 13.2818f, 17.4545f, 13.2818f)
                horizontalLineTo(20.3727f)
                close()
            }
        }.build()
        return _Walletline!!
    }

