package com.favccxx.favsoft.mystyle.dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;

import com.favccxx.favsoft.mystyle.pojo.BlogCategory;

public class BlogCategoryDao extends BasicDAO<BlogCategory, ObjectId> {

	protected BlogCategoryDao(Datastore ds) {
		super(ds);
	}

}
