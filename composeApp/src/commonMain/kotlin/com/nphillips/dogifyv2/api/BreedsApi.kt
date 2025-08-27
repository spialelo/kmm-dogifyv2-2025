package com.nphillips.dogifyv2.api

import com.nphillips.dogifyv2.api.model.BreedImageResponse
import com.nphillips.dogifyv2.api.model.BreedsResponse
import io.ktor.client.call.body
import io.ktor.client.request.get


internal class BreedsApi: KtorApi() {

    /*
    With the ContentNegotiation plugin installed, you can deserialize
    JSON data into a data class when receiving responses. See KtorApi
    imports.
     */
    suspend fun getBreeds(): BreedsResponse = client.get {
        apiUrl("breeds/list")
    }.body()

    suspend fun getRandomBreedImageFor(breed: String): BreedImageResponse = client.get {
        apiUrl("breed/$breed/images/random")
    }.body()
}