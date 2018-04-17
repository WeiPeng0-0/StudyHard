package com.ultimavip.testsomething;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.ultimavip.testsomething.testdragger.DaggerMainActivityComponent;
import com.ultimavip.testsomething.testdragger.MainResultBean;
import com.ultimavip.testsomething.testrxjava.ITestRxJava;

import javax.inject.Inject;

import retrofit2.Retrofit;


public class MainActivity extends AppCompatActivity implements ITestRxJava {

    private EditText et1;
    private EditText et2;
    String haha = "";

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

                //                IGetRequest iGetRequest = HttpUtils.getHttpClient().create(IGetRequest.class);
                //                Call<ResultBean> call = iGetRequest.getCall("1","1","3.6.0","1");
                //                call.enqueue(new Callback<ResultBean>() {
                //                    @Override
                //                    public void onResponse (Call<ResultBean> call, Response<ResultBean> response) {
                //                        Log.e("responsetoString",  response.toString());
                //                        Log.e("responsecode",  response.code()+"");
                //                        Log.e("responsebody",  response.body().toString());
                //                        Log.e("call",  call.isExecuted()+"--"+call.isCanceled()+"--");
                //                    }
                //
                //                    @Override
                //                    public void onFailure (Call<ResultBean> call, Throwable t) {
                //
                //                    }
                //                });


                testObservable();

                testRxjavaRetrofit();
                testDragger();
                testARouter();

            }
        });

    }

    @Override
    public void testObservable () {

        //                Observer<String> observer = new Observer<String>() {
        //
        //                    @Override
        //                    public void onCompleted () {
        //
        //                        Log.e("haha", "onCompleted");
        //                    }
        //
        //                    @Override
        //                    public void onError (Throwable e) {
        //                        Log.e("haha", "onError");
        //
        //                    }
        //
        //                    @Override
        //                    public void onNext (String s) {
        //                        Log.e("haha", "onNext");
        //
        //                    }
        //                };
        //                observer.onNext("hahaha");

        //        Subscriber<String> subscriber = new Subscriber<String>() {
        //            @Override
        //            public void onStart () {
        //                super.onStart();
        //                Log.e("haha", "onStart");
        //            }
        //
        //            @Override
        //            public void onCompleted () {
        //
        //                Log.e("haha", "onCompleted");
        //            }
        //
        //            @Override
        //            public void onError (Throwable e) {
        //                Log.e("haha", "onError");
        //
        //            }
        //
        //            @Override
        //            public void onNext (String s) {
        //                Log.e("haha", "onNext--"+s);
        //
        //            }
        //        };
        //
        ////        Observable<String> stringObservable = Observable.create(new Observable.OnSubscribe<String>() {
        ////            @Override
        ////            public void call (Subscriber<? super String> subscriber) {
        ////                subscriber.onNext("1");
        ////                subscriber.onNext("2");
        ////                subscriber.onNext("3");
        ////                subscriber.onCompleted();
        ////
        ////            }
        ////        });
        ////        stringObservable.subscribe(subscriber);
        //        Observable.just("1","2","3").subscribe(subscriber);
        //        Integer[] ints={1,2,3,};
        //        Observable.from(ints).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<String>() {
        //            @Override
        //            public void call (String s) {
        //                Log.e("haha", "call--"+s);
        //            }
        //        });
        //        Integer[] ints={1,2,3,4};


        //        List<Student> integers = new ArrayList<>();
        //        integers.add(new Student(Arrays.asList("语文", "英语"),"1"));
        //        integers.add(new Student(Arrays.asList("物理", "化学"),"2"));
        //        integers.add(new Student(Arrays.asList("政治", "历史"),"3"));
        //        Observable.from(integers).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).flatMap(new Func1<Student,
        // Observable<String>>() {
        //            @Override
        //            public Observable<String> call (Student student) {
        //                return Observable.from(student.getLessons());
        //            }
        //        }).subscribe(new Action1<String>() {
        //            @Override
        //            public void call (String s) {
        //                Log.e("haha", "call--"+s);
        //            }
        //        });
        //        List<Student> integers = new ArrayList<>();
        //        integers.add(new Student(Arrays.asList("语文", "英语"),"1"));
        //        integers.add(new Student(Arrays.asList("物理", "化学"),"2"));
        //        integers.add(new Student(Arrays.asList("政治", "历史"),"3"));
        //        Observable.from(integers).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).flatMap(new Func1<Student,
        // Observable<String>>() {
        //            @Override
        //            public Observable<String> call (Student student) {
        //                return Observable.from(student.getLessons());
        //            }
        //        }).subscribe(new Action1<String>() {
        //            @Override
        //            public void call (String s) {
        //                Log.e("haha", "call--"+s);
        //            }
        //        });

    }

    @Override
    public void testRxjavaRetrofit () {
//        IGetRequestRxjava iGetRequest = HttpUtils.getHttpClient().create(IGetRequestRxjava.class);
//        Observable<ResultBean> call1 = iGetRequest.getCall("1", "1", "3.6.0", "1");
//        call1.subscribeOn(Schedulers.io()).doOnNext(new Consumer<ResultBean>() {
//            @Override
//            public void accept (ResultBean resultBean) throws Exception {
//                        Log.e("haha","Thread"+Thread.currentThread().toString()+ "--onNext--"+resultBean.toString());
//            }
//        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<ResultBean>() {
//            @Override
//            public void onSubscribe (Disposable d) {
//                Log.e("haha","Thread"+Thread.currentThread().toString()+ "--onSubscribe--");
//
//            }
//
//            @Override
//            public void onNext (ResultBean resultBean) {
//                Log.e("haha","Thread"+Thread.currentThread().toString()+ "--onResult--"+resultBean.toString());
//
//            }
//
//            @Override
//            public void onError (Throwable e) {
//                Log.e("haha","Thread"+Thread.currentThread().toString()+ "--onError--"+e.toString());
//
//            }
//
//            @Override
//            public void onComplete () {
//                Log.e("haha","Thread"+Thread.currentThread().toString()+ "--onComplete--");
//
//            }
//        });
    }

    @Inject
    MainResultBean mainResultBean;
    @Inject
    Retrofit mRetrofit;


    @Override
    public void testDragger () {
//        DaggerMainActivityComponent.create().inject(this);
        DaggerMainActivityComponent.create().inject(this);
        Log.e("haha",mainResultBean==null?"null":mainResultBean.toString()+"--");
        Log.e("hahamRetrofit",mRetrofit==null?"null":mRetrofit.toString()+"--");
    }

    @Override
    public void testARouter () {
        ARouter.getInstance().build("/main/myarouter").navigation();
        ARouter.getInstance().build("/logg/test").withString("key", "yess").navigation();
        //                .withString("key", "yess")
    }

}
