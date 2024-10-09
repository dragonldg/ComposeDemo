package com.dynamicode.composeone

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ColumnDemo(modifier: Modifier = Modifier) {
    Column(Modifier.verticalScroll(rememberScrollState())) {
        for (i in 0 .. 10){
            ItemDemo()
        }
    }
}

@Composable
fun ItemDemo(modifier: Modifier = Modifier) {
    Card(modifier = Modifier.padding(10.dp)/*, elevation = CardElevation.hoveredElevation*/) {
        Row {
            Image(painter = painterResource(id = R.drawable.anew) , modifier = Modifier.size(60.dp,60.dp), contentScale = ContentScale.FillHeight, contentDescription = null)
            Text(text = "dddd", fontSize = 20.sp)
            Icon(imageVector = Icons.Default.Add, contentDescription = null)
        }
    }
}