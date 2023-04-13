package com.wxb.eventbus.subscriber;

import com.google.common.eventbus.Subscribe;
import com.wxb.eventbus.event.CustomEvent;

public class Subscriber {

    @Subscribe
    public void listen(CustomEvent event){
        System.out.println(System.currentTimeMillis() +"收到事件："+event.getData()+"，线程号为："+Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
