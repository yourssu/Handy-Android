package com.yourssu.handy.demo

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.CenterAlignedTopAppBar
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Icon
import com.yourssu.handy.compose.LeftAlignedTopAppBar
import com.yourssu.handy.compose.Text
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.line.Add
import com.yourssu.handy.compose.icons.line.ArrowsChevronLeft

@Preview(showBackground = true)
@Composable
fun CenterAlignedTopAppBarPreview() {
    Column {
        CenterAlignedTopAppBar(
            title = "Centered",
            navIcon = HandyIcons.Line.ArrowsChevronLeft,
            onNavIconClick = { Log.d("TopBarPreview", "ArrowsChevronLeft clicked") },
            actions = {}
        )

        Spacer(modifier = Modifier.height(10.dp))

        CenterAlignedTopAppBar(
            title = "Back Example",
            navIcon = HandyIcons.Line.ArrowsChevronLeft,
            onNavIconClick = { Log.d("TopBarPreview", "ArrowsChevronLeft clicked") },
            actions = {
                Text(
                    text = "Share",
                    color = HandyTheme.colors.textBrandPrimary,
                    modifier = Modifier.clickable { Log.d("TopBarPreview", "Share clicked") })
            }
        )

        Spacer(modifier = Modifier.height(10.dp))

        CenterAlignedTopAppBar(
            title = "최대8자까지가능",
            navIcon = HandyIcons.Line.ArrowsChevronLeft,
            onNavIconClick = { Log.d("TopBarPreview", "ArrowsChevronLeft clicked") },
            actions = {
                Icon(
                    imageVector = HandyIcons.Line.Add,
                    contentDescription = "Add",
                    modifier = Modifier.clickable { Log.d("TopBarPreview", "Add clicked") }
                )
                Text(
                    text = "Text",
                    color = HandyTheme.colors.textBrandPrimary,
                    modifier = Modifier.clickable { Log.d("TopBarPreview", "Share clicked") })

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

        Spacer(modifier = Modifier.height(10.dp))

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

        Spacer(modifier = Modifier.height(10.dp))

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

        Spacer(modifier = Modifier.height(10.dp))

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