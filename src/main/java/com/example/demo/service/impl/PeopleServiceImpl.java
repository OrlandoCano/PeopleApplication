package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PeopleRepository;
import com.example.demo.model.Person;
import com.example.demo.service.PeopleService;

@Service
public class PeopleServiceImpl implements PeopleService{

	@Autowired
	private PeopleRepository repository;
	
	@Override
	public Person savePerson(Person person) {
		return repository.save(person);
	}

	@Override
	public Person loadPerson(String id) {
		return repository.findOne(id);
	}

	@Override
	public List<Person> loadPeople() {
		return repository.findAll();
	}

	@Override
	public void deletePerson(String id) {
		repository.delete(id);
	}

}
