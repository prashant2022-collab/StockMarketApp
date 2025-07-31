package com.example.stockmarketapp.data.mapper

import com.example.stockmarketapp.data.remote.dto.IntradayInfoDto
import com.example.stockmarketapp.domain.model.Intradayinfo
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

fun IntradayInfoDto.toIntradayInfo(): Intradayinfo {
    val pattern = "yyyy-MM-dd HH:mm:ss"
    val formatter = DateTimeFormatter.ofPattern(pattern, Locale.getDefault())
    val localDateTime = LocalDateTime.parse(timestamp, formatter)
    return Intradayinfo(
        date = localDateTime,
        close = close
    )
}

