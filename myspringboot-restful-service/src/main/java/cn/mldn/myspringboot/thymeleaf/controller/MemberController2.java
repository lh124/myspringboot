package cn.mldn.myspringboot.thymeleaf.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.mldn.myspringboot.thymeleaf.vo.Member;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Controller
public class MemberController2 {
	@RequestMapping(value="/listmap",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取全部信息",notes="不需要传递参数")
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
	
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取指定用户的信息",notes="只需要传递mid就可以获取Member的完整内容")
	@ApiImplicitParam(name="mid",value="用户编号",required=true,dataType="String")
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
