package com.rabidrabbit

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.rabidrabbit.ui.TimeAtLocationScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        TimeAtLocationScreen(modifier = Modifier.fillMaxSize())
    }
}
