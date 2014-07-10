package com.favccxx.favsoft.mystyle.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringMVC {
	
	@RequestMapping("/helloSpringMVC")
	public void helloSpringMVC(Model model){
		model.addAttribute("helloSpringMVC", "SpringMVC,你好"); 
	}

}
