package com.zodiac.sugarplus2.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.zodiac.sugarplus2.navigation.Navigation
import com.zodiac.sugarplus2.screens.auth.SignupScreen

@Composable
fun SugarPlusApp(){
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
      Navigation()
    }
}