package cn.mldn.myspringboot.upload;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.myspringboot.rabbitmq.SampleControllerMain;
import cn.mldn.myspringboot.rabbitmq.provider.service.IMessageService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes= SampleControllerMain.class)
public class TestRabbitMq {
	@Resource
	private IMessageService messageService;
	@Test
	public void Send() {
		this.messageService.sendMessage("hello lh");
	}
}
