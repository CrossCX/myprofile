package com.favccxx.favsoft.mystyle.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.favccxx.favsoft.mystyle.dao.BlogCategoryDao;
import com.favccxx.favsoft.mystyle.pojo.BlogCategory;

@Service
public class BlogCategoryService extends MongoBaseService<BlogCategory, ObjectId> {
	
	@Autowired
	private BlogCategoryDao blogCategoryDao;
	
	public BlogCategoryDao getBlogCategoryDao() {
		return blogCategoryDao;
	}

	public void setBlogCategoryDao(BlogCategoryDao blogCategoryDao) {
		this.blogCategoryDao = blogCategoryDao;
	}


	public boolean saveBlogCategory(BlogCategory blogCategory){
		boolean flag = false;
		try {
			blogCategoryDao.save(blogCategory);
			flag = true;
		} catch (Exception e) {
		}
		return flag;
	}

}
