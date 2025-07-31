package com.example.stockmarketapp.presentation.company_listings

sealed class Company_listingsEvent {
    object Refresh : Company_listingsEvent()
    data class OnSearchQueryChange(val query: String) : Company_listingsEvent()

}