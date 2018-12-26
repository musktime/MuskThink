package com.musk.test.threads;

import android.util.Log;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * CountDownLatch多线程并发通信工具类
 */
public class CheckCounter implements Runnable {

    private final CountDownLatch countDownLatch=new CountDownLatch(1);


    public void block(){
        try {
            countDownLatch.await(4000, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("run start");
            Thread.sleep(4000);
            System.out.println("run end");
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[]args){
        CheckCounter checker=new CheckCounter();
        new Thread(checker).start();
//        new Handler(Looper.myLooper()).postDelayed(checker,2000);
        checker.block();
        System.out.println("run exit");
    }
}
