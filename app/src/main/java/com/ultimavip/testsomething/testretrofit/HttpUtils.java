package com.ultimavip.testsomething.testretrofit;

import com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * Created by zhuxing on 2018/4/12.
 */

public class HttpUtils {
    public static Retrofit mRetrofit;

    public static Retrofit getHttpClient () {
        if (mRetrofit == null) {
            synchronized (HttpUtils.class) {
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
