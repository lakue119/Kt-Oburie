//package com.lakue.oburie.di
//
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.android.components.ApplicationComponent
//import okhttp3.OkHttpClient
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//import javax.inject.Singleton
//
//
//@Module
//@InstallIn(ApplicationComponent::class)
//object NetworkModule {
//
//    //    @Provides
////    fun provideWeatherService(): WeatherService {
////        return Retrofit.Builder()
////            .baseUrl(BuildConfig.BASE_URL)
////            .addConverterFactory(GsonConverterFactory.create())
////            .build()
////            .create(WeatherService::class.java)
////    }
//
//    @Provides
//    fun provideBaseUrl() = BuildConfig.BASE_URL
//
//    @Provides
//    @Singleton
//    fun provideOkHttpClient() = if (BuildConfig.DEBUG) {
//        val loggingInterceptor = HttpLoggingInterceptor()
//        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
//        OkHttpClient.Builder()
//            .addInterceptor(loggingInterceptor)
//            .build()
//    } else OkHttpClient
//        .Builder()
//        .build()
//
//    @Provides
//    @Singleton
//    fun provideRetrofit(
//        okHttpClient: OkHttpClient,
//        BASE_URL: String
//    ): Retrofit =
//        Retrofit.Builder()
//            .addConverterFactory(GsonConverterFactory.create())
//            .baseUrl(BASE_URL)
//            .client(okHttpClient)
//            .build()
//
//    @Provides
//    @Singleton
//    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)
//
//    @Provides
//    @Singleton
//    fun provideApiHelper(apiHelper: ApiHelperImpl): ApiHelper = apiHelper
//}