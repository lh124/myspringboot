package org.myspringboot.thymeleaf;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import cn.mldn.myspringboot.thymeleaf.SampleControllerMain;
import cn.mldn.myspringboot.thymeleaf.vo.Member;

@RunWith(SpringJUnit4ClassRunner.class) 
@WebAppConfiguration // 现在要使用一个WEB程序启动
@SpringBootTest(classes = SampleControllerMain.class) // 定义要测试的程序类
public class TestDemo {
	public static final String MEMBER_GET_URL = "http://localhost/get?mid=" ;
	public static final String MEMBER_LIST_URL = "http://localhost/listmap" ;
	@Resource
	private RestTemplate restTemplate ; 
	@Test
	public void testList() {
		List<Member> allMembers = this.restTemplate.getForObject(MEMBER_LIST_URL, List.class) ;
		System.err.println(allMembers);
	}
	@Test
	public void testGet() {
		Member obj = this.restTemplate.getForObject(MEMBER_GET_URL + "mldnjava", Member.class) ;
		System.err.println(obj);
	}
}
