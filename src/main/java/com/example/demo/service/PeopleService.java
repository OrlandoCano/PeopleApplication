package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Person;

public interface PeopleService {
	Person savePerson(Person person);
	Person loadPerson(String id);
	List<Person> loadPeople();
	void deletePerson(String id);
}
