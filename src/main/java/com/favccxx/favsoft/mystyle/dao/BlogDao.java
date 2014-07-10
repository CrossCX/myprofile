package com.favccxx.favsoft.mystyle.dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;

import com.favccxx.favsoft.mystyle.pojo.Blog;

public class BlogDao extends BasicDAO<Blog, ObjectId> {

	protected BlogDao(Datastore ds) {
		super(ds);
	}

	
}
