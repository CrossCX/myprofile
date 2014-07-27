package com.favccxx.favsoft.mystyle.web.blog;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.favccxx.favsoft.mystyle.pojo.Blog;
import com.favccxx.favsoft.mystyle.service.BlogService;

@Controller
@RequestMapping("/blog/")
public class BlogController{
	
	@Autowired
	BlogService blogService;

	@RequestMapping("myblog")
	public ModelAndView myBlog(){
		return new ModelAndView("/blog/blog_my");
	}
	
	@RequestMapping("addBlog")
	public ModelAndView addBlog(){
		return new ModelAndView("/blog/blog_add");
	}
	
	@RequestMapping("saveBlog")
	public ModelAndView saveBlog(HttpSession httpSession, HttpServletResponse response, Blog blog){
		blogService.saveBlog(blog);
		return new ModelAndView("/blog/blog_my");
	}

}
