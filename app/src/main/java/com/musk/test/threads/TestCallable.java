package com.musk.test.threads;

import android.util.Log;

import java.util.concurrent.Callable;

public class TestCallable implements Callable<Integer> {

    private String name;
    private int sleepTimes;
    public TestCallable(String name,int sleepTimes){
        this.name=name;
        this.sleepTimes=sleepTimes;
    }

    @Override
    public Integer call() throws Exception {
        for (int i=0;i<sleepTimes;i++){
            Thread.sleep(1000);
            Log.i("musk",name+" ==sleep=="+i);
        }
        Log.i("musk",name+" ==run over==");
        return 0;
    }
}
