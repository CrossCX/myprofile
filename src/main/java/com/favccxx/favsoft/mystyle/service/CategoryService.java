package com.favccxx.favsoft.mystyle.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import com.favccxx.favsoft.mystyle.dao.CategoryDao;
import com.favccxx.favsoft.mystyle.pojo.BlogCategory;

public class CategoryService extends MongoBaseService<BlogCategory, ObjectId> {
	
//	@Autowired
	private CategoryDao categoryDao;

	public CategoryDao getCategoryDao() {
		return categoryDao;
	}

	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}
	
	
	

}
