package com.rabidrabbit.model

import gymbuddy.composeapp.generated.resources.Res
import gymbuddy.composeapp.generated.resources.ic_egypt
import gymbuddy.composeapp.generated.resources.ic_france
import gymbuddy.composeapp.generated.resources.ic_indonesia
import gymbuddy.composeapp.generated.resources.ic_japan
import gymbuddy.composeapp.generated.resources.ic_mexico
import kotlinx.datetime.TimeZone
import org.jetbrains.compose.resources.DrawableResource

data class Country(val name: String, val zone: TimeZone, val image: DrawableResource) {

    companion object {
        fun all() = listOf(
            Country("Japan", TimeZone.of("Asia/Tokyo"), Res.drawable.ic_japan),
            Country("France", TimeZone.of("Europe/Paris"), Res.drawable.ic_france),
            Country("Mexico", TimeZone.of("America/Mexico_City"), Res.drawable.ic_mexico),
            Country("Indonesia", TimeZone.of("Asia/Jakarta"), Res.drawable.ic_indonesia),
            Country("Egypt", TimeZone.of("Africa/Cairo"), Res.drawable.ic_egypt),
        )
    }

}
