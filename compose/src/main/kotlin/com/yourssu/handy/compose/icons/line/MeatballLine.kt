import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(MeatballLine, null)
}

private var _MeatballLine: ImageVector? = null

public val MeatballLine: ImageVector
    get() {
        if (_MeatballLine != null) {
            return _MeatballLine!!
        }
        _MeatballLine = ImageVector.Builder(
            name = "MeatballLine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF1C1B1F)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(6.46191f, 13f)
                    curveTo(6.1869f, 13f, 5.9515f, 12.9021f, 5.7557f, 12.7063f)
                    curveTo(5.5598f, 12.5104f, 5.4619f, 12.275f, 5.4619f, 12f)
                    curveTo(5.4619f, 11.725f, 5.5598f, 11.4896f, 5.7557f, 11.2938f)
                    curveTo(5.9515f, 11.0979f, 6.1869f, 11f, 6.4619f, 11f)
                    curveTo(6.7369f, 11f, 6.9723f, 11.0979f, 7.1682f, 11.2938f)
                    curveTo(7.364f, 11.4896f, 7.4619f, 11.725f, 7.4619f, 12f)
                    curveTo(7.4619f, 12.275f, 7.364f, 12.5104f, 7.1682f, 12.7063f)
                    curveTo(6.9723f, 12.9021f, 6.7369f, 13f, 6.4619f, 13f)
                    close()
                    moveTo(12.0004f, 13f)
                    curveTo(11.7254f, 13f, 11.49f, 12.9021f, 11.2942f, 12.7063f)
                    curveTo(11.0983f, 12.5104f, 11.0004f, 12.275f, 11.0004f, 12f)
                    curveTo(11.0004f, 11.725f, 11.0983f, 11.4896f, 11.2942f, 11.2938f)
                    curveTo(11.49f, 11.0979f, 11.7254f, 11f, 12.0004f, 11f)
                    curveTo(12.2754f, 11f, 12.5108f, 11.0979f, 12.7067f, 11.2938f)
                    curveTo(12.9025f, 11.4896f, 13.0004f, 11.725f, 13.0004f, 12f)
                    curveTo(13.0004f, 12.275f, 12.9025f, 12.5104f, 12.7067f, 12.7063f)
                    curveTo(12.5108f, 12.9021f, 12.2754f, 13f, 12.0004f, 13f)
                    close()
                    moveTo(17.5389f, 13f)
                    curveTo(17.2639f, 13f, 17.0285f, 12.9021f, 16.8327f, 12.7063f)
                    curveTo(16.6368f, 12.5104f, 16.5389f, 12.275f, 16.5389f, 12f)
                    curveTo(16.5389f, 11.725f, 16.6368f, 11.4896f, 16.8327f, 11.2938f)
                    curveTo(17.0285f, 11.0979f, 17.2639f, 11f, 17.5389f, 11f)
                    curveTo(17.8139f, 11f, 18.0493f, 11.0979f, 18.2452f, 11.2938f)
                    curveTo(18.441f, 11.4896f, 18.5389f, 11.725f, 18.5389f, 12f)
                    curveTo(18.5389f, 12.275f, 18.441f, 12.5104f, 18.2452f, 12.7063f)
                    curveTo(18.0493f, 12.9021f, 17.8139f, 13f, 17.5389f, 13f)
                    close()
                }
            }
        }.build()
        return _MeatballLine!!
    }

