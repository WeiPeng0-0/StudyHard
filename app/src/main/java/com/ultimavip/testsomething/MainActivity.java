package com.ultimavip.testsomething;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.haha.logutils.LogUtils;
import com.ultimavip.testsomething.utils.MathUtils;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = findViewById(R.id.textView);
        Button bt = findViewById(R.id.button);
        et1 = findViewById(R.id.editText);
        et2 = findViewById(R.id.editText2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                tv.setText(MathUtils.sum(Integer.parseInt(et1.getText().toString()), Integer.parseInt(et2.getText().toString()))
                        + "");
                Log.e("Main","I'm your fans");
                LogUtils.showLog("ahaa");
            }
        });

    }
}
