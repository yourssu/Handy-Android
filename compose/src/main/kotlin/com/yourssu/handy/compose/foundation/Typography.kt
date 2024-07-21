package com.yourssu.handy.compose.foundation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.yourssu.handy.compose.R

val fonts = FontFamily(
    Font(R.font.pretendard_light, FontWeight.Light),
    Font(R.font.pretendard_regular, FontWeight.Normal),
    Font(R.font.pretendard_semibold, FontWeight.SemiBold)
)

/**
 * @param color 텍스트 색상
 * @param fontSize 텍스트의 크기. 기기 설정에 관계 없이 일정한 크기를 나타내기 위해 Dp 단위를 사용합니다.
 * @param fontWeight 서체의 두께 (예: bold)
 * @param fontStyle 서체의 스타일 (예: italic)
 * @param letterSpacing 자간. 기본값: -2%
 * @param lineHeight 행간
 */
@Immutable
data class HandyTextStyle internal constructor(
    val color: Color = Color.Unspecified,
    val fontSize: Dp = Dp.Unspecified,
    val fontWeight: FontWeight = FontWeight.Normal,
    val fontStyle: FontStyle = FontStyle.Normal,
    val letterSpacing: TextUnit = (-0.02).em,
    val lineHeight: Dp = Dp.Unspecified,
) {
    private val fontFamily = fonts

    @Composable
    fun toTextStyle() = TextStyle(
        color = color,
        fontSize = with(LocalDensity.current) { fontSize.toSp() },
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        fontStyle = fontStyle,
        letterSpacing = letterSpacing,
        lineHeight = with(LocalDensity.current) { lineHeight.toSp() }
    )

    companion object {
        @Stable
        val Default = HandyTextStyle()
    }
}

@Immutable
class Typography(
    D1_56: HandyTextStyle,
    D2_48: HandyTextStyle,
    D3_40: HandyTextStyle,
    D4_36: HandyTextStyle,
    H1_32: HandyTextStyle,
    H2_28: HandyTextStyle,
    H3_24: HandyTextStyle,
    T1_20: HandyTextStyle,
    T2_18: HandyTextStyle,
    B1_16: HandyTextStyle,
    B2_15: HandyTextStyle,
    B3_14: HandyTextStyle,
    B4_13: HandyTextStyle,
    B5_12: HandyTextStyle,
    C1_11: HandyTextStyle
) {
    val D1Sb56 = D1_56.copy(fontWeight = FontWeight.SemiBold)
    val D2Sb48 = D2_48.copy(fontWeight = FontWeight.SemiBold)
    val D3Sb40 = D3_40.copy(fontWeight = FontWeight.SemiBold)
    val D4Sb36 = D4_36.copy(fontWeight = FontWeight.SemiBold)
    val H1Sb32 = H1_32.copy(fontWeight = FontWeight.SemiBold)
    val H2Sb28 = H2_28.copy(fontWeight = FontWeight.SemiBold)
    val H3Sb24 = H3_24.copy(fontWeight = FontWeight.SemiBold)
    val T1Sb20 = T1_20.copy(fontWeight = FontWeight.SemiBold)
    val T2Sb18 = T2_18.copy(fontWeight = FontWeight.SemiBold)
    val B1Sb16 = B1_16.copy(fontWeight = FontWeight.SemiBold)
    val B2Sb15 = B2_15.copy(fontWeight = FontWeight.SemiBold)
    val B3Sb14 = B3_14.copy(fontWeight = FontWeight.SemiBold)
    val B4Sb13 = B4_13.copy(fontWeight = FontWeight.SemiBold)
    val B5Sb12 = B5_12.copy(fontWeight = FontWeight.SemiBold)
    val C1Sb11 = C1_11.copy(fontWeight = FontWeight.SemiBold)

    val D1Rg56 = D1_56
    val D2Rg48 = D2_48
    val D3Rg40 = D3_40
    val D4Rg36 = D4_36
    val H1Rg32 = H1_32
    val H2Rg28 = H2_28
    val H3Rg24 = H3_24
    val T1Rg20 = T1_20
    val T2Rg18 = T2_18
    val B1Rg16 = B1_16
    val B2Rg15 = B2_15
    val B3Rg14 = B3_14
    val B4Rg13 = B4_13
    val B5Rg12 = B5_12
    val C1Rg11 = C1_11

    val D1Lt56 = D1_56.copy(fontWeight = FontWeight.Light)
    val D2Lt48 = D2_48.copy(fontWeight = FontWeight.Light)
    val D3Lt40 = D3_40.copy(fontWeight = FontWeight.Light)
    val D4Lt36 = D4_36.copy(fontWeight = FontWeight.Light)
    val H1Lt32 = H1_32.copy(fontWeight = FontWeight.Light)
    val H2Lt28 = H2_28.copy(fontWeight = FontWeight.Light)
    val H3Lt24 = H3_24.copy(fontWeight = FontWeight.Light)
    val T1Lt20 = T1_20.copy(fontWeight = FontWeight.Light)
    val T2Lt18 = T2_18.copy(fontWeight = FontWeight.Light)
    val B1Lt16 = B1_16.copy(fontWeight = FontWeight.Light)
    val B2Lt15 = B2_15.copy(fontWeight = FontWeight.Light)
    val B3Lt14 = B3_14.copy(fontWeight = FontWeight.Light)
    val B4Lt13 = B4_13.copy(fontWeight = FontWeight.Light)
    val B5Lt12 = B5_12.copy(fontWeight = FontWeight.Light)
    val C1Lt11 = C1_11.copy(fontWeight = FontWeight.Light)
}

val HandyTypography = Typography(
    D1_56 = HandyTextStyle(fontSize = 56.dp, lineHeight = 72.dp),
    D2_48 = HandyTextStyle(fontSize = 48.dp, lineHeight = 62.dp),
    D3_40 = HandyTextStyle(fontSize = 40.dp, lineHeight = 52.dp),
    D4_36 = HandyTextStyle(fontSize = 36.dp, lineHeight = 44.dp),
    H1_32 = HandyTextStyle(fontSize = 32.dp, lineHeight = 42.dp),
    H2_28 = HandyTextStyle(fontSize = 28.dp, lineHeight = 38.dp),
    H3_24 = HandyTextStyle(fontSize = 24.dp, lineHeight = 34.dp),
    T1_20 = HandyTextStyle(fontSize = 20.dp, lineHeight = 28.dp),
    T2_18 = HandyTextStyle(fontSize = 18.dp, lineHeight = 26.dp),
    B1_16 = HandyTextStyle(fontSize = 16.dp, lineHeight = 24.dp),
    B2_15 = HandyTextStyle(fontSize = 15.dp, lineHeight = 22.dp),
    B3_14 = HandyTextStyle(fontSize = 14.dp, lineHeight = 20.dp),
    B4_13 = HandyTextStyle(fontSize = 13.dp, lineHeight = 18.dp),
    B5_12 = HandyTextStyle(fontSize = 12.dp, lineHeight = 18.dp),
    C1_11 = HandyTextStyle(fontSize = 11.dp, lineHeight = 16.dp)
)
