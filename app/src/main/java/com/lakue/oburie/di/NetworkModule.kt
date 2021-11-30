//package com.lakue.oburie.di
//
//import com.google.gson.GsonBuilder
//import com.lakue.oburie.BuildConfig
//import com.lakue.oburie.api.ApiHelper
//import com.lakue.oburie.api.ApiHelperImpl
//import com.lakue.oburie.api.ApiService
//import com.lakue.oburie.pref.PrefManager
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.android.components.ApplicationComponent
//import dagger.hilt.components.SingletonComponent
//import okhttp3.Interceptor
//import okhttp3.OkHttpClient
//import okhttp3.Response
//import okhttp3.logging.HttpLoggingInterceptor
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//import java.io.IOException
//import java.util.concurrent.TimeUnit
//import javax.inject.Singleton
//
//
//@Module
//@InstallIn(SingletonComponent::class)
//object NetworkModule {
//
//    private const val CONNECT_TIMEOUT = 60L
//    private const val WRITE_TIMEOUT = 60L
//    private const val READ_TIMEOUT = 60L
//
//    @Provides
//    fun provideBaseUrl() = BuildConfig.BASE_URL
//
//    @Provides
//    @Singleton
//    fun provideOkHttpClient(prefManager: PrefManager) = if (BuildConfig.DEBUG) {
//        val loggingInterceptor = HttpLoggingInterceptor()
//        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
//        OkHttpClient.Builder()
//                .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
//                .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
//                .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
//                .retryOnConnectionFailure(true)
//                .addInterceptor(loggingInterceptor)
//                .addInterceptor(HeaderInterceptor(prefManager.userToken))
//                .build()
//    } else OkHttpClient
//            .Builder()
//            .build()
//
//    @Provides
//    @Singleton
//    fun provideRetrofit(
//            okHttpClient: OkHttpClient,
//            BASE_URL: String
//    ): Retrofit =
//            Retrofit.Builder()
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .baseUrl(BASE_URL)
//                    .client(okHttpClient)
//                    .build()
//
//    @Provides
//    @Singleton
//    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)
//
//    @Provides
//    @Singleton
//    fun provideApiHelper(apiHelper: ApiHelperImpl): ApiHelper = apiHelper
//
//    class HeaderInterceptor constructor(private val token: String) : Interceptor {
//        @Throws(IOException::class)
//        override fun intercept(chain: Interceptor.Chain): Response {
//            val token = token
//            val newRequest = chain.request().newBuilder().addHeader("bearer", token).build()
//            return chain.proceed(newRequest)
//        }
//    }
//
//}