package com.favccxx.favsoft.mystyle.web.blog;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.favccxx.favsoft.mystyle.pojo.BlogCategory;
import com.favccxx.favsoft.mystyle.service.BlogCategoryService;
import com.favccxx.favsoft.mystyle.service.BlogService;

@Controller
@RequestMapping("/blogCategory/")
public class BlogCategoryController {
	
	@Autowired
	BlogCategoryService blogCategoryService;

	@RequestMapping("myblogCategory")
	public ModelAndView myBlog(HttpSession session, String userId){
		return new ModelAndView("/blog/blog_category");
	}
	
	@RequestMapping("saveBlogCategory")
	public ModelAndView saveBlogCategory(HttpSession httpSession, HttpServletResponse response, BlogCategory blogCategory){
		blogCategoryService.save(blogCategory);
		return new ModelAndView("/blog/blog_category");
	}
}
