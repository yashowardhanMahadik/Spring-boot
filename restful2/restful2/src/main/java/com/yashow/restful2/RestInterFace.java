package com.yashow.restful2;

import java.util.List;

public interface RestInterFace {
	
	List<User> finAllUsers(User user);
	public void deleteUser(User u);
	public User save(User user);
	public User findOne(int id);
	public User deleteOne(int id);

}
