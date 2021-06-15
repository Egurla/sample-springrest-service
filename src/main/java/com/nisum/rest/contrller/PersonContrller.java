package com.nisum.rest.contrller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.rest.bean.Person;
import com.nisum.rest.services.PersonService;

@RestController
public class PersonContrller {
	
@Autowired
PersonService personservice;

@GetMapping("/persons")
public List<Person> getAllPersons() {
	return personservice.getAllperson();
}

@GetMapping("/persons/persondeatils/{id}")
public Person getEmplolyeeDetaiols(@PathVariable int id) {
	return personservice.getEmployedetailes(id);
}
@GetMapping("/addPerson")
public Person addEmployee(@RequestBody Person person) {
	return personservice.addPersons(person);
	
}
@GetMapping("/updatePerson/{id}")
public Person updatePerson(@PathVariable int id,@RequestBody Person person) {
	return personservice.updatePerson(id,person);
}
@GetMapping("/deletePerson/{id}")
public Person deletePerson(@PathVariable int id) {
	return personservice.deletePerson(id);
}
}
