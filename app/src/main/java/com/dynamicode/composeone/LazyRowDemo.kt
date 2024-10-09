package com.dynamicode.composeone

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LazyRowDemo(modifier: Modifier = Modifier) {
    LazyRow(contentPadding = PaddingValues(10.dp), modifier = Modifier.fillMaxWidth().background(Color.Yellow).height(100.dp), reverseLayout = true,) {
//        item {
//            Text(text = "douglas", fontSize = 20.sp, modifier = Modifier.background(Color.Gray).padding(10.dp))
//        }
//        item {
//            Text(text = "dynamicode", fontSize = 20.sp, modifier = Modifier.background(Color.Red).padding(10.dp))
//        }
//        item {
//            Text(text = "shanghai", fontSize = 20.sp, modifier = Modifier.background(Color.Green).padding(10.dp))
//        }
        items(10){
            Text(text = "douglas", fontSize = 20.sp, modifier = Modifier.background(Color.Gray).padding(10.dp))
        }
    }
}