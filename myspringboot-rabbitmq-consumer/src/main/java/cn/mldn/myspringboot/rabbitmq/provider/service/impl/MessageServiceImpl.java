package cn.mldn.myspringboot.rabbitmq.provider.service.impl;

import javax.annotation.Resource;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import cn.mldn.myspringboot.rabbitmq.provider.service.IMessageService;
@Service
public class MessageServiceImpl implements IMessageService {
	@Resource
	private RabbitTemplate rabbitmq;
	@Override
	public void sendMessage(String str) {
		this.rabbitmq.convertAndSend(str);
	}

}
