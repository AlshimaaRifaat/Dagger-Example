package com.example.dagger_login.di;

import com.example.dagger_login.di.main.MainFragmentBuildersModule;
import com.example.dagger_login.di.main.MainModule;
import com.example.dagger_login.di.main.MainViewModelsModule;
import com.example.dagger_login.ui.main.MainActivity;
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



 @ContributesAndroidInjector  (
            modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();

}
