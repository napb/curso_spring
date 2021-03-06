package com.udemy.backendninja.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.udemy.backendninja.model.Person;

@Controller
@RequestMapping("/example3")
public class ExamplePost {

	public static final String vista = "form";
	public static final String result = "result";
	
	/*
	@GetMapping("/")
	public String redirect(){
		return "redirect:/example3/mostrar";
	}
	*/
	
	@GetMapping("/")
	public RedirectView redirect(){
		return new RedirectView("/example3/mostrar");
	}
	
	@GetMapping("/mostrar")
	public String mostrar(Model model){
		model.addAttribute("person",new Person());
		return vista;
		
	}
	
	@PostMapping("/addperson")
	public ModelAndView addperson(@Valid @ModelAttribute("person") Person person, BindingResult br){

		ModelAndView mv = new ModelAndView();
		if(br.hasErrors()){
			mv.setViewName(vista);
		}else{
			mv.setViewName(result);
			mv.addObject("person",person);
		}
		return mv;
	}
	
}
