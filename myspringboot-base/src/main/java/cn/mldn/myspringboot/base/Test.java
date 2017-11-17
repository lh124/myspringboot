package cn.mldn.myspringboot.base;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
	@Resource
	private MessageSource messageSource;
	@ResponseBody
	@RequestMapping("/www")
	public String hello() {
		return "1111";
	}
	@RequestMapping("/msg/lh")
	@ResponseBody
	public String msg() {
		return this.messageSource.getMessage("welcome.msg",new Object[] {"你好"}, Locale.getDefault());
	}
}
