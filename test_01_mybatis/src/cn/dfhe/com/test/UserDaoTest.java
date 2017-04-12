package cn.dfhe.com.test;

import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.dfhe.com.dao.UserDao;
import cn.dfhe.com.dao.UserDaoImpl;
import cn.dfhe.com.pojo.User;

public class UserDaoTest {
	private SqlSessionFactory factory;
	@Before
	public void setUp() throws Exception{
		String resource="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		factory=new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void testFindUserById() throws Exception{
		UserDao userDao=new UserDaoImpl(factory);
		User user=userDao.findUserById(11);
		System.out.println(user);
	}
	@Test
	public void testInsertUser() throws Exception{
		UserDao userDao=new UserDaoImpl(factory);
		User user=new User();
		user.setUsername("悻悻");
		user.setSex("女");
		user.setBirthday(new Date());
		userDao.insertUser(user);
		System.out.println(user.getId());
	}
	
}
