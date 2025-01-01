package com.rabidrabbit.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.rabidrabbit.model.Country
import com.rabidrabbit.utility.StringUtilities
import kotlinx.datetime.TimeZone
import org.jetbrains.compose.resources.painterResource

@Composable
fun TimeAtLocationScreen(modifier: Modifier = Modifier) {
    var showCountries by remember { mutableStateOf(false) }
    var selectedCountry by remember { mutableStateOf<Country?>(null) }
    val timeAtLocation by remember(selectedCountry) {
        derivedStateOf {
            selectedCountry?.let {
                "The current time in ${it.name} is ${StringUtilities.currentTime(it.zone)}"
            } ?: "The current time is ${StringUtilities.currentTime(TimeZone.currentSystemDefault())}"
        }
    }

    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = timeAtLocation, modifier = Modifier.padding(PaddingNormal))

        Row {
            DropdownMenu(expanded = showCountries, onDismissRequest = { showCountries = false } ) {
                Country.all().forEach { country ->
                    DropdownMenuItem(
                        onClick = {
                            selectedCountry = country
                            showCountries = false
                        }
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painter = painterResource(country.image),
                                contentDescription = null,
                                modifier = Modifier.size(IconDimens.FlagSize).padding(end = PaddingSmall)
                            )

                            Text(country.name)
                        }
                    }
                }
            }
        }

        Button(onClick = { showCountries = !showCountries }) {
            Text("Select Location")
        }
    }
}