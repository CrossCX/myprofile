package com.favccxx.favsoft.mystyle.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.favccxx.favsoft.mystyle.dao.BlogDao;
import com.favccxx.favsoft.mystyle.pojo.Blog;

@Service
public class BlogService extends MongoBaseService<Blog, ObjectId>{
	
	@Autowired
	private BlogDao blogDao;

	public BlogDao getBlogDao() {
		return blogDao;
	}

	public void setBlogDao(BlogDao blogDao) {
		this.blogDao = blogDao;
	}
	
	public boolean saveBlog(Blog blog){
		boolean flag = false;
		try {
			blogDao.save(blog);
			flag = true;
		} catch (Exception e) {
		}
		return flag;
	}
	
	
	

}
