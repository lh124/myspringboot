package cn.mldn.myspringboot.rabbitmq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumerListener {
@RabbitListener(queues="mldn.microboot.queue")
	public void receviveMessage(String str) {
		System.err.println("接收消息--"+str);
	}
}
