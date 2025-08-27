package com.nphillips.dogifyv2.di

import com.nphillips.dogifyv2.api.BreedsApi
import com.nphillips.dogifyv2.repository.BreedsRemoteSource
import com.nphillips.dogifyv2.repository.BreedsRepository
import com.nphillips.dogifyv2.usecase.FetchBreedsUseCase
import com.nphillips.dogifyv2.usecase.GetBreedsUseCase
import com.nphillips.dogifyv2.usecase.ToggleFavouriteStateUseCase
import com.nphillips.dogifyv2.util.getDispatcherProvider
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module


private val utilityModule = module {
    factory { getDispatcherProvider() }
}

private val apiModule = module {
    factory { BreedsApi() }
}

private val repositoryModule = module {
    single { BreedsRepository(get()) }
    
    factory { BreedsRemoteSource(get(), get()) }
}

private val usecaseModule = module {
    factory { GetBreedsUseCase() }
    factory { FetchBreedsUseCase() }
    factory { ToggleFavouriteStateUseCase() }
}

private val sharedModules = listOf(usecaseModule, repositoryModule, apiModule, utilityModule)
fun initKoin(appDeclaration: KoinAppDeclaration = {}) = startKoin {
    appDeclaration()
    modules(sharedModules)
}
