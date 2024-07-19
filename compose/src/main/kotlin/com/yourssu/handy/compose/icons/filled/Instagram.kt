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
    Image(Instagramfilled, null)
}

private var _Instagramfilled: ImageVector? = null

public val Instagramfilled: ImageVector
    get() {
        if (_Instagramfilled != null) {
            return _Instagramfilled!!
        }
        _Instagramfilled = ImageVector.Builder(
            name = "Instagramfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(11.84f, 9.05f)
                curveTo(10.2936f, 9.05f, 9.04f, 10.3036f, 9.04f, 11.85f)
                curveTo(9.04f, 13.3964f, 10.2936f, 14.65f, 11.84f, 14.65f)
                curveTo(13.3864f, 14.65f, 14.64f, 13.3964f, 14.64f, 11.85f)
                curveTo(14.6427f, 11.1066f, 14.3485f, 10.3928f, 13.8228f, 9.8672f)
                curveTo(13.2972f, 9.3415f, 12.5834f, 9.0473f, 11.84f, 9.05f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(15.69f, 2f)
                horizontalLineTo(8f)
                curveTo(4.6863f, 2f, 2f, 4.6863f, 2f, 8f)
                verticalLineTo(15.69f)
                curveTo(2f, 19.0037f, 4.6863f, 21.69f, 8f, 21.69f)
                horizontalLineTo(15.69f)
                curveTo(19.0037f, 21.69f, 21.69f, 19.0037f, 21.69f, 15.69f)
                verticalLineTo(8f)
                curveTo(21.69f, 4.6863f, 19.0037f, 2f, 15.69f, 2f)
                close()
                moveTo(11.84f, 16.14f)
                curveTo(9.473f, 16.1345f, 7.5555f, 14.217f, 7.55f, 11.85f)
                curveTo(7.546f, 10.109f, 8.5921f, 8.5374f, 10.1998f, 7.8692f)
                curveTo(11.8075f, 7.2011f, 13.6595f, 7.5684f, 14.8905f, 8.7995f)
                curveTo(16.1216f, 10.0305f, 16.4889f, 11.8825f, 15.8208f, 13.4902f)
                curveTo(15.1526f, 15.0979f, 13.581f, 16.144f, 11.84f, 16.14f)
                close()
                moveTo(15.5749f, 6.91176f)
                curveTo(15.7462f, 7.32f, 16.1473f, 7.584f, 16.59f, 7.58f)
                curveTo(17.1865f, 7.58f, 17.67f, 7.0965f, 17.67f, 6.5f)
                curveTo(17.674f, 6.0573f, 17.41f, 5.6562f, 17.0018f, 5.4849f)
                curveTo(16.5936f, 5.3137f, 16.1223f, 5.4063f, 15.8093f, 5.7193f)
                curveTo(15.4963f, 6.0323f, 15.4037f, 6.5036f, 15.5749f, 6.9118f)
                close()
            }
        }.build()
        return _Instagramfilled!!
    }

