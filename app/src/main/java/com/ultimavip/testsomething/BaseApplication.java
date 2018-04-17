package com.ultimavip.testsomething;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by zhuxing on 2018/4/17.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate () {
        super.onCreate();

        ARouter.openLog();     // 打印日志
        ARouter.openDebug();
        ARouter.init(this);
    }
}
