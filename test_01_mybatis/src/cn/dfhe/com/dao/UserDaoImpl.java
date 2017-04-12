package cn.dfhe.com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.dfhe.com.mapper.UserMapper;
import cn.dfhe.com.pojo.User;

public class UserDaoImpl implements UserDao {
	private SqlSessionFactory sqlSessionFactory;
	//通过构造方法注入
	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	@Override
	public User findUserById(Integer id) {
		//sqlSesion是线程不安全的,所以它的最佳使用范围在方法体内

		SqlSession sqlSession=null;
		User user=null;
		try{
			sqlSession= sqlSessionFactory.openSession();
			/**
			 * 调用查询接口的两种方式
			 */
//			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
//			User user=userMapper.findUserById(id);
			user=sqlSession.selectOne("cn.dfhe.com.mapper.UserMapper.findUserById", id);	
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(sqlSession!=null)
				sqlSession.close();
		}
		return user;
	}

	@Override
	public List<User> findUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int insertUser(User user) {
		SqlSession sqlSession=null;
		int id=0;
		try{
			sqlSession= sqlSessionFactory.openSession();
			id=sqlSession.insert("cn.dfhe.com.mapper.UserMapper.insertUser", user);
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(sqlSession!=null)
				sqlSession.close();
		}
		return id;
	}
	
}
