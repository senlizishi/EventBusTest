package com.wxb;

import com.wxb.eventbus.center.AsyncEventBusCenter;
import com.wxb.eventbus.event.CustomEvent;
import com.wxb.eventbus.subscriber.AsynSubscriber;

/**
 * （异步）AsyncEventBus
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
