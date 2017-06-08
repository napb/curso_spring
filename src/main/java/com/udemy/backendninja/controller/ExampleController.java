package com.udemy.backendninja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.model.Person;

@Controller
@RequestMapping("/example")
public class ExampleController {

	public static final String EXAMPLE_VIEW = "example";
	
	//Primera Forma
	@GetMapping("/exampleString")
	public String exampleString(Model modelo){
		modelo.addAttribute("people", getPeople());
		return EXAMPLE_VIEW;
	}
	
	//Segunda forma
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV(){
		ModelAndView mv = new ModelAndView(EXAMPLE_VIEW);
		mv.addObject("people", getPeople());
		return mv;
	}
	
	private List<Person> getPeople(){
		List<Person> people = new ArrayList<>();
		people.add(new Person("nicolas andres",24));
		people.add(new Person("jose patricio",25));
		people.add(new Person("patricio nicolas",26));
		people.add(new Person("cesar hernan",27));
		return people;
	}
	
}
