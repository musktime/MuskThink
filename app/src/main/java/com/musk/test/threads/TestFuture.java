package com.musk.test.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TestFuture implements Future<String>{

    private String name;
    private int sleepTimes;
    public TestFuture(String name,int sleepTimes){
        this.name=name;
        this.sleepTimes=sleepTimes;
    }
    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return false;
    }

    @Override
    public String get() throws ExecutionException, InterruptedException {
        return null;
    }

    @Override
    public String get(long timeout,TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        return "run over";
    }
}
