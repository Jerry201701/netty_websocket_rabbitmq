package com.websocket.test.service;

import com.websocket.test.entity.MsgVo;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "ws")
public class TestRabbitmqService {

    @RabbitHandler
    public void receiveMessage(MsgVo msgVo) {

        System.out.println("id:"+msgVo.getId());
    }



}
