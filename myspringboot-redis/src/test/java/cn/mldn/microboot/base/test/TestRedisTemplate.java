package cn.mldn.microboot.base.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.microboot.StartSpringBootMain;

@RunWith(SpringJUnit4ClassRunner.class) 
@WebAppConfiguration // 现在要使用一个WEB程序启动
@SpringBootTest(classes = StartSpringBootMain.class) // 定义要测试的程序类
public class TestRedisTemplate {
	@Resource(name="redisOne")
	private RedisTemplate<String,String> redisOne ;
	@Resource(name="redisTwo")
	private RedisTemplate<String,String> redisTwo ; 
	@Test
	public void testSet() {
		this.redisOne.opsForValue().set("lh1", "oracle");
		this.redisTwo.opsForValue().set("lh2", "javaweb");
	}
}
