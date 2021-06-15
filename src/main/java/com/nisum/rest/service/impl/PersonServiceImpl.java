package com.nisum.rest.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.nisum.rest.bean.Person;
import com.nisum.rest.services.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	private static Map<Integer,Person> persons=new HashMap<Integer, Person>();
	private static int index;
	static {
		Person person1=new Person(101, "kumar", "chette");
		Person person2=new Person(102, "raju", "asdc");
		Person person3=new Person(103, "nila", "mishra");
		Person person4=new Person(104, "akash", "kacha");
		Person person5=new Person(105, "chandra", "mamidala");
		
		persons.put(person1.getId(), person1);
		persons.put(person2.getId(), person2);
		persons.put(person3.getId(), person3);
		persons.put(person4.getId(), person4);
		persons.put(person5.getId(), person5);
	}
	@Override
	public List<Person> getAllperson() {
		
		return new ArrayList<Person>(persons.values());
	}

	@Override
	public Person getEmployedetailes(int id) {
		return persons.get(id);
	}

	@Override
	public Person addPersons(Person person) {
		index +=1;
		person.setId(index);
		persons.put(index, person);
		return person;
	}

	@Override
	public Person updatePerson(int id, Person person) {
		person.setId(id);
		persons.put(id,person);
		return person;
	}

	@Override
	public Person deletePerson(int id) {
		return persons.remove(id);
	}

	
}
