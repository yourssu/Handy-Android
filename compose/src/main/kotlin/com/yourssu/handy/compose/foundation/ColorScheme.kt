package com.yourssu.handy.compose.foundation

import androidx.compose.runtime.Immutable
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
    val bgBrandLight: Color = ColorViolet50,

    // Background / Status
    val bgBrandNegative: Color = ColorStatusRedMain,
    val bgBrandPositive: Color = ColorViolet500,

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

    // Line / Basic
    val lineBasicLight: Color = ColorGray100,
    val lineBasicMedium: Color = ColorGray200,
    val lineBasicStrong: Color = ColorGray300,

    // Line / Status
    val lineStatusNegative: Color = ColorStatusRedMain,
    val lineStatusPositive: Color = ColorViolet500,

    // Button / Box / Primary
    val buttonBoxPrimaryEnabled: Color = ColorViolet500,
    val buttonBoxPrimaryPressed: Color = ColorViolet700,
    val buttonBoxPrimaryDisabled: Color = ColorGray100,

    // Button / Box / Secondary
    val buttonBoxSecondaryEnabled: Color = ColorViolet50,
    val buttonBoxSecondaryPressed: Color = ColorViolet200,
    val buttonBoxSecondaryDisabled: Color = ColorGray100,

    // Button / Box / Tertiary
    val buttonBoxTertiaryEnabled: Color = ColorNeutralTransparent,
    val buttonBoxTertiaryPressed: Color = ColorGray100,
    val buttonBoxTertiaryDisabled: Color = ColorNeutralTransparent,

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

    // Icon / Primary
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

)

val lightColorScheme = ColorScheme()
val darkColorScheme = ColorScheme()

