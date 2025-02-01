package com.yourssu.handy.compose.foundation

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class ColorScheme(

    // Background / Basic
    val bgBasicDefault: Color = ColorNeutralWhite,
    val bgBasicLight: Color = ColorGray50,
    val bgBasicStrong: Color = ColorGray100,
    val bgBasicBlack: Color = ColorNeutralBlack,

    // Background / Brand
    val bgBrandPrimary: Color = ColorViolet500,
    val bgBrandSecondary: Color = ColorViolet50,

    // Background / Status
    val bgStatusNegative: Color = ColorStatusRedMain,
    val bgStatusPositive: Color = ColorViolet500,

    // Text / Basic
    val textBasicPrimary: Color = ColorNeutralBlack,
    val textBasicSecondary: Color = ColorGray700,
    val textBasicTertiary: Color = ColorGray500,
    val textBasicDisabled: Color = ColorGray300,
    val textBasicWhite: Color = ColorNeutralWhite,

    // Text / Brand
    val textBrandPrimary: Color = ColorViolet500,
    val textBrandSecondary: Color = ColorViolet600,

    // Text / Status
    val textStatusNegative: Color = ColorStatusRedMain,
    val textStatusPositive: Color = ColorViolet500,

    // Outlined / Basic
    val lineBasicLight: Color = ColorGray100,
    val lineBasicMedium: Color = ColorGray200,
    val lineBasicStrong: Color = ColorGray300,

    // Outlined / Status
    val lineStatusNegative: Color = ColorStatusRedMain,
    val lineStatusPositive: Color = ColorViolet500,

    // Button / Filled / Primary
    val buttonFilledPrimaryEnabled: Color = ColorViolet500,
    val buttonFilledPrimaryPressed: Color = ColorViolet700,
    val buttonFilledPrimaryDisabled: Color = ColorGray100,

    // Button / Filled / Secondary
    val buttonFilledSecondaryEnabled: Color = ColorViolet50,
    val buttonFilledSecondaryPressed: Color = ColorViolet200,
    val buttonFilledSecondaryDisabled: Color = ColorGray100,

    // Button / Outlined
    val buttonOutlinedEnabled: Color = ColorNeutralTransparent,
    val buttonOutlinedPressed: Color = ColorGray100,
    val buttonOutlinedDisabled: Color = ColorNeutralTransparent,

    // Button / Text / Primary
    val buttonTextPrimaryEnabled: Color = ColorNeutralTransparent,
    val buttonTextPrimaryPressed: Color = ColorViolet50,
    val buttonTextPrimaryDisabled: Color = ColorNeutralTransparent,

    // Button / Text / Secondary
    val buttonTextSecondaryEnabled: Color = ColorNeutralTransparent,
    val buttonTextSecondaryPressed: Color = ColorGray100,
    val buttonTextSecondaryDisabled: Color = ColorNeutralTransparent,

    // Button / Radio
    val buttonRadioSelected: Color = ColorViolet500,
    val buttonRadioUnselected: Color = ColorGray200,
    val buttonRadioDisabled: Color = ColorNeutralWhite,

    // Fab / Primary
    val buttonFabPrimaryEnabled: Color = ColorViolet500,
    val buttonFabPrimaryPressed: Color = ColorViolet700,
    val buttonFabPrimaryDisabled: Color = ColorGray100,

    // Fab / Secondary
    val buttonFabSecondaryEnabled: Color = ColorNeutralWhite,
    val buttonFabSecondaryPressed: Color = ColorGray100,
    val buttonFabSecondaryDisabled: Color = ColorNeutralWhite,

    // Icon / Basic
    val iconBasicPrimary: Color = ColorNeutralBlack,
    val iconBasicSecondary: Color = ColorGray700,
    val iconBasicTertiary: Color = ColorGray500,
    val iconBasicDisabled: Color = ColorGray200,
    val iconBasicWhite: Color = ColorNeutralWhite,

    // Icon / Brand
    val iconBrandPrimary: Color = ColorViolet500,
    val iconBrandSecondary: Color = ColorViolet600,

    // CheckBox
    val checkBoxSelected: Color = ColorViolet500,
    val checkBoxUnselected: Color = ColorNeutralWhite,
    val checkBoxDisabled: Color = ColorGray200,

    // Chip
    val chipSelected: Color = ColorViolet100,
    val chipUnselected: Color = ColorGray100,
    val chipDisabled: Color = ColorGray50,

    // Pagination / Brand
    val paginationBrandPressed: Color = ColorViolet50,

    // Pagination / Basic
    val paginationBasicSelected: Color = ColorNeutralBlack,
    val paginationBasicUnselected: Color = ColorGray500,

    // SnackBar
    val snackBarInfo: Color = ColorGray800,
    val snackBarError: Color = ColorStatusRedSub,

    // Switch
    val switchUnselected: Color = ColorGray300,
    val switchSelected: Color = ColorViolet500,
    val switchDisabled: Color = ColorGray200,
    val switchThumb: Color = ColorNeutralWhite,

    // BottomSheet
    val bottomSheetHandle: Color = ColorGray300
)

val lightColorScheme = ColorScheme()
val darkColorScheme = ColorScheme()

internal val LocalColorScheme = staticCompositionLocalOf { lightColorScheme }
val LocalContentColor = compositionLocalOf { lightColorScheme.textBasicPrimary }
