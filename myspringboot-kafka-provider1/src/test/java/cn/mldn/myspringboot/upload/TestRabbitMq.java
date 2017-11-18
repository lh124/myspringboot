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
@WebAppConfiguration // 现在要使用一个WEB程序启动
@SpringBootTest(classes = SampleControllerMain.class) // 定义要测试的程序类
public class TestRabbitMq {
	static {
		System.setProperty("java.security.auth.login.config",
				"E:/kafka_client_jaas.conf");
	}
	@Resource
	private IMessageService messageService ;
	@Test
	public void send() {
		for (int x = 0 ; x < 100 ; x ++) {
			this.messageService.sendMessage("hello sxl");
		}
	}
}
