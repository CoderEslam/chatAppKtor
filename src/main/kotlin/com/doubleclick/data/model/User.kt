package com.doubleclick.data.model

import io.ktor.server.auth.*


data class User(val email: String, val hashPassword: String, val name: String, val token: String) : Principal