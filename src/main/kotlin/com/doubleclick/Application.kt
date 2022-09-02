package com.doubleclick

import com.doubleclick.Repository.DatabaseFactory
import com.doubleclick.authentication.JwtService
import com.doubleclick.authentication.hash
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.doubleclick.plugins.*

fun main() {
    embeddedServer(Netty, port = 8000, host = "127.0.0.1") {
        configureSecurity()
        configureSerialization()
        configureRouting()
    }.start(wait = true)


//    val db = Repo()
    val jwtService = JwtService()
    val hashFunction = { s: String -> hash(s) }
}
