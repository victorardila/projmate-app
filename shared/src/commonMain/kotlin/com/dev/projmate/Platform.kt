package com.dev.projmate

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform