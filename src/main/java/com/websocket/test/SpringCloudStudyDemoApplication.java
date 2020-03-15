package com.websocket.test;

import com.websocket.test.handler.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudStudyDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStudyDemoApplication.class,args);
		try {
            new NettyServer(8004).start();
		}catch(Exception e) {
			System.out.println("NettyServerError:"+e.getMessage());
		}
	}
}