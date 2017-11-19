package cn.mldn.myspringboot.thymeleaf.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.mldn.myspringboot.thymeleaf.vo.Member;

@Controller
public class MemberController {
	@RequestMapping("/listmap")
	@ResponseBody
	public Object listMap(Model model) {
		List<Member> list=new ArrayList<>();
		for(int i=0;i<10;i++) {
			Member vo=new Member();
			vo.setMid("hello"+i);
			vo.setAge(15);
			vo.setHiredate(new Date());
			vo.setName("Tom"+i);
			vo.setSal(100.01);
			vo.setDeptno(110L);
			list.add(vo);
		}
		return list;
	}
	
	
	@RequestMapping("/get")
	@ResponseBody
	public Object get(String mid) {
		Member vo = new Member();
		vo.setMid(mid);
		vo.setName("用户姓名 - " + mid);
		vo.setAge(20);
		vo.setHiredate(new Date());
		vo.setDeptno(10L);
		vo.setSal(99.99);
		return vo;
	}
	
}
