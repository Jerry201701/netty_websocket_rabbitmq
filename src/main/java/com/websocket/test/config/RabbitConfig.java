package com.websocket.test.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 路径：com.example.demo.rabbitmq.config
 * 类名：
 * 功能：队列配置
 * 备注：
 * 创建人：typ
 * 创建时间：2018/9/23 21:46
 * 修改人：
 * 修改备注：
 * 修改时间：
 */
@Configuration
public class RabbitConfig {


    @Bean
    public Queue nettyQueue() {
        return new Queue("ws");
    }


}
