package com.rabidrabbit.ui.utility

import androidx.compose.runtime.Composable
import gymbuddy.composeapp.generated.resources.Res
import gymbuddy.composeapp.generated.resources.am
import gymbuddy.composeapp.generated.resources.pm
import kotlinx.datetime.Clock
import kotlinx.datetime.LocalTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.format
import kotlinx.datetime.format.Padding
import kotlinx.datetime.format.char
import kotlinx.datetime.toLocalDateTime
import org.jetbrains.compose.resources.stringResource

object StringUtilities {

    @Composable
    fun currentTime(zone: TimeZone = TimeZone.currentSystemDefault()): String {
        val amString = stringResource(Res.string.am)
        val pmString = stringResource(Res.string.pm)

        val format = LocalTime.Format {
            amPmHour(padding = Padding.NONE)
            char(':')
            minute()
            amPmMarker(amString, pmString)
        }

        val time = Clock.System.now()
        val localTime = time.toLocalDateTime(zone).time

        return localTime.format(format)
    }

}