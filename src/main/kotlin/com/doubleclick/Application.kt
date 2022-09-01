package com.doubleclick

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.doubleclick.plugins.*

fun main() {
    embeddedServer(Netty, port = 8000, host = "127.0.0.1") {
        configureSecurity()
        configureSerialization()
        configureRouting()
    }.start(wait = true)
}
