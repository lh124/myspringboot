package cn.mldn.myspringboot.upload;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.myspringboot.rabbitmq.SampleControllerMain;

@RunWith(SpringJUnit4ClassRunner.class) 
@WebAppConfiguration // 现在要使用一个WEB程序启动
@SpringBootTest(classes = SampleControllerMain.class) // 定义要测试的程序类
public class SampleControllerTest {
	static {
		System.setProperty("java.security.auth.login.config",
				"e:/kafka_client_jaas.conf");
	}
	@Test
	public void test() throws Exception {
		Thread.sleep(Long.MAX_VALUE);
	}
}

