package com.ultimavip.testsomething.testretrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by zhuxing on 2018/4/12.
 */

public interface IGetRequest {
    @FormUrlEncoded
@POST("system/v1.0/appVersion/getAppVersion")
    Call<ResultBean> getCall(@Field("nonce")String nonce,@Field("sign")String sign,@Field("appVersion")String appVersion,@Field("osType")String osType);
    // @GET注解的作用:采用Get方法发送网络请求

    // getCall() = 接收网络请求数据的方法
    // 其中返回类型为Call<*>，*是接收数据的类（即上面定义的Translation类）
    // 如果想直接获得Responsebody中的内容，可以定义网络请求返回值为Call<ResponseBody>
}
