package com.udemy.backendninja.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.model.Person;
import com.udemy.backendninja.services.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService{

	private static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class);
	
	@Override
	public List<Person> listPeople() {
		List<Person> people = new ArrayList<>();
		people.add(new Person("nicolas andres",24));
		people.add(new Person("jose patricio",25));
		people.add(new Person("patricio nicolas",26));
		people.add(new Person("cesar hernan",27));
		LOG.info("Arreglo de personas");
		return people;
	}
}
