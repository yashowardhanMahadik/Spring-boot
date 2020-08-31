package com.yashow.restful2;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class RestRepositoryImpl implements RestInterFace{

	
	int a=0;
	
	private List<User> users= new ArrayList<>();
	@Override
	public List<User> finAllUsers(User user) {
		MongoClient mongo;
		try {
			mongo = new MongoClient("localhost", 27017);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		DB db;
		db= mongo.getDB("testdb");
		DBCollection table ;
		table= db.getCollection("testdb3");
		BasicDBObject searchQuery = new BasicDBObject();
		
			for(int i=0;i<a;i++)
			{
				//searchQuery.get("id", i);
				searchQuery.getInt("id", i);
				//searchQuery.get("name", i);
				//users.add();
			}
			return users;
	}
	public User deleteOne(int id) throws UnknownHostException
	{
		public void deleteUser(User u) throws UnknownHostException {
			MongoClient mongo = new MongoClient("localhost", 27017);

			
			DB db;
			db= mongo.getDB("testdb");
			DBCollection table ;
			table= db.getCollection("testdb3");
			BasicDBObject searchQuery = new BasicDBObject();
			searchQuery.put("id", u.getId());
			 
			table.remove(searchQuery);
		}
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
					user2 = new User(user.getId(),user.getName());
					users.add(user2);
					return user2;
				}
			}
		}
	}
	@Override
	public void deleteUser(User u) {
		// TODO Auto-generated method stub
		
	}
}
