package com.rabidrabbit.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.rabidrabbit.utility.StringUtilities

@Composable
fun TimeAtLocationScreen(modifier: Modifier = Modifier) {
    var location by remember { mutableStateOf("Europe/Paris") }
    var timeAtLocation by remember { mutableStateOf("No location selected") }

    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(timeAtLocation)

        TextField(value = location, onValueChange = { location = it })

        Button(onClick = { timeAtLocation = StringUtilities.currentTimeAt(location) ?: "Invalid Location" }) {
            Text("Show Time At Location")
        }
    }
}