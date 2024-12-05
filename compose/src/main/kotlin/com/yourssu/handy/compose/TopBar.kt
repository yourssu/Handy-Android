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

/**
 * Center-Aligned : 클릭 가능한 Surface 입니다.
 *
 * 타이틀이 좌측에 위치한 탑앱바입니다.
 * 기능의 첫 페이지에 사용되는 탑앱바로, 현재 페이지의 제목을 나타낼 때 사용합니다.
 * 아이콘으로 기능을 명확하게 표현하지 못하거나 확실하게 기능을 설명하고 싶을 때 아이콘 대신 Text를 사용할 수 있습니다.
 *
 * @param title headline or Logo 최대 9자(공백 포함)
 * @param button Trailing Button (icon or text)
 **/
@Composable
fun CenterAlignedTopBar(
    title: String,
    onBackButtonClicked: (() -> Unit)? = null,
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

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = topBarHorizontalPadding),
            verticalAlignment = Alignment.CenterVertically,
        ) {

            Icon(HandyIcons.Filled.Add, iconSize = IconSize.M)

            Spacer(modifier = Modifier.weight(1f)) // 오른쪽 공간 확보

            // 오른쪽 액션 버튼들
            actions?.invoke(this)
        }

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
            onBackButtonClicked = { /* 뒤로가기 버튼 클릭 처리 */ },
            actions = {
//                    Text(
//                        text = "Action",
//                        color = Color.Black,
//                        modifier = Modifier
//                            .padding(8.dp)
//                            .clickable { /* 액션 버튼 클릭 처리 */ }
//                    )
            }
        )
        // 본문 내용
//            Text(
//                text = "Hello, Compose!",
//                modifier = Modifier.padding(16.dp)
//            )
    }


}

object TopBarDefaults {
    val topBarHeight = 56.dp
    val topBarHorizontalPadding = 16.dp

//    val tabHorizontalPadding = 16.dp
//
//    val fixedTabIndicatorPadding = 28.dp
//    val scrollableTabIndicatorPadding = 18.dp
//
//    val scrollableTabPadding = 16.dp
//    val scrollableTabWidth = 56.dp
}