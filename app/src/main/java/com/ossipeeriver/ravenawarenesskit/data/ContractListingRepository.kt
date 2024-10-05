package com.ossipeeriver.ravenawarenesskit.data

import com.ossipeeriver.ravenawarenesskit.data.network.ContractApiService
import com.ossipeeriver.ravenawarenesskit.model.Contract

interface ContractListingRepository {
    suspend fun getContractListing() : List<Contract>
}

class NetworkContractListingRepository(
    private val contractApiService: ContractApiService
) : ContractListingRepository {
    override suspend fun getContractListing(): List<Contract> = contractApiService.getContracts()
}