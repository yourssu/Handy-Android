package com.yourssu.handy.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.TopBarDefaults.topBarActionsInsidePadding
import com.yourssu.handy.compose.TopBarDefaults.topBarHeight
import com.yourssu.handy.compose.TopBarDefaults.topBarHorizontalPadding
import com.yourssu.handy.compose.TopBarDefaults.topBarIconPadding
import com.yourssu.handy.compose.foundation.HandyTypography


/**
 * Center-Aligned Top App Bar
 *
 * 타이틀이 중앙에 위치한 탑앱바입니다. 좌측에 메뉴 아이콘 및 뒤로 가기 아이콘이 요구될 경우 사용합니다.
 * 아이콘으로 기능을 명확하게 표현하지 못하거나 확실하게 기능을 설명하고 싶을 때 아이콘 대신 Text를 사용할 수 있습니다.
 * 이때, 텍스트의 사용은 한 개까지만 가능하며, 텍스트가 공백 포함 5자일 경우 우측에 아이콘을 같이 쓸 수 없습니다.
 *
 *
 * @param title headline or Logo 최대 9자(공백 포함)
 * @param navIcon 왼쪽 아이콘
 * @param actions 오른쪽 아이콘 or 텍스트 (아이콘은 임의로 변경할 수 있으며 Center-aligned의 우측엔 최대 2개의 아이콘 버튼)
 **/
@Composable
fun CenterAlignedTopAppBar(
    title: String,
    navIcon: ImageVector,
    onNavIconClick: () -> Unit,
    modifier: Modifier = Modifier,
    actions: @Composable (RowScope.() -> Unit)? = null
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(color = HandyTheme.colors.bgBasicDefault)
            .height(topBarHeight) //Top App Bar의 높이값을 임의로 변경하지 않습니다.
            .padding(horizontal = topBarHorizontalPadding),
        contentAlignment = Alignment.Center
    ) {

        // CenterAligned 일 때는 좌측 아이콘이 항상 있음.
        Box(
            modifier = Modifier
                .align(Alignment.CenterStart)
        ) {
            Icon(
                imageVector = navIcon,
                modifier = Modifier
                    .clickable { onNavIconClick() }
                    .padding(topBarIconPadding) // 터치영역을 8dp만큼 확장
            )
        }

        Text(
            text = title,
            color = HandyTheme.colors.textBasicPrimary,
            style = HandyTypography.T2Sb18,
            textAlign = TextAlign.Center,
        )

        actions?.let {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(topBarActionsInsidePadding), // 요소 사이에 24dp 간격 추가
                modifier = Modifier.fillMaxHeight()
            ) {
                Spacer(modifier = Modifier.weight(1f))
                actions()
            }
        }
    }
}


/**
 * Left-aligned
 *
 * 타이틀이 좌측에 위치한 탑앱바입니다. 기능의 첫 페이지에 사용되는 탑앱바로,
 * 현재 페이지의 제목을 나타낼 때 사용합니다. 아이콘으로 기능을 명확하게 표현하지 못하거나 확실하게 기능을 설명하고 싶을 때 아이콘 대신 Text를 사용할 수 있습니다.
 *
 * @param title headline or Logo 최대 9자(공백 포함)
 * @param actions 오른쪽 아이콘 or 텍스트 (아이콘은 임의로 변경할 수 있으며 Left-aligned의 우측엔 최대 3개의 아이콘 버튼)
 **/
@Composable
fun LeftAlignedTopAppBar(
    title: String,
    actions: @Composable (RowScope.() -> Unit)? = null
) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = HandyTheme.colors.bgBasicDefault)
            .height(topBarHeight)
            .padding(horizontal = topBarHorizontalPadding),

        contentAlignment = Alignment.Center
    ) {

        Text(
            text = title,
            style = HandyTypography.H3Sb24,
            color = HandyTheme.colors.textBasicPrimary,
            modifier = Modifier.align(Alignment.CenterStart)

        )

        actions?.let {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(topBarActionsInsidePadding), // 요소 사이에 24dp 간격 추가
            ) {
                Spacer(modifier = Modifier.weight(1f))
                actions()
            }
        }
    }
}


object TopBarDefaults {
    val topBarHeight = 56.dp
    val topBarHorizontalPadding = 16.dp
    val topBarActionsInsidePadding = 24.dp
    val topBarIconPadding = 8.dp
}
