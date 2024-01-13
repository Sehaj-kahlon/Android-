package com.example.tutorialapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun greetinCard(message : String, from : String, modifier: Modifier = Modifier ){
    Column (verticalArrangement = Arrangement.Center){
        Text(text = message, fontSize =100.sp,  lineHeight = 100.sp)
        Text(text = "From $from", fontSize = 25.sp)

    }
}

