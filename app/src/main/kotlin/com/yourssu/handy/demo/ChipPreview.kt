package com.yourssu.handy.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.Chip
import com.yourssu.handy.compose.ChipSize
import com.yourssu.handy.compose.ChipState
import com.yourssu.handy.compose.HandyTheme

@Preview
@Composable
fun ChipPreview() {
    HandyTheme {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .background(Color.White)
                .padding(10.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(16.dp)
            ) {
                Chip(
                    text = "Unselected",
                    chipState = ChipState.Unselected,
                    chipSize = ChipSize.Large
                )

                Chip(
                    text = "Selected",
                    chipState = ChipState.Selected,
                    chipSize = ChipSize.Large
                )

                Chip(
                    text = "Disabled",
                    chipState = ChipState.Disabled,
                    chipSize = ChipSize.Large
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(16.dp)
            ) {
                Chip(
                    text = "Unselected",
                    chipState = ChipState.Unselected,
                    chipSize = ChipSize.Small
                )

                Chip(
                    text = "Selected",
                    chipState = ChipState.Selected,
                    chipSize = ChipSize.Small
                )

                Chip(
                    text = "Disabled",
                    chipState = ChipState.Disabled,
                    chipSize = ChipSize.Small
                )
            }
        }
    }
}

@Preview
@Composable
fun HorizontalChipPreview() {
    HandyTheme {
        val state = rememberLazyListState(initialFirstVisibleItemIndex = 2)
        LazyRow(
            state = state,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .background(Color.White)
                .padding(10.dp)

        ) {
            item {
                Chip(
                    text = "Chip1",
                    chipState = ChipState.Unselected,
                    chipSize = ChipSize.Large
                )
            }
            item {
                Chip(
                    text = "Chip2",
                    chipState = ChipState.Selected,
                    chipSize = ChipSize.Large
                )
            }
            item {
                Chip(
                    text = "Chip3",
                    chipState = ChipState.Disabled,
                    chipSize = ChipSize.Large
                )
            }
            item {
                Chip(
                    text = "LongNameChip",
                    chipState = ChipState.Unselected,
                    chipSize = ChipSize.Large
                )
            }
        }
    }
}