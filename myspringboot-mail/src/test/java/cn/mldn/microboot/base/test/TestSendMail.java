package cn.mldn.microboot.base.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.microboot.StartSpringBootMain;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration // 现在要使用一个WEB程序启动
@SpringBootTest(classes = StartSpringBootMain.class) // 定义要测试的程序类
public class TestSendMail {
	@Resource
	private JavaMailSender mailSender;

	@Test
	public void testSend() {
		for (int x = 0; x < 20; x++) {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom("1152750238@qq.com"); // 定义自己的邮件地址
			message.setTo("365774673@qq.com"); // 接收者的信息
			message.setSubject("孙子，你等着。一定找到你。");
			message.setText("你不是个好鸟，是个烂鸟，是个道德极其低下的，一定是一个龌龊的男人、油腻男子");
			this.mailSender.send(message);
		}
	}
}
