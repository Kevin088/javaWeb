package cn.dfhe.com.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.dfhe.com.dao.UserDao;
import cn.dfhe.com.dao.UserDaoImpl;
import cn.dfhe.com.pojo.User;

public class MyTest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception{
		String configLocation="classpath:ApplicationContext.xml";
		applicationContext=new ClassPathXmlApplicationContext(configLocation);
	}
	@Test
	public void testFindUserById() throws Exception{
		
		UserDao userDao=(UserDao) applicationContext.getBean("userDao");
		User user=userDao.findUserById(11);
		System.out.println(user);
	}
	@Test
	public void testInsertUser() throws Exception{
		UserDao userDao=(UserDao) applicationContext.getBean("userDao");
		User user=new User();
		user.setUsername("悻悻");
		user.setSex("女");
		user.setBirthday(new Date());
		userDao.insertUser(user);
		System.out.println(user.getId());
	}
}
