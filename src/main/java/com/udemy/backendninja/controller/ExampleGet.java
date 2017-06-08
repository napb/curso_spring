package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class ExampleGet{
	
	public static final String EXAMPLE_GET = "example2";
	
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name="nm") String name,@RequestParam(name="ap") String ap){
		ModelAndView mv = new ModelAndView(EXAMPLE_GET);
		mv.addObject("nm_in_model",name);
		mv.addObject("ap_in_model",ap);
		return mv;
	}	
	
	@GetMapping("/request2/{nm}")
	public ModelAndView request2(@PathVariable("nm") String name){
		ModelAndView mv = new ModelAndView(EXAMPLE_GET);
		mv.addObject("nm_in_model",name);
		return mv;
	}
}
