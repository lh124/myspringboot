package cn.mldn.microboot.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MySchedule {
//	@Resource
//	private JavaMailSender mailSender;
	@Scheduled(fixedRate=1000) // 每秒执行一次
	public void runJobA() {
//		SimpleMailMessage message = new SimpleMailMessage();
//		message.setFrom("1152750238@qq.com"); // 定义自己的邮件地址
//		message.setTo("365774673@qq.com"); // 接收者的信息
//		message.setSubject("孙子，你等着。一定找到你。");
//		message.setText("你不是个好鸟，是个烂鸟，是个道德极其低下的，一定是一个龌龊的男人、油腻男子");
//		this.mailSender.send(message);
		System.err.println("******* 【间隔发送，每秒一发！】");
	}
	@Scheduled(cron="* * * * * ?")
	public void runJobB() {
//		SimpleMailMessage message = new SimpleMailMessage();
//		message.setFrom("1152750238@qq.com"); // 定义自己的邮件地址
//		message.setTo("365774673@qq.com"); // 接收者的信息
//		message.setSubject("孙子，你等着。一定找到你。");
//		message.setText("你不是个好鸟，是个烂鸟，是个道德极其低下的，一定是一个龌龊的男人、油腻男子");
//		this.mailSender.send(message);
		System.err.println("******* 【CRON发送，每秒一发！】");
	}
}
