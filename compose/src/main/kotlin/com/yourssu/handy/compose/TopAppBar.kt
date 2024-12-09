package com.yourssu.handy.compose

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.TopBarDefaults.topBarHeight
import com.yourssu.handy.compose.TopBarDefaults.topBarHorizontalPadding
import com.yourssu.handy.compose.button.TextButton
import com.yourssu.handy.compose.foundation.HandyTypography
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.filled.Add
import com.yourssu.handy.compose.icons.filled.ArrowsChevronLeft
import com.yourssu.handy.compose.icons.filled.List
import com.yourssu.handy.compose.icons.line.Add

sealed interface NavIcon {
    data object None : NavIcon
    data class Back(val onClick: () -> Unit) : NavIcon
    data class Menu(val onClick: () -> Unit) : NavIcon
}

/**
 * Center-Aligned Top App Bar
 *
 * 타이틀이 중앙에 위치한 탑앱바입니다. 좌측에 메뉴 아이콘 및 뒤로 가기 아이콘이 요구될 경우 사용합니다.
 * 아이콘으로 기능을 명확하게 표현하지 못하거나 확실하게 기능을 설명하고 싶을 때 아이콘 대신 Text를 사용할 수 있습니다.
 * 이때, 텍스트의 사용은 한 개까지만 가능하며, 텍스트가 공백 포함 5자일 경우 우측에 아이콘을 같이 쓸 수 없습니다.
 *
 *
 * @param headline headline or Logo 최대 9자(공백 포함)
 * @param navIcon 왼쪽 아이콘 NavIcon.None, NavIcon.Menu, NavIcon.Back
 * @param trailingButton 오른쪽 아이콘 or 텍스트 (아이콘은 임의로 변경할 수 있으며 Center-aligned의 우측엔 최대 2개의 아이콘 버튼)
 **/
@Composable
fun CenterAlignedTopAppBar(
    headline: String,
    navIcon: NavIcon,
    trailingButton: @Composable (RowScope.() -> Unit)? = null
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = HandyTheme.colors.bgBasicDefault)
            .height(topBarHeight),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = headline,
            color = HandyTheme.colors.textBasicPrimary,
            style = HandyTypography.T2Sb18,
            textAlign = TextAlign.Center,
        )

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = topBarHorizontalPadding), //Top App Bar의 높이값을 임의로 변경하지 않습니다.
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Left Icon
            IconButton(navIcon)

            Spacer(modifier = Modifier.weight(1f))

            // Actions
            if (trailingButton != null) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    trailingButton()
                }
            }
        }
    }
}

@Composable
private fun RowScope.IconButton(navIcon: NavIcon) {
    when (navIcon) {
        is NavIcon.Back -> Icon(
            imageVector = HandyIcons.Filled.ArrowsChevronLeft,
            contentDescription = "Back",
            modifier = Modifier.clickable(onClick = navIcon.onClick)
        )

        is NavIcon.Menu -> Icon(
            imageVector = HandyIcons.Filled.List,
            contentDescription = "Menu",
            modifier = Modifier.clickable(onClick = navIcon.onClick)
        )

        NavIcon.None -> Spacer(modifier = Modifier.width(24.dp)) // 여백 확보
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
            .height(topBarHeight),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = topBarHorizontalPadding),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = title,
                style = HandyTypography.H3Sb24,
                color = HandyTheme.colors.textBasicPrimary,
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.weight(1f))

            // Actions
            if (actions != null) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(8.dp)
                ) {
                    actions()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CenterAlignedTopAppBarPreview() {
    Column {
        CenterAlignedTopAppBar(
            headline = "Centered",
            navIcon = NavIcon.None,
            trailingButton = {}
        )

        CenterAlignedTopAppBar(
            headline = "Back Example",
            navIcon = NavIcon.Back(onClick = { Log.d("TopBarPreview", "Back clicked") }),
            trailingButton = {
                TextButton(text = "Share", onClick = { Log.d("TopBarPreview", "Share clicked") })
            }
        )

        CenterAlignedTopAppBar(
            headline = "Menu Example",
            navIcon = NavIcon.Menu(onClick = { Log.d("TopBarPreview", "Menu clicked") }),
            trailingButton = {
                Icon(
                    imageVector = HandyIcons.Filled.Add,
                    contentDescription = "Add",
                    modifier = Modifier.clickable { Log.d("TopBarPreview", "Add clicked") }
                )
            }
        )
    }
}


@Preview(showBackground = true)
@Composable
fun LeftAlignedTopBarPreview() {
    Column {
        LeftAlignedTopAppBar(
            title = "Title",
            actions = {}
        )
        LeftAlignedTopAppBar(
            title = "Title",
            actions = {
                Icon(
                    imageVector = HandyIcons.Line.Add,
                    contentDescription = "Add",
                    modifier = Modifier.clickable { Log.d("TopBarPreview", "Add clicked") }
                )
            }
        )
        LeftAlignedTopAppBar(
            title = "Title",
            actions = {
                Icon(
                    imageVector = HandyIcons.Line.Add,
                    contentDescription = "Add",
                    modifier = Modifier.clickable { Log.d("TopBarPreview", "Add clicked") }
                )
                Icon(
                    imageVector = HandyIcons.Line.Add,
                    contentDescription = "Add",
                    modifier = Modifier.clickable { Log.d("TopBarPreview", "Add clicked") }
                )
            }
        )
        LeftAlignedTopAppBar(
            title = "Title",
            actions = {
                Icon(
                    imageVector = HandyIcons.Line.Add,
                    contentDescription = "Add",
                    modifier = Modifier.clickable { Log.d("TopBarPreview", "Add clicked") }
                )
                Icon(
                    imageVector = HandyIcons.Line.Add,
                    contentDescription = "Add",
                    modifier = Modifier.clickable { Log.d("TopBarPreview", "Add clicked") }
                )
                Icon(
                    imageVector = HandyIcons.Line.Add,
                    contentDescription = "Add",
                    modifier = Modifier.clickable { Log.d("TopBarPreview", "Add clicked") }
                )
            }
        )


    }
}


object TopBarDefaults {
    val topBarHeight = 56.dp
    val topBarHorizontalPadding = 16.dp
}
