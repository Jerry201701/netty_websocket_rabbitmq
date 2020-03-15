package com.websocket.test.service;

import com.websocket.test.entity.MsgVo;
import com.websocket.test.utils.RedisUtil;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@RabbitListener(queues = "ws")
public class nettyWebsocketService {
    @Resource
    private RedisUtil redisUtil;
    @RabbitHandler
    public void pushMessage(MsgVo msgVo) {
        String ws=msgVo.toString();
      //  String id=redisUtil.get(msgVo.getId().toString()).toString();

      //  WebSocketCacheMap.getByToken("1").writeAndFlush(new TextWebSocketFrame(ws));
     //   WebSocketCacheMap.getByToken("2").writeAndFlush(new TextWebSocketFrame(ws));
     //   WebSocketCacheMap.getByToken(msgVo.getId().toString()).writeAndFlush(new TextWebSocketFrame(ws));
     //   channel.writeAndFlush(new TextWebSocketFrame(ws));
       // MyChannelHandlerPool.channelGroup.find()
        //群发到所有的连接
        //  MyChannelHandlerPool.channelGroup.writeAndFlush(new TextWebSocketFrame(ws));
        System.out.println(ws);

    }




}
