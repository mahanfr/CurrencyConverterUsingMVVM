package ir.mahanfr.currencychanger.main

import ir.mahanfr.currencychanger.data.models.CurrencyResponse
import ir.mahanfr.currencychanger.util.Resource

interface MainRepository {
    suspend fun getRates(base: String): Resource<CurrencyResponse>
}