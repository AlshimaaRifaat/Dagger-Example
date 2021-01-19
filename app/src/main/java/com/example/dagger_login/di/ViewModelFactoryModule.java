package com.example.dagger_login.di;

import androidx.lifecycle.ViewModelProvider;

import com.example.dagger_login.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);

}
