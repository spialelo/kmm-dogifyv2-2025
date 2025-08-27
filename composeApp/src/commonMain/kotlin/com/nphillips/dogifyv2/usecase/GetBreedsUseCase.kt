package com.nphillips.dogifyv2.usecase

import com.nphillips.dogifyv2.model.Breed

class GetBreedsUseCase {
    suspend fun invoke(): List<Breed> = listOf(Breed("Test get", ""),)
}