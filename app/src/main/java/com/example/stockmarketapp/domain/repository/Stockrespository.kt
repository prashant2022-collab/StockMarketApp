package com.example.stockmarketapp.domain.repository

import com.example.stockmarketapp.domain.model.CompanyInfo
import com.example.stockmarketapp.domain.model.CompanyListing
import com.example.stockmarketapp.domain.model.Intradayinfo
import com.example.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Query

interface Stockrespository {

    suspend fun getCompanyListings(
          fetchFromRemote: Boolean,
          query: String
    ):Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<Intradayinfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}

