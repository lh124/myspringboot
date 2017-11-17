package cn.mldn.myspringboot.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.myspringboot.base.SampleController;
import junit.framework.TestCase;
@WebAppConfiguration
@SpringBootTest(classes=SampleController.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMain extends TestCase{
	@Resource
	private SampleController sampleController;
	@Test
	public void  testHome() {
		String str=this.sampleController.home();
		System.out.println("返回结果：--》"+str);
		TestCase.assertEquals(str, "Hello World!");
	}
}
