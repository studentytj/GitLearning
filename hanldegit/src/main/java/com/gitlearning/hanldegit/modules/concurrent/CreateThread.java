package com.gitlearning.hanldegit.modules.concurrent;


import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

public class CreateThread {
    @Test
    public void useThread() throws InterruptedException {
        AThread newThread = new AThread("线程1");
        newThread.start();
    }

    @Test
    public void implementsRunnable() {
        new Thread(()->{
            System.err.println(Thread.currentThread().getName() + " is running.");
        }, "线程2").start();
    }

    @Test
    public void useCallable() throws ExecutionException, InterruptedException {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "use callable test.";
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> future = executorService.submit(callable);
        System.err.println(future.get());

    }

    class AThread extends Thread {
        public AThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.err.println(Thread.currentThread().getName() + " is running.");
        }
    }
}
