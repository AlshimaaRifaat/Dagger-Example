package com.example.dagger_login.di;

import com.example.dagger_login.di.auth.AuthModule;
import com.example.dagger_login.di.auth.AuthViewModelsModule;
import com.example.dagger_login.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {


    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();




}
