package com.yourssu.handy.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.yourssu.handy.compose.Icon
import com.yourssu.handy.compose.IconSize
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.filled.*
import com.yourssu.handy.compose.icons.line.*

private val iconSizes = listOf(
    IconSize.XXS, IconSize.XS, IconSize.S, IconSize.M, IconSize.L, IconSize.XL, IconSize.XXL
)

@Preview
@Composable
private fun IconSizePreview() {
    Row(Modifier.background(Color.White)) {
        Column {
            iconSizes.forEach { iconSize ->
                Icon(HandyIcons.Filled.Add, iconSize = iconSize)
            }
        }
        Column {
            iconSizes.forEach { iconSize ->
                Icon(HandyIcons.Line.Add, iconSize = iconSize)
            }
        }
    }
}

private val lineIcons by lazy {
    with(HandyIcons.Line) {
        listOf(
            Add, AlertTriangle, ArrowsChevronDown, ArrowsChevronLeft, ArrowsChevronRight, ArrowsChevronUp,
            Bookmark, Calender, Cancel, Check, Clock, Close, Comment, Copy, Crop,
            Documents, Download, Edit, ExternalLink, Eye, Filter, FilterBar, Flag, Flame, Folder,
            Heart, Home, Image, InfoCircle, Kebab, Layout, List, Lock,
            Mail, MailOpened, Meatball, Menu, Microphone, Notification, NotificationOff,
            Pin, Plus, RetryRefresh, Search, Setting, Share, ShoppingBag, ShoppingCart, Star, Subtract,
            Tag, Trash, Unlock, User
        )
    }
}

private val filledIcons by lazy {
    with(HandyIcons.Filled) {
        listOf(
            Add, AlertTriangle, ArrowsChevronDown, ArrowsChevronLeft, ArrowsChevronRight, ArrowsChevronUp,
            Bookmark, Calender, Cancel, Check, Clock, Close, Comment, Copy, Crop,
            Documents, Download, Edit, ExternalLink, Eye, Filter, FilterBar, Flag, Flame, Folder,
            Heart, Home, Image, InfoCircle, Kebab, Layout, List, Lock,
            Mail, MailOpened, Meatball, Menu, Microphone, Notification, NotificationOff,
            Pin, Plus, RetryRefresh, Search, Setting, Share, ShoppingBag, ShoppingCart, Star, Subtract,
            Tag, Trash, Unlock, User
        )
    }
}

@Preview
@Composable
private fun IconsPreview() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(6),
        modifier = Modifier.background(Color.White)
    ) {
        items(lineIcons) { icon ->
            Icon(icon)
        }
        items(filledIcons) { icon ->
            Icon(icon)
        }
    }
}
