package com.rabidrabbit.utility

import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDateTime
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

}