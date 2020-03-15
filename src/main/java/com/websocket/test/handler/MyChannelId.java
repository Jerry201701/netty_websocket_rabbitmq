package com.websocket.test.handler;

import io.netty.channel.ChannelId;

public class MyChannelId implements ChannelId {
    @Override
    public String asShortText() {
        return null;
    }

    @Override
    public String asLongText() {
        return null;
    }

    @Override
    public int compareTo(ChannelId o) {
        return 0;
    }
}
