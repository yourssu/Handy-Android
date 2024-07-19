import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Loaderline, null)
}

private var _Loaderline: ImageVector? = null

public val Loaderline: ImageVector
    get() {
        if (_Loaderline != null) {
            return _Loaderline!!
        }
        _Loaderline = ImageVector.Builder(
            name = "Loaderline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(11.949f, 8.5f)
                curveTo(11.5371f, 8.4946f, 11.2044f, 8.162f, 11.199f, 7.75f)
                verticalLineTo(2.75f)
                curveTo(11.199f, 2.3358f, 11.5348f, 2f, 11.949f, 2f)
                curveTo(12.3632f, 2f, 12.699f, 2.3358f, 12.699f, 2.75f)
                verticalLineTo(7.75f)
                curveTo(12.6936f, 8.162f, 12.361f, 8.4946f, 11.949f, 8.5f)
                close()
            }
            handyPath {
                moveTo(11.949f, 22.5f)
                curveTo(11.5371f, 22.4946f, 11.2044f, 22.162f, 11.199f, 21.75f)
                verticalLineTo(16.75f)
                curveTo(11.199f, 16.3358f, 11.5348f, 16f, 11.949f, 16f)
                curveTo(12.3632f, 16f, 12.699f, 16.3358f, 12.699f, 16.75f)
                verticalLineTo(21.75f)
                curveTo(12.6936f, 22.162f, 12.361f, 22.4946f, 11.949f, 22.5f)
                close()
            }
            handyPath {
                moveTo(9.36904f, 9.31f)
                curveTo(9.1223f, 9.3118f, 8.8905f, 9.1921f, 8.749f, 8.99f)
                lineTo(5.88903f, 4.9f)
                curveTo(5.7728f, 4.7372f, 5.7264f, 4.5347f, 5.7602f, 4.3375f)
                curveTo(5.794f, 4.1403f, 5.9052f, 3.9648f, 6.069f, 3.85f)
                curveTo(6.4018f, 3.6478f, 6.8336f, 3.7298f, 7.069f, 4.04f)
                lineTo(9.94904f, 8.13f)
                curveTo(10.1169f, 8.3568f, 10.1411f, 8.6593f, 10.0115f, 8.91f)
                curveTo(9.882f, 9.1606f, 9.6211f, 9.3158f, 9.339f, 9.31f)
                horizontalLineTo(9.36904f)
                close()
            }
            handyPath {
                moveTo(17.399f, 20.78f)
                curveTo(17.1523f, 20.7818f, 16.9205f, 20.6622f, 16.779f, 20.46f)
                lineTo(13.949f, 16.37f)
                curveTo(13.7116f, 16.0303f, 13.7944f, 15.5625f, 14.134f, 15.325f)
                curveTo(14.4737f, 15.0875f, 14.9416f, 15.1703f, 15.179f, 15.51f)
                lineTo(18.039f, 19.6f)
                curveTo(18.2069f, 19.8268f, 18.2311f, 20.1293f, 18.1015f, 20.38f)
                curveTo(17.972f, 20.6306f, 17.7111f, 20.7858f, 17.429f, 20.78f)
                horizontalLineTo(17.399f)
                close()
            }
            handyPath {
                moveTo(7.71904f, 11.46f)
                curveTo(7.6329f, 11.4738f, 7.5451f, 11.4738f, 7.459f, 11.46f)
                lineTo(2.76904f, 9.71f)
                curveTo(2.5741f, 9.6406f, 2.4158f, 9.4946f, 2.3309f, 9.3059f)
                curveTo(2.246f, 9.1172f, 2.2417f, 8.902f, 2.319f, 8.71f)
                curveTo(2.3856f, 8.5131f, 2.5318f, 8.3533f, 2.7221f, 8.2696f)
                curveTo(2.9123f, 8.1859f, 3.1289f, 8.186f, 3.319f, 8.27f)
                lineTo(7.94904f, 10.01f)
                curveTo(8.2848f, 10.1391f, 8.4816f, 10.4884f, 8.4182f, 10.8424f)
                curveTo(8.3547f, 11.1965f, 8.0487f, 11.4556f, 7.689f, 11.46f)
                horizontalLineTo(7.71904f)
                close()
            }
            handyPath {
                moveTo(20.879f, 16.25f)
                curveTo(20.7902f, 16.2479f, 20.7023f, 16.231f, 20.619f, 16.2f)
                lineTo(15.949f, 14.49f)
                curveTo(15.7522f, 14.423f, 15.5921f, 14.2774f, 15.5068f, 14.0878f)
                curveTo(15.4214f, 13.8982f, 15.4187f, 13.6817f, 15.499f, 13.49f)
                curveTo(15.5685f, 13.295f, 15.7144f, 13.1368f, 15.9031f, 13.0519f)
                curveTo(16.0919f, 12.9669f, 16.3071f, 12.9627f, 16.499f, 13.04f)
                lineTo(21.189f, 14.75f)
                curveTo(21.384f, 14.8194f, 21.5422f, 14.9654f, 21.6272f, 15.1541f)
                curveTo(21.7121f, 15.3428f, 21.7164f, 15.558f, 21.639f, 15.75f)
                curveTo(21.5272f, 16.0688f, 21.2161f, 16.2735f, 20.879f, 16.25f)
                close()
            }
            handyPath {
                moveTo(2.76904f, 15.46f)
                curveTo(2.3846f, 15.4697f, 2.0551f, 15.1871f, 2.0062f, 14.8057f)
                curveTo(1.9572f, 14.4243f, 2.2046f, 14.0677f, 2.579f, 13.98f)
                lineTo(7.40904f, 12.69f)
                curveTo(7.6013f, 12.6381f, 7.8064f, 12.6648f, 7.979f, 12.7642f)
                curveTo(8.1516f, 12.8636f, 8.2775f, 13.0276f, 8.329f, 13.22f)
                curveTo(8.4314f, 13.6197f, 8.1961f, 14.028f, 7.799f, 14.14f)
                lineTo(2.94904f, 15.43f)
                curveTo(2.8906f, 15.4479f, 2.8301f, 15.458f, 2.769f, 15.46f)
                close()
            }
            handyPath {
                moveTo(16.299f, 11.84f)
                curveTo(15.9575f, 11.8386f, 15.6589f, 11.6095f, 15.569f, 11.28f)
                curveTo(15.5171f, 11.0877f, 15.5438f, 10.8827f, 15.6432f, 10.7101f)
                curveTo(15.7426f, 10.5375f, 15.9066f, 10.4115f, 16.099f, 10.36f)
                lineTo(20.949f, 9.07f)
                curveTo(21.3494f, 8.9623f, 21.7613f, 9.1996f, 21.869f, 9.6f)
                curveTo(21.9767f, 10.0004f, 21.7394f, 10.4123f, 21.339f, 10.52f)
                lineTo(16.509f, 11.81f)
                curveTo(16.4412f, 11.8318f, 16.3702f, 11.8419f, 16.299f, 11.84f)
                close()
            }
            handyPath {
                moveTo(5.83904f, 20.25f)
                curveTo(5.5492f, 20.2476f, 5.2867f, 20.0784f, 5.1648f, 19.8154f)
                curveTo(5.0429f, 19.5524f, 5.0835f, 19.2427f, 5.269f, 19.02f)
                lineTo(8.47904f, 15.25f)
                curveTo(8.7515f, 14.9415f, 9.2184f, 14.9019f, 9.539f, 15.16f)
                curveTo(9.6921f, 15.2883f, 9.7876f, 15.4723f, 9.8045f, 15.6713f)
                curveTo(9.8214f, 15.8703f, 9.7582f, 16.0677f, 9.629f, 16.22f)
                lineTo(6.41904f, 20.01f)
                curveTo(6.2709f, 20.1721f, 6.0584f, 20.26f, 5.839f, 20.25f)
                close()
            }
            handyPath {
                moveTo(14.839f, 9.55f)
                curveTo(14.6637f, 9.5537f, 14.493f, 9.4932f, 14.359f, 9.38f)
                curveTo(14.206f, 9.2517f, 14.1105f, 9.0677f, 14.0936f, 8.8687f)
                curveTo(14.0767f, 8.6698f, 14.1398f, 8.4723f, 14.269f, 8.32f)
                lineTo(17.479f, 4.49f)
                curveTo(17.6073f, 4.337f, 17.7913f, 4.2414f, 17.9903f, 4.2245f)
                curveTo(18.1893f, 4.2077f, 18.3868f, 4.2708f, 18.539f, 4.4f)
                curveTo(18.8252f, 4.6589f, 18.8643f, 5.0942f, 18.629f, 5.4f)
                lineTo(15.419f, 9.25f)
                curveTo(15.2798f, 9.4311f, 15.0673f, 9.541f, 14.839f, 9.55f)
                close()
            }
            handyPath {
                moveTo(11.949f, 8.5f)
                curveTo(11.5371f, 8.4946f, 11.2044f, 8.162f, 11.199f, 7.75f)
                verticalLineTo(2.75f)
                curveTo(11.199f, 2.3358f, 11.5348f, 2f, 11.949f, 2f)
                curveTo(12.3632f, 2f, 12.699f, 2.3358f, 12.699f, 2.75f)
                verticalLineTo(7.75f)
                curveTo(12.6936f, 8.162f, 12.361f, 8.4946f, 11.949f, 8.5f)
                close()
            }
            handyPath {
                moveTo(11.949f, 22.5f)
                curveTo(11.5371f, 22.4946f, 11.2044f, 22.162f, 11.199f, 21.75f)
                verticalLineTo(16.75f)
                curveTo(11.199f, 16.3358f, 11.5348f, 16f, 11.949f, 16f)
                curveTo(12.3632f, 16f, 12.699f, 16.3358f, 12.699f, 16.75f)
                verticalLineTo(21.75f)
                curveTo(12.6936f, 22.162f, 12.361f, 22.4946f, 11.949f, 22.5f)
                close()
            }
            handyPath {
                moveTo(9.36904f, 9.31f)
                curveTo(9.1223f, 9.3118f, 8.8905f, 9.1921f, 8.749f, 8.99f)
                lineTo(5.88903f, 4.9f)
                curveTo(5.7728f, 4.7372f, 5.7264f, 4.5347f, 5.7602f, 4.3375f)
                curveTo(5.794f, 4.1403f, 5.9052f, 3.9648f, 6.069f, 3.85f)
                curveTo(6.4018f, 3.6478f, 6.8336f, 3.7298f, 7.069f, 4.04f)
                lineTo(9.94904f, 8.13f)
                curveTo(10.1169f, 8.3568f, 10.1411f, 8.6593f, 10.0115f, 8.91f)
                curveTo(9.882f, 9.1606f, 9.6211f, 9.3158f, 9.339f, 9.31f)
                horizontalLineTo(9.36904f)
                close()
            }
            handyPath {
                moveTo(17.399f, 20.78f)
                curveTo(17.1523f, 20.7818f, 16.9205f, 20.6622f, 16.779f, 20.46f)
                lineTo(13.949f, 16.37f)
                curveTo(13.7116f, 16.0303f, 13.7944f, 15.5625f, 14.134f, 15.325f)
                curveTo(14.4737f, 15.0875f, 14.9416f, 15.1703f, 15.179f, 15.51f)
                lineTo(18.039f, 19.6f)
                curveTo(18.2069f, 19.8268f, 18.2311f, 20.1293f, 18.1015f, 20.38f)
                curveTo(17.972f, 20.6306f, 17.7111f, 20.7858f, 17.429f, 20.78f)
                horizontalLineTo(17.399f)
                close()
            }
            handyPath {
                moveTo(7.71904f, 11.46f)
                curveTo(7.6329f, 11.4738f, 7.5451f, 11.4738f, 7.459f, 11.46f)
                lineTo(2.76904f, 9.71f)
                curveTo(2.5741f, 9.6406f, 2.4158f, 9.4946f, 2.3309f, 9.3059f)
                curveTo(2.246f, 9.1172f, 2.2417f, 8.902f, 2.319f, 8.71f)
                curveTo(2.3856f, 8.5131f, 2.5318f, 8.3533f, 2.7221f, 8.2696f)
                curveTo(2.9123f, 8.1859f, 3.1289f, 8.186f, 3.319f, 8.27f)
                lineTo(7.94904f, 10.01f)
                curveTo(8.2848f, 10.1391f, 8.4816f, 10.4884f, 8.4182f, 10.8424f)
                curveTo(8.3547f, 11.1965f, 8.0487f, 11.4556f, 7.689f, 11.46f)
                horizontalLineTo(7.71904f)
                close()
            }
            handyPath {
                moveTo(20.879f, 16.25f)
                curveTo(20.7902f, 16.2479f, 20.7023f, 16.231f, 20.619f, 16.2f)
                lineTo(15.949f, 14.49f)
                curveTo(15.7522f, 14.423f, 15.5921f, 14.2774f, 15.5068f, 14.0878f)
                curveTo(15.4214f, 13.8982f, 15.4187f, 13.6817f, 15.499f, 13.49f)
                curveTo(15.5685f, 13.295f, 15.7144f, 13.1368f, 15.9031f, 13.0519f)
                curveTo(16.0919f, 12.9669f, 16.3071f, 12.9627f, 16.499f, 13.04f)
                lineTo(21.189f, 14.75f)
                curveTo(21.384f, 14.8194f, 21.5422f, 14.9654f, 21.6272f, 15.1541f)
                curveTo(21.7121f, 15.3428f, 21.7164f, 15.558f, 21.639f, 15.75f)
                curveTo(21.5272f, 16.0688f, 21.2161f, 16.2735f, 20.879f, 16.25f)
                close()
            }
            handyPath {
                moveTo(2.76904f, 15.46f)
                curveTo(2.3846f, 15.4697f, 2.0551f, 15.1871f, 2.0062f, 14.8057f)
                curveTo(1.9572f, 14.4243f, 2.2046f, 14.0677f, 2.579f, 13.98f)
                lineTo(7.40904f, 12.69f)
                curveTo(7.6013f, 12.6381f, 7.8064f, 12.6648f, 7.979f, 12.7642f)
                curveTo(8.1516f, 12.8636f, 8.2775f, 13.0276f, 8.329f, 13.22f)
                curveTo(8.4314f, 13.6197f, 8.1961f, 14.028f, 7.799f, 14.14f)
                lineTo(2.94904f, 15.43f)
                curveTo(2.8906f, 15.4479f, 2.8301f, 15.458f, 2.769f, 15.46f)
                close()
            }
            handyPath {
                moveTo(16.299f, 11.84f)
                curveTo(15.9575f, 11.8386f, 15.6589f, 11.6095f, 15.569f, 11.28f)
                curveTo(15.5171f, 11.0877f, 15.5438f, 10.8827f, 15.6432f, 10.7101f)
                curveTo(15.7426f, 10.5375f, 15.9066f, 10.4115f, 16.099f, 10.36f)
                lineTo(20.949f, 9.07f)
                curveTo(21.3494f, 8.9623f, 21.7613f, 9.1996f, 21.869f, 9.6f)
                curveTo(21.9767f, 10.0004f, 21.7394f, 10.4123f, 21.339f, 10.52f)
                lineTo(16.509f, 11.81f)
                curveTo(16.4412f, 11.8318f, 16.3702f, 11.8419f, 16.299f, 11.84f)
                close()
            }
            handyPath {
                moveTo(5.83904f, 20.25f)
                curveTo(5.5492f, 20.2476f, 5.2867f, 20.0784f, 5.1648f, 19.8154f)
                curveTo(5.0429f, 19.5524f, 5.0835f, 19.2427f, 5.269f, 19.02f)
                lineTo(8.47904f, 15.25f)
                curveTo(8.7515f, 14.9415f, 9.2184f, 14.9019f, 9.539f, 15.16f)
                curveTo(9.6921f, 15.2883f, 9.7876f, 15.4723f, 9.8045f, 15.6713f)
                curveTo(9.8214f, 15.8703f, 9.7582f, 16.0677f, 9.629f, 16.22f)
                lineTo(6.41904f, 20.01f)
                curveTo(6.2709f, 20.1721f, 6.0584f, 20.26f, 5.839f, 20.25f)
                close()
            }
            handyPath {
                moveTo(14.839f, 9.55f)
                curveTo(14.6637f, 9.5537f, 14.493f, 9.4932f, 14.359f, 9.38f)
                curveTo(14.206f, 9.2517f, 14.1105f, 9.0677f, 14.0936f, 8.8687f)
                curveTo(14.0767f, 8.6698f, 14.1398f, 8.4723f, 14.269f, 8.32f)
                lineTo(17.479f, 4.49f)
                curveTo(17.6073f, 4.337f, 17.7913f, 4.2414f, 17.9903f, 4.2245f)
                curveTo(18.1893f, 4.2077f, 18.3868f, 4.2708f, 18.539f, 4.4f)
                curveTo(18.8252f, 4.6589f, 18.8643f, 5.0942f, 18.629f, 5.4f)
                lineTo(15.419f, 9.25f)
                curveTo(15.2798f, 9.4311f, 15.0673f, 9.541f, 14.839f, 9.55f)
                close()
            }
        }.build()
        return _Loaderline!!
    }

