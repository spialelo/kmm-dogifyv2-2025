package com.nphillips.dogifyv2.di

import com.nphillips.dogifyv2.usecase.FetchBreedsUseCase
import com.nphillips.dogifyv2.usecase.GetBreedsUseCase
import com.nphillips.dogifyv2.usecase.ToggleFavouriteStateUseCase
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

private val usecaseModule = module {
    factory { GetBreedsUseCase() }
    factory { FetchBreedsUseCase() }
    factory { ToggleFavouriteStateUseCase() }
}

private val sharedModules = listOf(usecaseModule)
fun initKoin(appDeclaration: KoinAppDeclaration = {}) = startKoin {
    appDeclaration()
    modules(sharedModules)
}
