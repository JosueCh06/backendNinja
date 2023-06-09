package com.udemy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.udemy.model.Person;
import com.udemy.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService{

	private static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class);
	
	@Override
	public List<Person> getListPeople() {
			List<Person> people = new ArrayList<>();
			people.add(new Person("Jhon", 23));
			people.add(new Person("Rebeca", 70));
			people.add(new Person("Josue", 75));
			people.add(new Person("Luis", 20));
			people.add(new Person("Julian", 30));
			LOG.info("HELLO FROM SERVICE");
			return people;
	}

}
