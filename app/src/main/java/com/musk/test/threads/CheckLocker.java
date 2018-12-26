package com.musk.test.threads;

import android.util.Log;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CheckLocker implements Runnable {

    private Lock lock=new ReentrantLock();
    @Override
    public void run() {
        try{
            lock.lock();
            for (int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+"----"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[]args){
        Runnable run=new CheckLocker();
        new Thread(run,"run--1").start();
        new Thread(run,"run--2").start();
    }
}
