package com.ultimavip.testsomething.testdragger;

import com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * Created by zhuxing on 2018/4/12.
 */
@Module
public class RetrofitModule {
    public static Retrofit mRetrofit;


    @Provides
    public static Retrofit getHttpClient () {
        if (mRetrofit == null) {
            synchronized (RetrofitModule.class) {
                if (mRetrofit == null)
                    mRetrofit = new Retrofit.Builder()
                            .baseUrl("https://gw.shenzhuzhuli.com/")
                            .addConverterFactory(new Retrofit2ConverterFactory())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .build();
            }
        }
        return mRetrofit;
    }
}
