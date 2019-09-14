package com.example.concurency;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Running in " + threadName);
        try {
            Thread.sleep(5000);
            return threadName;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
