package com.ultimavip.testsomething.testarouter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ultimavip.testsomething.R;

/**
 * Created by zhuxing on 2018/4/17.
 */
@Route(path = "/main/myarouter")
public class MyArouterAc extends AppCompatActivity {
    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_ac_arouter);
    }
}
