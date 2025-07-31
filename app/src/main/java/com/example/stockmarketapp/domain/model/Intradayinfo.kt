package com.example.stockmarketapp.domain.model

import java.sql.Date
import java.time.LocalDateTime
import java.util.function.DoubleUnaryOperator

data class Intradayinfo (
     val date: LocalDateTime,
     val close : Double
 )