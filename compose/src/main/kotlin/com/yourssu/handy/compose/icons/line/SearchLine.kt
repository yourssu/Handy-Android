import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(SearchLine, null)
}

private var _SearchLine: ImageVector? = null

public val SearchLine: ImageVector
    get() {
        if (_SearchLine != null) {
            return _SearchLine!!
        }
        _SearchLine = ImageVector.Builder(
            name = "SearchLine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(19.9382f, 7.66933f)
                curveTo(18.512f, 4.2447f, 15.1704f, 2.01f, 11.4607f, 2.0001f)
                curveTo(7.4625f, 1.9791f, 3.9074f, 4.5401f, 2.661f, 8.3391f)
                curveTo(1.4147f, 12.1381f, 2.7619f, 16.3074f, 5.9956f, 18.6588f)
                curveTo(9.2293f, 21.0103f, 13.6107f, 21.0068f, 16.8407f, 18.6501f)
                lineTo(19.7207f, 21.5301f)
                curveTo(20.0135f, 21.8226f, 20.4878f, 21.8226f, 20.7807f, 21.5301f)
                curveTo(21.0731f, 21.2373f, 21.0731f, 20.7629f, 20.7807f, 20.4701f)
                lineTo(17.9907f, 17.6801f)
                curveTo(20.5968f, 15.04f, 21.3644f, 11.094f, 19.9382f, 7.6693f)
                close()
                moveTo(18.6011f, 14.1691f)
                curveTo(17.4036f, 17.0547f, 14.5849f, 18.9342f, 11.4607f, 18.9301f)
                verticalLineTo(18.8901f)
                curveTo(7.2204f, 18.8847f, 3.7781f, 15.4603f, 3.7507f, 11.2201f)
                curveTo(3.7466f, 8.0959f, 5.6261f, 5.2772f, 8.5117f, 4.0797f)
                curveTo(11.3974f, 2.8822f, 14.7203f, 3.5421f, 16.9295f, 5.7513f)
                curveTo(19.1387f, 7.9605f, 19.7986f, 11.2834f, 18.6011f, 14.1691f)
                close()
            }
        }.build()
        return _SearchLine!!
    }

