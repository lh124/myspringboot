package cn.mldn.myspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.mldn.myspringboot.service.impl.MessageServiceImpl;

//@Configuration
public class ServiceConfig {
//	@Bean
	public MessageServiceImpl getMessageServiceInstance() {
		return new MessageServiceImpl();
	}
}
