package cn.mldn.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import cn.mldn.myspringboot.base.SampleController;
@SpringBootApplication
@ImportResource(locations= {"classpath:spring/spring-*.xml"}) 
public class SampleControllerMain {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleControllerMain.class, args);
	}
}
