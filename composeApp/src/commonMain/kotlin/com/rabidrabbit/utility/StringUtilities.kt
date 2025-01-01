package com.rabidrabbit.utility

import kotlinx.datetime.Clock
import kotlinx.datetime.IllegalTimeZoneException
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.format
import kotlinx.datetime.format.char
import kotlinx.datetime.toLocalDateTime

object StringUtilities {

    fun currentDate(): String {
        val format = LocalDateTime.Format {
            monthNumber()
            char('/')
            dayOfMonth()
            char('/')
            year()
        }

        val now = Clock.System.now()
        val zone = TimeZone.currentSystemDefault()
        val localDateTime =  now.toLocalDateTime(zone)

        return localDateTime.format(format)
    }

    //TODO Covert from military time to am/pm time
    fun currentTimeAt(location: String) : String? {
        val format = LocalTime.Format {
            hour()
            char(':')
            minute()
            char(':')
            second()
        }

        return try {
            val now = Clock.System.now()
            val zone = TimeZone.of(location)
            val localTime = now.toLocalDateTime(zone).time

            localTime.format(format)
        }
        catch (itze: IllegalTimeZoneException) {
            //TODO Figure out how to log
            null
        }
    }

}