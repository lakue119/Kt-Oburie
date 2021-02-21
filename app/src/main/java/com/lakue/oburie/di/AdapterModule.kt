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



//class MyClass : NonHiltLibraryClass() {
//
//    @EntryPoint
//    @InstallIn(ApplicationComponent::class)
//    interface MyClassInterface {
//        fun getFoo(): Foo
//        fun getBar(): Bar
//    }
//
//    fun doSomething(context: Context) {
//        val myClassInterface =
//            EntryPoints.get(applicationContext, MyClassInterface::class.java)
//        val foo = myClassInterface.getFoo()
//        val bar = myClassInterface.getBar()
//
//    }
//}