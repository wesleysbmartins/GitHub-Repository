package com.example.github_repository

import android.app.Application
import com.example.github_repository.data.di.DataModule
import com.example.github_repository.domain.di.DomainModule
import com.example.github_repository.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}