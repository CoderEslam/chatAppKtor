package com.doubleclick.authentication

import io.ktor.util.*
import io.ktor.utils.io.core.*
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec
import kotlin.text.toByteArray

private val hashKey = "MySuperSecretHashKey".toByteArray();
private val hmachKey = SecretKeySpec(hashKey, "HmacSHA1")


fun hash(password: String): String {

    val hmac = Mac.getInstance("HmacSHA1")
    hmac.init(hmachKey)
    return hex(hmac.doFinal(password.toByteArray(Charsets.UTF_8)))


}