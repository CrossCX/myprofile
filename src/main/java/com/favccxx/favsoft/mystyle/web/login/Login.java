package com.favccxx.favsoft.mystyle.web.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class Login {
	
	@RequestMapping("/login")
	public ModelAndView login(){
		return new ModelAndView("/login/login");
	}

}
