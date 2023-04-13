package com.wxb.eventbus.center;

import com.google.common.eventbus.EventBus;

public class EventBusCenter {

    private static EventBus eventBus;

    private static EventBus getEventBus(){
        if(eventBus==null){
            synchronized (EventBus.class){
                if(eventBus==null){
                    eventBus = new EventBus();
                }
            }
        }
        return eventBus;
    }
    public static void post(Object event){
        getEventBus().post(event);
    }
    public static void register(Object object){
        getEventBus().register(object);
    }

}
