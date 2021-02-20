//package com.lakue.oburie.di
//
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//
//@Module
//@InstallIn(ApplicationComponent::class)
//object AdapterModule {
//
//    @Provides
//    fun provideWeatherAdapter(): WeatherAdapter {
//        return WeatherAdapter()
//    }
//
//    @Provides
//    fun provideWeekWeatherAdapter(): WeekWeatherAdapter {
//        return WeekWeatherAdapter()
//    }
//
//    @Provides
//    fun provideClothesAdapter(): ClothesAdatper {
//        return ClothesAdatper()
//    }
//
//    @Provides
//    fun provideCityAdapter(): CityAdapter {
//        return CityAdapter()
//    }
//
//    @Provides
//    fun provideAddCityAdapter(): AddCityAdapter {
//        return AddCityAdapter()
//    }
//}