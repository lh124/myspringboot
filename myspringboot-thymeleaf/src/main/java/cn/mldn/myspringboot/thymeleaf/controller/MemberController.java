package cn.mldn.myspringboot.thymeleaf.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.mldn.myspringboot.thymeleaf.vo.Member;

@Controller
public class MemberController {

	@RequestMapping("show")
	public String show(Model model) {
		Member vo=new Member();
		vo.setMid("hello");
		vo.setAge(15);
		vo.setHiredate(new Date());
		vo.setName("Tom");
		vo.setSal(100.01);
		vo.setDeptno(110L);
		model.addAttribute("member", vo);
		return "message/pages/back/admin/member_show";
//		return "message/message_show";
	}
	
	@RequestMapping("list")
	public String list(Model model) {
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
		model.addAttribute("alllist", list);
		return "message/pages/back/admin/member_list";
	}
	
	
	@RequestMapping("listmap")
	public String listMap(Model model) {
		Map<String,Member> list=new HashMap<>();
		for(int i=0;i<10;i++) {
			Member vo=new Member();
			vo.setMid("hello"+i);
			vo.setAge(15);
			vo.setHiredate(new Date());
			vo.setName("Tom"+i);
			vo.setSal(100.01);
			vo.setDeptno(110L);
			list.put("vo-"+i, vo);
		}
		model.addAttribute("allmap", list);
		return "message/pages/back/admin/member_list";
	}
	@RequestMapping("map")
	public String showMap(Model model) {
			Member vo=new Member();
			vo.setMid("hello");
			vo.setAge(15);
			vo.setHiredate(new Date());
			vo.setName("Tom");
			vo.setSal(100.01);
			vo.setDeptno(110L);
			Map<Long,String> map=new HashMap<>();
			map.put(10L, "财务部");
			map.put(20L, "销售部");
			map.put(30L, "技术部");
			model.addAttribute("allmap", map);
			model.addAttribute("member", vo);
		return "message/pages/back/admin/member_show";
	}
}
