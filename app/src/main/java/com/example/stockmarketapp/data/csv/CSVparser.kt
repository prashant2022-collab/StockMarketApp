package com.example.stockmarketapp.data.csv

import java.io.InputStream

interface CSVparser <T>{
    suspend fun parse(stream : InputStream):List<T>
}