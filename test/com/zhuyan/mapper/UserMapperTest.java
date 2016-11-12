package com.zhuyan.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhuyan.pojo.User;

public class UserMapperTest {

	private ApplicationContext ctx;

	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	}

	@Test
	public void testFindUserById() {
		UserMapper mapper = (UserMapper) ctx.getBean("userMapper");
		User user = mapper.findUserById(1);
		System.out.println(user);
	}

}
