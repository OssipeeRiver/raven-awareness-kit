package com.ossipeeriver.ravenawarenesskit.data.network

import com.ossipeeriver.ravenawarenesskit.model.Contract
import retrofit2.http.GET

interface ContractApiService {
    @GET("contract")
    suspend fun getContracts(): List<Contract>
}