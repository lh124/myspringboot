package org.myspringboot.thymeleaf;

import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.myspringboot.thymeleaf.SampleControllerMain;
import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes=SampleControllerMain.class)
public class TestDemo extends TestCase {
	@Resource
	private DataSource   datasource;
	@Test
	public void getConnection() throws SQLException {
		System.err.println(this.datasource.getConnection());

	}
}
