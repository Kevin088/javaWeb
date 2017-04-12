package cn.dfhe.com.dao;

import java.util.List;

import cn.dfhe.com.pojo.User;

public interface UserDao {
	public User findUserById(Integer id);
	
	public List<User> findUserByUserName(String userName);
	
	public void insertUser(User user);
}
