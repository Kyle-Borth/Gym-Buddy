package com.rabidrabbit

import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    val state = rememberWindowState(size = DpSize(400.dp, 250.dp), position = WindowPosition(500.dp, 500.dp))

    Window(onCloseRequest = ::exitApplication, state = state, title = "Gym Buddy") {
        App()
    }
}
