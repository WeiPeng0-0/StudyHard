package com.ultimavip.testsomething.utils;

import android.util.Log;

/**
 * Created by zhuxing on 2018/4/9.
 */

public class MathUtils {
    public static int sum(int a1,int a2){
       int  result=a1+a2;
        result++;
        result++;
        result++;
        Log.e("MathUtils",""+result);
        ++result;
        result++;
        ++result;
        return result;
    }
}
