package com.nphillips.dogifyv2.usecase

import com.nphillips.dogifyv2.model.Breed
import com.nphillips.dogifyv2.repository.BreedsRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetBreedsUseCase: KoinComponent {
    private  val breedsRepository: BreedsRepository by inject()

    suspend fun invoke(): List<Breed> = breedsRepository.fetch()
}