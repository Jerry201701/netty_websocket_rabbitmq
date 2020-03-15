package com.websocket.test.service;

import com.websocket.test.handler.MyChannelHandlerPool;
import com.websocket.test.utils.RedisUtil;
import io.netty.channel.Channel;
import io.netty.channel.ChannelId;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class ChannelRedisService {
    @Resource
    private RedisUtil redisUtil;
    public void addChannelId(String id,String channelId){

        redisUtil.set(id,channelId);

    }

    public void pushWebsocketMsg(String id){
        Channel channel= MyChannelHandlerPool.channelGroup.find(new ChannelId() {
            @Override
            public String asShortText() {
                return null;
            }

            @Override
            public String asLongText() {
                return id;
            }

            @Override
            public int compareTo(ChannelId o) {
                return 0;
            }
        });
        channel.writeAndFlush(new TextWebSocketFrame("afedsgdsg"));



    }



}
