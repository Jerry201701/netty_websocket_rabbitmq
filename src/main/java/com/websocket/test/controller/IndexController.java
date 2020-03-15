package com.websocket.test.controller;

import com.websocket.test.entity.MsgVo;
import com.websocket.test.service.ChannelRedisService;
import com.websocket.test.utils.RedisUtil;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

//@Controller
@RestController
public class IndexController {
	@Autowired
	private AmqpTemplate amqpTemplate;
	@Resource
	private RedisUtil redisUtil;
	@Autowired
	private ChannelRedisService channelRedisService;

//	@GetMapping("/index")
//	public ModelAndView  index(){
//		ModelAndView mav=new ModelAndView("socket");
//		mav.addObject("uid", RandomUtil.randomNumbers(6));
//		return mav;
//	}

	@PostMapping(value = "/netty")
	public String notifyPayResult(@RequestBody MsgVo msgVo){

		amqpTemplate.convertAndSend("ws",msgVo);

		return "存入中间件成功";
	}
	@GetMapping(value = "/test")
	public  String testHttp(){
		return "success";
	}


		@GetMapping(value = "/redis")
		public String testRedis(){
		//	redisUtil.set("11","aaa");

			return redisUtil.get("11").toString();
		}


		@GetMapping(value = "/push")
			public String pushWebsocket(String id){
				channelRedisService.pushWebsocketMsg(id);
				return "ok";
		}

}
