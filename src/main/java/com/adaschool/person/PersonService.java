package com.adaschool.person;

import java.util.HashMap;

public class PersonService {

    private HashMap<String, Person> personMap = new HashMap<String, Person>();

    public Person findById(String id) {
        return personMap.get(id);
    }

    public void add(Person person) {
        personMap.put(person.getId(), person);
    }
}
