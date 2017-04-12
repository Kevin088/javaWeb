package cn.dfhe.com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.dfhe.com.mapper.UserMapper;
import cn.dfhe.com.pojo.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(Integer id) {
		/**
		 * sqlSession 归spring管理 不需要close
		 */	
		SqlSession sqlSession=this.getSqlSession();
		User user=sqlSession.selectOne("cn.dfhe.com.mapper.UserMapper.findUserById", id);	
		return user;
	}

	@Override
	public List<User> findUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void insertUser(User user) {
		SqlSession sqlSession=this.getSqlSession();
		sqlSession.insert("cn.dfhe.com.mapper.UserMapper.insertUser", user);
	}
	
}
