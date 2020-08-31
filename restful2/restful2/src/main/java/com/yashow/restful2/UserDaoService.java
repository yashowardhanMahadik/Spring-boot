package com.yashow.restful2;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

@Component
public class UserDaoService implements RestInterFace{

	//@Autowired
	private User u2;
	@Autowired
	private Connectz cz;
	
	@Autowired
	RestInterFace face;
	
	private List<User> users= new ArrayList<>();
	
	
	
	public  int usersCount = 0;
		public void bootit() {
			
		}
		
	



	public List<User> findAll() {
		
		return face.finAllUsers(user);
	}
	
	public User save(User user) throws UnknownHostException
	{
		if(user.getId()==0)
		{
			user.setId(++usersCount);
		}
		else {
			Iterator<User> iterator = users.iterator();
			while(iterator.hasNext())
			{
				User user2 = iterator.next();
				if(user2.getId()==user.getId())
				{
					iterator.remove();
					user2 = new User();
					user2.setId(user.getId());
					user2.setName(user.getName());
					users.add(user2);
					return user2;
				}
			}
		}
		/*else //if(user.getId()<=usersCount)
		{
			System.out.println(user.getId());
			users.remove(user.getId());
			User user2 = new User(user.getId(),user.getName());
			users.add(user2);
			//user.setName(user.getName());
			return user;
		}*/
		users.add(user);
		return user;
	}
	public User findOne(int id)
	{
		for(User user : users)
		{
			if(user.getId()==id)
			{
				return user;
			}
		}
		return null;
	}
	
	
	public User deleteOne(int id) throws UnknownHostException
	{
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext())
		{
			User user = iterator.next();
			if(user.getId()==id)
			{
				iterator.remove();
				user.deleteUser(user);
				u2.deleteUser(user);
				
				
				return user;
			}
		}
		return null;
	}
	
	
	
	
}
