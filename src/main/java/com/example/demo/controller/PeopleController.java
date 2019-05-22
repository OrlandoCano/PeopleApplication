package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PeopleService;

@RestController
@RequestMapping("/demo/api/people")
@CrossOrigin("http://localhost:3000")
public class PeopleController {
	@Autowired
	private PeopleService service;
	
	@PostMapping
	public Person savePerson(@RequestBody Person person) {
		return service.savePerson(person);
	}

	@GetMapping("/{id}")
	public Person loadPerson(@PathVariable String id) {
		return service.loadPerson(id);
	}
	@GetMapping
	public List<Person> loadPeople() {
		return service.loadPeople();
	}
	@DeleteMapping("/{id}")
	public void deletePerson(@PathVariable String id) {
		service.deletePerson(id);
	}
	
}
