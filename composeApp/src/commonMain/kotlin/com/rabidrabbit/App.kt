package com.rabidrabbit

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.rabidrabbit.ui.TimeAtLocationScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        //SlideInImageScreen(modifier = Modifier.fillMaxSize())
        TimeAtLocationScreen(modifier = Modifier.fillMaxSize())
    }
}
