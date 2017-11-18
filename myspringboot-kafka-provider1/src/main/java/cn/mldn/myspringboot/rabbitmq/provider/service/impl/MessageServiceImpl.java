package cn.mldn.myspringboot.rabbitmq.provider.service.impl;

import javax.annotation.Resource;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import cn.mldn.myspringboot.rabbitmq.provider.service.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService {
	@Resource
private KafkaTemplate<String, String> kafkaTemplate;
	@Override
	public void sendMessage(String str) {
		// TODO Auto-generated method stub
		this.kafkaTemplate.sendDefault("lh-key", str);
	}

	
}
