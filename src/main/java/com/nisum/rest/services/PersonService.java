package com.nisum.rest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nisum.rest.bean.Person;
@Service
public interface PersonService {

	List<Person> getAllperson();

	Person getEmployedetailes(int id);

	Person addPersons(Person person);

	Person updatePerson(int id, Person person);

	Person deletePerson(int id);

}
