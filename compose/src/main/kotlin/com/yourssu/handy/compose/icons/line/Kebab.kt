package com.yourssu.handy.compose.icons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _kebab: ImageVector? = null

public val HandyIcons.Line.Kebab: ImageVector
    get() {
        if (_kebab != null) {
            return _kebab!!
        }
        _kebab = handyIcon {
            group {
                group {
                    handyPath {
                        moveTo(12f, 18.5389f)
                        curveTo(11.725f, 18.5389f, 11.4896f, 18.441f, 11.2938f, 18.2452f)
                        curveTo(11.0979f, 18.0493f, 11f, 17.8139f, 11f, 17.5389f)
                        curveTo(11f, 17.2639f, 11.0979f, 17.0285f, 11.2938f, 16.8327f)
                        curveTo(11.4896f, 16.6368f, 11.725f, 16.5389f, 12f, 16.5389f)
                        curveTo(12.275f, 16.5389f, 12.5104f, 16.6368f, 12.7063f, 16.8327f)
                        curveTo(12.9021f, 17.0285f, 13f, 17.2639f, 13f, 17.5389f)
                        curveTo(13f, 17.8139f, 12.9021f, 18.0493f, 12.7063f, 18.2452f)
                        curveTo(12.5104f, 18.441f, 12.275f, 18.5389f, 12f, 18.5389f)
                        close()
                        moveTo(12f, 13.0004f)
                        curveTo(11.725f, 13.0004f, 11.4896f, 12.9025f, 11.2938f, 12.7067f)
                        curveTo(11.0979f, 12.5108f, 11f, 12.2754f, 11f, 12.0004f)
                        curveTo(11f, 11.7254f, 11.0979f, 11.49f, 11.2938f, 11.2942f)
                        curveTo(11.4896f, 11.0983f, 11.725f, 11.0004f, 12f, 11.0004f)
                        curveTo(12.275f, 11.0004f, 12.5104f, 11.0983f, 12.7063f, 11.2942f)
                        curveTo(12.9021f, 11.49f, 13f, 11.7254f, 13f, 12.0004f)
                        curveTo(13f, 12.2754f, 12.9021f, 12.5108f, 12.7063f, 12.7067f)
                        curveTo(12.5104f, 12.9025f, 12.275f, 13.0004f, 12f, 13.0004f)
                        close()
                        moveTo(12f, 7.46191f)
                        curveTo(11.725f, 7.4619f, 11.4896f, 7.364f, 11.2938f, 7.1682f)
                        curveTo(11.0979f, 6.9723f, 11f, 6.7369f, 11f, 6.4619f)
                        curveTo(11f, 6.1869f, 11.0979f, 5.9515f, 11.2938f, 5.7557f)
                        curveTo(11.4896f, 5.5598f, 11.725f, 5.4619f, 12f, 5.4619f)
                        curveTo(12.275f, 5.4619f, 12.5104f, 5.5598f, 12.7063f, 5.7557f)
                        curveTo(12.9021f, 5.9515f, 13f, 6.1869f, 13f, 6.4619f)
                        curveTo(13f, 6.7369f, 12.9021f, 6.9723f, 12.7063f, 7.1682f)
                        curveTo(12.5104f, 7.364f, 12.275f, 7.4619f, 12f, 7.4619f)
                        close()
                    }
                }
            }
        }
        return _kebab!!
    }

