package com.wxb;

import com.wxb.eventbus.center.EventBusCenter;
import com.wxb.eventbus.event.CustomEvent;
import com.wxb.eventbus.subscriber.Subscriber;

/**
 * （同步）EventBus
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
