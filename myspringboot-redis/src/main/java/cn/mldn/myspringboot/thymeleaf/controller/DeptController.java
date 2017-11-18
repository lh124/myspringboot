package cn.mldn.myspringboot.thymeleaf.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.mldn.myspringboot.thymeleaf.service.IDeptService;

@Controller
public class DeptController {
	@Resource
	private IDeptService deptService;
	@RequestMapping("dept_list")
	public String list(Model model) {
		model.addAttribute("alldept", this.deptService.list());
		return "message/pages/back/admin/dept_list";
	}

}
