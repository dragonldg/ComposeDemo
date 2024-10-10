package com.dynamicode.composeone

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

/**
 * Created by liudagang on 2024/10/9.
 *
 * Package Name ComposeOne
 */
@Composable
fun ShapeDemo(modifier: Modifier = Modifier) {
    Text(text = "", modifier = Modifier.size(50.dp,80.dp).clip(getShape()).background(Color.Blue))
}

fun getShape() = object : Shape{
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path()
        path.moveTo(size.width/2,0f)
        path.lineTo(size.width,size.height)
        path.lineTo(0f,size.height)
        path.close()
        return Outline.Generic(path)
    }
}