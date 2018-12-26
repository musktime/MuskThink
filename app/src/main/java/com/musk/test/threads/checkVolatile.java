package com.musk.test.threads;

public class checkVolatile {

    private static volatile int index=0;
    private transient int flag=0;

    public static void main(String[]args){
        for(int index=0; index<100000; index++){
            System.out.println(index);
        }
    }
}
