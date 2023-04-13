package com.wxb;

import com.wxb.eventbus.center.AsyncEventBusCenter;
import com.wxb.eventbus.event.CustomEvent;
import com.wxb.eventbus.subscriber.AsynSubscriber;

/**
 * （异步）AsyncEventBus (事件发送方异步发出事件，不会等待事件消费方是否收到，直接执行自己后面的代码，消费端从线程池中获取线程异步处理事件)
 *
 * @author BIN
 */
public class AsyncEventBusTest {

    public static void main(String[] args) {
        AsynSubscriber listener = new AsynSubscriber();
        // 注册订阅者
        AsyncEventBusCenter.register(listener);
        // 创建并发送消息
        for (int i = 0; i < 1000; i++) {
            CustomEvent customEvent = new CustomEvent(i);
            AsyncEventBusCenter.post(customEvent);
        }
    }
}
