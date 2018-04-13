package com.ultimavip.testsomething;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ultimavip.testsomething.testretrofit.HttpUtils;
import com.ultimavip.testsomething.testretrofit.IGetRequest;
import com.ultimavip.testsomething.testretrofit.ResultBean;
import com.ultimavip.testsomething.utils.MathUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    String haha="";

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
//                tv.setText((MathUtils.sum(Integer.parseInt(et1.getText().toString()), Integer.parseInt(et2.getText().toString()))
//                )+haha);
//                Log.e("Main","I'm your fans");
//                LogUtils.showLog("ahaa");

                IGetRequest iGetRequest = HttpUtils.getHttpClient().create(IGetRequest.class);
                Call<ResultBean> call = iGetRequest.getCall("1","1","3.6.0","1");
                call.enqueue(new Callback<ResultBean>() {
                    @Override
                    public void onResponse (Call<ResultBean> call, Response<ResultBean> response) {
                        Log.e("responsetoString",  response.toString());
                        Log.e("responsecode",  response.code()+"");
                        Log.e("responsebody",  response.body().toString());
                        Log.e("call",  call.isExecuted()+"--"+call.isCanceled()+"--");
                    }

                    @Override
                    public void onFailure (Call<ResultBean> call, Throwable t) {

                    }
                });

                


                
            }
        });

    }
}
