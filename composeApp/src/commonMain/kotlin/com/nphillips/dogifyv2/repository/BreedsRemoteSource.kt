package com.nphillips.dogifyv2.repository

import com.nphillips.dogifyv2.api.BreedsApi
import com.nphillips.dogifyv2.util.DispatcherProvider
import kotlinx.coroutines.withContext

internal class BreedsRemoteSource (
    private val api: BreedsApi,
    private val dispatcherProvider: DispatcherProvider,
) {

    suspend fun getBreeds() = withContext(dispatcherProvider.io) {
        api.getBreeds().breeds
    }

    suspend fun getBreedImage(breed: String) = withContext(dispatcherProvider.io) {
        api.getRandomBreedImageFor(breed).breedImageUrl
    }
}