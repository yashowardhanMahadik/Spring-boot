package com.yashow.restful2;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;

import com.mongodb.BasicDBObject;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
//import com.mongodb.client.model.IndexOptions;

public class User {

	//private static final Map "unique" = null;
	private Integer id;
	private String name;
	
	
//	
//	@Autowired
//	private Connectz cz;
//	private int getUsersCount() {
//		
//		return 0;
//	}
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
//	
//	public User(Integer id, String name) throws UnknownHostException {
//		super();
//		this.id = id;
//		this.name = name;
//		try {
//			MongoClient mongo = new MongoClient("localhost", 27017);
//
//			
//			DB db;
//			db= mongo.getDB("testdb");
//			DBCollection table ;
//			//db.table.createIndex();
//			table= db.getCollection("testdb3");
//			
//
//			
//			BasicDBObject document = new BasicDBObject();
//			//db.t.createIndex(new BasicDBObject("product_src",1));
//			//IndexOptions indexOptions = new IndexOptions().unique(true);
//			//collection.createIndex(Indexes.ascending("name", "stars"), indexOptions);
//			//IndexOptions indexOptions = new IndexOptions().unique(true);
//			
//			
//			//table.createIndex(new BasicDBObject("id",1));
//			//table.createIndex({ "id": 1 }, { unique: true });
//			BasicDBObject searchQuery = new BasicDBObject();
//			//searchQuery.put("name", "mkyong");
//			searchQuery.put("id", id);
//			DBCursor cursor = table.find(searchQuery);
//
//			
//			
//			if(cursor.hasNext())
//			{
//			BasicDBObject query = new BasicDBObject();
//			//query.put("name", "mkyong");
//			query.put("id", id);
//
//			BasicDBObject newDocument = new BasicDBObject();
//			newDocument.put("id",id);
//			newDocument.put("name", name);
//
//			BasicDBObject updateObj = new BasicDBObject();
//			updateObj.put("$set", newDocument);
//
//			table.update(query, updateObj);
//			}
//			else
//			{
//			document.put("id", id);
//			document.put("name", name);
//			
//			table.insert(document);
//			}
//			
//			
//			
//		} catch (MongoException e) {
//			e.printStackTrace();
//		}
//
//	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
