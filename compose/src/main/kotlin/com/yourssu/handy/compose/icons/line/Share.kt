import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Shareline, null)
}

private var _Shareline: ImageVector? = null

public val Shareline: ImageVector
    get() {
        if (_Shareline != null) {
            return _Shareline!!
        }
        _Shareline = ImageVector.Builder(
            name = "Shareline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(14.9529f, 15.2302f)
                curveTo(15.4043f, 15.2315f, 15.8469f, 15.356f, 16.2329f, 15.5902f)
                horizontalLineTo(16.2229f)
                curveTo(17.3864f, 16.2842f, 17.7816f, 17.7812f, 17.1121f, 18.9591f)
                curveTo(16.4427f, 20.137f, 14.9543f, 20.5634f, 13.7626f, 19.9188f)
                curveTo(12.571f, 19.2742f, 12.1134f, 17.7951f, 12.7329f, 16.5902f)
                lineTo(9.80286f, 13.6002f)
                curveTo(9.5913f, 13.729f, 9.3623f, 13.8267f, 9.1229f, 13.8902f)
                curveTo(8.9235f, 13.9414f, 8.7187f, 13.9683f, 8.5129f, 13.9702f)
                curveTo(7.2441f, 13.9767f, 6.1718f, 13.0317f, 6.0185f, 11.7723f)
                curveTo(5.8652f, 10.5128f, 6.6796f, 9.3383f, 7.9129f, 9.0402f)
                curveTo(8.1092f, 8.9923f, 8.3107f, 8.9688f, 8.5129f, 8.9702f)
                curveTo(9.0289f, 8.9706f, 9.5321f, 9.1314f, 9.9529f, 9.4302f)
                lineTo(12.7329f, 6.65023f)
                curveTo(12.3187f, 5.8764f, 12.3444f, 4.9412f, 12.8005f, 4.1913f)
                curveTo(13.2567f, 3.4413f, 14.0752f, 2.9884f, 14.9529f, 3.0002f)
                curveTo(15.4035f, 2.9979f, 15.8461f, 3.119f, 16.2329f, 3.3502f)
                curveTo(17.0188f, 3.7825f, 17.5145f, 4.6013f, 17.5331f, 5.4981f)
                curveTo(17.5517f, 6.3949f, 17.0905f, 7.2336f, 16.3231f, 7.6981f)
                curveTo(15.5557f, 8.1626f, 14.5988f, 8.1825f, 13.8129f, 7.7502f)
                lineTo(10.8729f, 10.6902f)
                curveTo(10.9055f, 10.7613f, 10.9323f, 10.8348f, 10.9529f, 10.9102f)
                curveTo(11.0857f, 11.4485f, 11.0328f, 12.0158f, 10.8029f, 12.5202f)
                lineTo(13.8029f, 15.5202f)
                curveTo(14.1581f, 15.3345f, 14.5521f, 15.2352f, 14.9529f, 15.2302f)
                close()
                moveTo(14.9529f, 4.50023f)
                curveTo(14.6018f, 4.4982f, 14.2754f, 4.6804f, 14.0929f, 4.9802f)
                curveTo(13.9565f, 5.2088f, 13.9169f, 5.4824f, 13.9829f, 5.7402f)
                curveTo(14.0406f, 5.9977f, 14.2039f, 6.2191f, 14.4329f, 6.3502f)
                curveTo(14.5862f, 6.4453f, 14.7624f, 6.4972f, 14.9429f, 6.5002f)
                curveTo(15.2959f, 6.5002f, 15.6228f, 6.3139f, 15.8029f, 6.0102f)
                curveTo(16.0862f, 5.5379f, 15.9342f, 4.9253f, 15.4629f, 4.6402f)
                curveTo(15.3098f, 4.5457f, 15.1328f, 4.4971f, 14.9529f, 4.5002f)
                close()
                moveTo(8.51286f, 12.4702f)
                curveTo(8.0422f, 12.4839f, 7.6257f, 12.1674f, 7.5129f, 11.7102f)
                curveTo(7.4499f, 11.451f, 7.4931f, 11.1774f, 7.6329f, 10.9502f)
                curveTo(7.7693f, 10.726f, 7.9883f, 10.5644f, 8.2429f, 10.5002f)
                horizontalLineTo(8.48286f)
                curveTo(8.9536f, 10.4865f, 9.37f, 10.803f, 9.4829f, 11.2602f)
                curveTo(9.546f, 11.515f, 9.5065f, 11.7843f, 9.3729f, 12.0102f)
                lineTo(9.31286f, 12.0802f)
                curveTo(9.1802f, 12.27f, 8.9858f, 12.4078f, 8.7629f, 12.4702f)
                horizontalLineTo(8.51286f)
                close()
                moveTo(14.9429f, 18.6802f)
                curveTo(15.2939f, 18.6823f, 15.6203f, 18.5001f, 15.8029f, 18.2002f)
                curveTo(16.0534f, 17.7392f, 15.905f, 17.1629f, 15.4629f, 16.8802f)
                curveTo(15.3095f, 16.7851f, 15.1333f, 16.7333f, 14.9529f, 16.7302f)
                curveTo(14.5998f, 16.7303f, 14.2729f, 16.9165f, 14.0929f, 17.2202f)
                curveTo(13.8095f, 17.6926f, 13.9616f, 18.3051f, 14.4329f, 18.5902f)
                curveTo(14.5911f, 18.6674f, 14.7678f, 18.6986f, 14.9429f, 18.6802f)
                close()
            }
        }.build()
        return _Shareline!!
    }

