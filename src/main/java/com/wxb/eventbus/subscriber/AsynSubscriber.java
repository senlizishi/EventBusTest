package com.wxb.eventbus.subscriber;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import com.wxb.eventbus.event.CustomEvent;

public class AsynSubscriber {

    @AllowConcurrentEvents
    @Subscribe
    public void listen(CustomEvent event){
        System.out.println(System.currentTimeMillis() +"收到事件："+event.getData()+"，线程号为："+Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
