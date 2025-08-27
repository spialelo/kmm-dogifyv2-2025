package com.nphillips.dogifyv2.usecase

import com.nphillips.dogifyv2.model.Breed

class FetchBreedsUseCase {
    suspend fun invoke(): List<Breed> = listOf(Breed("Test fetch", ""),)
}