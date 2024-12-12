package com.yourssu.handy.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.traversalIndex
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.ScaffoldSpacingValues.FabBottomSpacing
import com.yourssu.handy.compose.ScaffoldSpacingValues.FabEndSpacing
import com.yourssu.handy.compose.ScaffoldSpacingValues.SnackBarBottomSpacing
import com.yourssu.handy.compose.ScaffoldSpacingValues.SnackBarHorizontalSpacing
import com.yourssu.handy.compose.foundation.LocalContentColor

/**
 *  layout을 구성하기 위한 Scaffold입니다.
 *
 *  @param modifier : Modifier
 *  @param topBar : 상단 바
 *  @param snackbarHost : Snackbar
 *  @param floatingActionButton : Floating Action Button
 *  @param bottomBar : 하단 네비게이션 바
 *  @param containerColor : Scaffold의 배경색
 *  @param contentColor : Scaffold의 content 색상
 *  @param content : Scaffold의 content
 */
@Composable
fun Scaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    snackbarHost: @Composable () -> Unit = {},
    floatingActionButton: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    containerColor: Color = Color.Unspecified,
    contentColor: Color = LocalContentColor.current,
    content: @Composable (PaddingValues) -> Unit
) {
    Surface(
        modifier = modifier,
        backgroundColor = containerColor,
        contentColor = contentColor
    ) {
        ScaffoldLayout(
            topBar = topBar,
            content = content,
            snackbar = snackbarHost,
            fab = floatingActionButton,
            bottomBar = bottomBar
        )
    }
}

/**
 *  ScaffoldLayout을 구성하는 함수입니다.
 *  @param topBar : 상단 바
 *  @param content : Scaffold의 content
 *  @param snackbar : Snackbar
 *  @param fab : Floating Action Button
 *  @param bottomBar : 하단 네비게이션 바
 */
@Composable
private fun ScaffoldLayout(
    topBar: @Composable () -> Unit,
    content: @Composable (PaddingValues) -> Unit,
    snackbar: @Composable () -> Unit,
    fab: @Composable () -> Unit,
    bottomBar: @Composable () -> Unit
) {
    val snackBarPxValue = LocalDensity.current.run { SnackBarBottomSpacing.toPx() }.toInt()
    val fabEndMarginPxValue = LocalDensity.current.run { FabEndSpacing.toPx() }.toInt()
    val fabBottomMarginPxValue = LocalDensity.current.run { FabBottomSpacing.toPx() }.toInt()

    SubcomposeLayout(
        modifier = Modifier.semantics { isTraversalGroup = true }
    ) { constraints ->
        val layoutWidth = constraints.maxWidth
        val layoutHeight = constraints.maxHeight

        val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)

        val topBarPlaceable = subcompose(ScaffoldLayoutContent.TopBar) {
            Box(
                modifier = Modifier.semantics {
                    isTraversalGroup = true
                    traversalIndex = 0f
                }
            ) {
                topBar()
            }
        }.first().measure(looseConstraints)

        val mainContentPlaceable = subcompose(ScaffoldLayoutContent.MainContent) {
            Box(
                modifier = Modifier.semantics {
                    isTraversalGroup = true
                    traversalIndex = 2f
                }
            ) {
                content(PaddingValues(0.dp))
            }
        }.first().measure(looseConstraints)

        val snackBarPlaceable = subcompose(ScaffoldLayoutContent.Snackbar) {
            Box(modifier = Modifier
                .padding(horizontal = SnackBarHorizontalSpacing) // TODO : SnackBar 컴포넌트 자체에서 margin을 줄지 여기서 주어야 할지?
                .semantics {
                    isTraversalGroup = true
                    traversalIndex = 4f
                }
            ) {
                snackbar()
            }
        }.first().measure(looseConstraints)

        val fabPlaceable = subcompose(ScaffoldLayoutContent.Fab) {
            Box(modifier = Modifier.semantics {
                isTraversalGroup = true
                traversalIndex = 3f
            }) {
                fab()
            }
        }.first().measure(looseConstraints)

        val bottomBarPlaceable = subcompose(ScaffoldLayoutContent.BottomBar) {
            Box(modifier = Modifier.semantics {
                isTraversalGroup = true
                traversalIndex = 1f
            }) {
                bottomBar()
            }
        }.first().measure(looseConstraints)

        val bottomBarVerticalOffset = layoutHeight - bottomBarPlaceable.height
        val fabVerticalOffset =
            bottomBarVerticalOffset - fabPlaceable.height - fabBottomMarginPxValue
        val snackBarVerticalOffset = fabVerticalOffset - snackBarPlaceable.height - snackBarPxValue
        val fabHorizontalOffset = layoutWidth - fabPlaceable.width - fabEndMarginPxValue

        layout(layoutWidth, layoutHeight) {
            topBarPlaceable.placeRelative(0, 0)
            mainContentPlaceable.placeRelative(0, topBarPlaceable.height)
            snackBarPlaceable.placeRelative(0, snackBarVerticalOffset)
            fabPlaceable.placeRelative(fabHorizontalOffset, fabVerticalOffset)
            bottomBarPlaceable.placeRelative(0, bottomBarVerticalOffset)
        }
    }
}

object ScaffoldSpacingValues {
    val FabBottomSpacing = 32.dp
    val FabEndSpacing = 16.dp
    val SnackBarBottomSpacing = 16.dp
    val SnackBarHorizontalSpacing = 16.dp
}

private enum class ScaffoldLayoutContent {
    TopBar,
    MainContent,
    Snackbar,
    Fab,
    BottomBar
}