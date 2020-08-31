package com.yashow.restful2;

import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

@Component
public class Connectz {

	public void controllz() {
	try {
		

		MongoClient mongo = new MongoClient("localhost", 27017);

		
		DB db;
		db= mongo.getDB("testdb");
		DBCollection table ;
		table= db.getCollection("user");
		
		BasicDBObject searchQuery = new BasicDBObject();

		
		DBCursor cursor = table.find(searchQuery);
		//return cursor;
		
		
		



 } catch (UnknownHostException e) {
		e.printStackTrace();
	} catch (MongoException e) {
		e.printStackTrace();
	}
	
	
	}
	
	
}

