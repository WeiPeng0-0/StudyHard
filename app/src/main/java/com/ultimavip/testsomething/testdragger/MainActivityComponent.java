package com.ultimavip.testsomething.testdragger;

import com.ultimavip.testsomething.MainActivity;

import dagger.Component;

/**
 * Created by zhuxing on 2018/4/15.
 */

@Component
public interface MainActivityComponent  {
    void inject(MainActivity activity);
}
