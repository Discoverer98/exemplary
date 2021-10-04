package com.discoverer.exemplary.di.module

import com.discoverer.exemplary.model.MainRepository
import org.koin.dsl.module


val repoModule = module {
    single {
        MainRepository(get())
    }
}
