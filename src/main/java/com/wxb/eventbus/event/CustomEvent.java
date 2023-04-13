package com.wxb.eventbus.event;

public class CustomEvent {
    private int data;

    public CustomEvent(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }
}
