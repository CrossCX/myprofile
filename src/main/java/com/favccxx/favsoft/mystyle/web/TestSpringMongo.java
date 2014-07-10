package com.favccxx.favsoft.mystyle.web;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class TestSpringMongo {
	
	public static void main(String[] args){
		try {
			MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
			DB db = mongoClient.getDB( "myTestDB" );
			DBCollection coll = db.getCollection("myTestConn");
			BasicDBObject doc = new BasicDBObject("name", "MongoDB")
		        .append("type", "database")
		        .append("count", 1)
		        .append("info", new BasicDBObject("x", 203).append("y", 102));
			coll.insert(doc);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
