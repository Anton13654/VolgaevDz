package com.aeincprojects.volgaevdz.ui


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MakeScreen(){
    var textNumber by remember { mutableStateOf("0") }

    Column(modifier = Modifier.fillMaxSize().background(Color.LightGray )) {
        Box(modifier = Modifier.fillMaxHeight(0.7f).fillMaxWidth(1f), contentAlignment = Alignment.Center){
            Text(modifier = Modifier.background(Color.White).padding(horizontal = 30.dp, vertical = 20.dp), text = textNumber, fontSize = 22.sp)
        }
        TextButton(modifier = Modifier.align(Alignment.CenterHorizontally).background(Color.White).border(2.dp, Color.DarkGray, shape = RoundedCornerShape(6.dp)), onClick = {
            textNumber = (0..100).random().toString()
        }) {
            Text(text = "Сгенерировать число", fontSize = 22.sp)
        }
    }

}