package com.yourssu.handy.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.TopBarDefaults.topBarHeight
import com.yourssu.handy.compose.TopBarDefaults.topBarHorizontalPadding
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.filled.Add
import com.yourssu.handy.compose.icons.filled.List
import com.yourssu.handy.compose.icons.filled.Menu

sealed interface NavIcon {
    data object None : NavIcon
    data class Back(val onClick: () -> Unit) : NavIcon
    data class Menu(val onClick: () -> Unit) : NavIcon
}

/**
 * Center-Aligned Top BAr
 *
 * 타이틀이 좌측에 위치한 탑앱바입니다.
 * 기능의 첫 페이지에 사용되는 탑앱바로, 현재 페이지의 제목을 나타낼 때 사용합니다.
 * 아이콘으로 기능을 명확하게 표현하지 못하거나 확실하게 기능을 설명하고 싶을 때 아이콘 대신 Text를 사용할 수 있습니다.
 *
 * @param title headline or Logo 최대 9자(공백 포함)
 * @param navIcon 왼쪽 아이콘 (None, Menu, Back)
 * @param actions Trailing Button (icon or text)
 **/
@Composable
fun CenterAlignedTopBar(
    title: String,
    navIcon: NavIcon,
    actions: @Composable (RowScope.() -> Unit)? = null
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = HandyTheme.colors.bgBasicDefault)
            .height(topBarHeight),
        contentAlignment = Alignment.Center
    ) {
        // 타이틀
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = topBarHorizontalPadding),
            verticalAlignment = Alignment.CenterVertically
        ) {

            // 중앙 제목
            Text(
                text = title,
                color = HandyTheme.colors.textBasicPrimary,
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(2f) // 텍스트가 중앙에 위치하도록 weight 추가
            )


            // 오른쪽 액션 버튼들
            actions?.invoke(this)
        }

        // 왼쪽 아이콘
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = topBarHorizontalPadding),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            when (navIcon) {
                is NavIcon.Back -> Icon(HandyIcons.Filled.List, iconSize = IconSize.M)
                is NavIcon.Menu -> Icon(HandyIcons.Filled.Menu, iconSize = IconSize.M)
                NavIcon.None -> {}
            }

            Spacer(modifier = Modifier.weight(1f)) // 오른쪽 공간 확보

            // 오른쪽 액션 버튼들
            actions?.invoke(this)
        }


        // 오른쪽 액션
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = topBarHorizontalPadding),
            verticalAlignment = Alignment.CenterVertically,
        ) {

            Spacer(modifier = Modifier.weight(1f)) // 오른쪽 공간 확보

            Icon(HandyIcons.Filled.Add, iconSize = IconSize.M)
            Icon(HandyIcons.Filled.Add, iconSize = IconSize.M)

            // 오른쪽 액션 버튼들
            actions?.invoke(this)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TopBarPreview() {

    Column {
        CenterAlignedTopBar(
            title = "My TopBar",
            navIcon = NavIcon.Back(onClick = {}),
            actions = {

            }
        )

        CenterAlignedTopBar(
            title = "My TopBar",
            navIcon = NavIcon.None,
            actions = {

            }
        )

        CenterAlignedTopBar(
            title = "My TopBar",
            navIcon = NavIcon.Menu(onClick = {}),
            actions = {
            }
        )

    }


}


object TopBarDefaults {
    val topBarHeight = 56.dp
    val topBarHorizontalPadding = 16.dp
}