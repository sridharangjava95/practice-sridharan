package com.hsbc.springboot.practice4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public ModelAndView gethomepage() {
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
}
