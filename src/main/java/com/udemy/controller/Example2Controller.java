package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class Example2Controller {

	private static final String EXAMPLE2_VIEW = "example2";
	
	@RequestMapping("/request1")
	public ModelAndView request1(@RequestParam(name="nm", required = false, defaultValue = "NULL") String name) {
		ModelAndView mav = new ModelAndView(EXAMPLE2_VIEW);
		mav.addObject("mn_in_model", name);
		return mav;
	}
	
	@RequestMapping("/request2/{nm}")
	public ModelAndView request2(@PathVariable("nm")String name) {
		ModelAndView mav = new ModelAndView(EXAMPLE2_VIEW);
		mav.addObject("mn_in_model", name);
		return mav;
	}
	
}
