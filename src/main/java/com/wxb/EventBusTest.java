package com.wxb;

import com.wxb.eventbus.center.EventBusCenter;
import com.wxb.eventbus.event.CustomEvent;
import com.wxb.eventbus.subscriber.Subscriber;

/**
 * （同步）EventBus (每一个事件的消费方在执行时，都是用的调用方的线程，并且同一时间只能同时执行一个订阅者的方法)
 * 参考文章：https://www.cnblogs.com/crazymakercircle/p/17046275.html
 *
 * @author BIN
 */
public class EventBusTest {

    public static void main(String[] args) {
        Subscriber listener = new Subscriber();
        // 注册订阅者
        EventBusCenter.register(listener);
        // 创建并发送消息
        for (int i = 0; i < 100; i++) {
            CustomEvent customEvent = new CustomEvent(i);
            EventBusCenter.post(customEvent);
        }
    }
}
