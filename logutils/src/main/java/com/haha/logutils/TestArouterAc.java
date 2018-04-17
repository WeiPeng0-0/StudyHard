package com.haha.logutils;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;


/**
 * Created by zhuxing on 2018/4/17.
 */

@Route(path = "/logg/test")
public class TestArouterAc extends AppCompatActivity {

    @Override
    public void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logutils_ac_test_arouter);

        String key = getIntent().getStringExtra("key");
        Toast.makeText(this,key,Toast.LENGTH_LONG).show();
    }
}
