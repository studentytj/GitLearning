package com.gitlearning.hanldegit.modules.concurrent;

import org.apache.tomcat.util.threads.ThreadPoolExecutor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.TimeUnit;

public class RejectHandlerTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 60,
                TimeUnit.MICROSECONDS, new LinkedBlockingQueue<>(1), new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, java.util.concurrent.ThreadPoolExecutor executor) {
                System.err.println("自定义处理");
                System.err.println("---- " + r.toString());
            }
        });
        executor.submit(() -> System.err.println("thread1"));
        executor.submit(() -> System.err.println("thread 2"));
        executor.submit(() -> System.err.println("thread 3"));
        Thread.sleep(1000);
    }
}
