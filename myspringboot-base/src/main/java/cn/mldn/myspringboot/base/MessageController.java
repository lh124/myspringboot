package cn.mldn.myspringboot.base;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.mldn.myspringboot.service.IMessageService;
@Controller
public class MessageController {
	@Resource
	public IMessageService messageService;

	@RequestMapping("/hello")
	public String forwords(Model model) {
		model.addAttribute("msg",this.messageService.echo());
		return "message/message_show";
	}
}
