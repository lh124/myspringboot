package cn.mldn.myspringboot.base;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@EnableAutoConfiguration
public class SampleController {
	/*@Resource
	public IMessageService messageService;*/
	@RequestMapping("/home")
	@ResponseBody
	public 	String home() {
		return "Hello World!";
	}
	@RequestMapping("/home/ww")
	@ResponseBody
	public String list() {
		return "3333";
	}
	/*@RequestMapping("/message")
	@ResponseBody
	public String echos() {
		return messageService.echo();
	}*/
}
