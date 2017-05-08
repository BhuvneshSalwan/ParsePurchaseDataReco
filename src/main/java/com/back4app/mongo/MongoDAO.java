package com.back4app.mongo;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDAO {

	public static MongoClient client = null;

	public static MongoDatabase database = null;
	
	public static MongoCollection<Document> collection = null;
	
	public static MongoCollection<Document> getMongoObject() {

		if (null == client) {
			
			client = new MongoClient(new MongoClientURI("mongodb://admin:rIKNgVYCPKxM7K653pFAkjjH@mongodb4.back4app.com:27017/30372c44f4d14b92bd4c8549372db9f9"));
			
			database = client.getDatabase("30372c44f4d14b92bd4c8549372db9f9");
			
			collection = database.getCollection("reconcilation_data");
			
			return collection;
		
		} else {
			
			return collection;
		
		}

	}

}