package com.rabidrabbit

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform