package com.rabidrabbit

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document

@JsModule("@js-joda/timezone")
external object JsJodaTimeZoneModule

private val jsJodaTz = JsJodaTimeZoneModule

//TODO The Web build does not currently work, as string resources are not supported atm.
// Leaving project here in case support is added later, but not going to pursue further development at this time as web
// is low priority for this project.

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        App()
    }
}