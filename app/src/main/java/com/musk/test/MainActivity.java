package com.musk.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.musk.test.threads.CheckCounter;
import com.musk.test.threads.TestCallable;
import com.musk.test.threads.TestFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBut(View view){
        startActivity(new Intent(this,TranslucentActivity.class));

        /*Toast.makeText(this,"start:"+BuildConfig.serverUrl,Toast.LENGTH_SHORT).show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    testCallable();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();*/
    }

    private void testCallable() throws ExecutionException, InterruptedException {
        //超出线程池容量会怎样?
        //超出线程池执行等待时间会怎样?
        ExecutorService threadpool= Executors.newFixedThreadPool(3);
        for (int i=0;i<3;i++){
            Future<Integer>result=threadpool.submit(new TestCallable("callable "+i,4));
            Log.i("musk","==result=="+result.get());
            //threadpool.submit(new TestFuture("callable "+i,4));
        }
        try {
            Log.i("musk","==isShutdown=="+threadpool.isShutdown());
            threadpool.shutdown();
            //线程池awaitTermination方法判断任务是否执行完
            boolean result=threadpool.awaitTermination(15, TimeUnit.SECONDS);
            Log.i("musk","==result-awaitTermination=="+result);
            //关闭池，等待任务执行完毕后关闭
            Log.i("musk","==isShutdown=="+threadpool.isShutdown());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void testCountDown(){
        CheckCounter checker=new CheckCounter();
        new Thread(checker).start();
        checker.block();
        Log.i("musk","test over");
    }
}
