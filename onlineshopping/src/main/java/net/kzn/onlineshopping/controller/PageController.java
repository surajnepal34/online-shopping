package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/*
 * Ctrl + Shift + O--> To resolve and import packages
 */
@Controller
public class PageController {
	
	@RequestMapping(value= {"/","home","index"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Spring Web MVC");
		return mv;
		
	}

}
