package com.wxb.eventbus.center;

import com.google.common.eventbus.AsyncEventBus;

import java.util.concurrent.*;

public class AsyncEventBusCenter {

    private static AsyncEventBus asyncEventBus;

    private static ThreadPoolExecutor executor = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors() * 5, Runtime.getRuntime().availableProcessors() * 10, 60L, TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(1024));

    private static AsyncEventBus getAsynEventBus() {
        if (asyncEventBus == null) {
            synchronized (AsyncEventBus.class) {
                if (asyncEventBus == null) {
                    asyncEventBus = new AsyncEventBus(executor);
                }
            }
        }
        return asyncEventBus;
    }

    public static void post(Object event) {
        getAsynEventBus().post(event);
    }

    public static void register(Object object) {
        getAsynEventBus().register(object);
    }
}

