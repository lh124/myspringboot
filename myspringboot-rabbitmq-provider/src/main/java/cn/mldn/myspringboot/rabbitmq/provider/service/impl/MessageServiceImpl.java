package cn.mldn.myspringboot.rabbitmq.provider.service.impl;

import javax.annotation.Resource;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import cn.mldn.myspringboot.rabbitmq.config.RabbitmqConfig;
import cn.mldn.myspringboot.rabbitmq.provider.service.IMessageService;
@Service
public class MessageServiceImpl implements IMessageService {
	@Resource
	private RabbitTemplate rabbitmq;
	@Override
	public void sendMessage(String str) {
		System.err.println("发送消息----");
		this.rabbitmq.convertAndSend(RabbitmqConfig.EXCHANGE,RabbitmqConfig.ROUTINGKEY,str);
	}

}
