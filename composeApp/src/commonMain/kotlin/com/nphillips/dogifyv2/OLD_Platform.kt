package com.nphillips.dogifyv2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform