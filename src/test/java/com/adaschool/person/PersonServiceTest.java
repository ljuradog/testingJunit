package com.adaschool.person;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonServiceTest {

    PersonService service;

    @BeforeEach
    public void setUp() {
        service = new PersonService();
    }

    @Test
    public void whenIdDoesNotExistThenPersonIsNull() {
        Person result = service.findById("1");
        assertNull(result);
    }

    @Test
    public void whenIdIsNullThenPersonIsNull() {
        Person result = service.findById(null);
        assertNull(result);
    }

    @Test
    public void afterAddPersonThenPersonExistsInMap() {
        Person person = Person.builder()
                .id("1")
                .name("Pepito Perez")
                .build();

        service.add(person);
        Person result = service.findById("1");
        assertNotNull(result);
        assertEquals("Pepito Perez", result.getName());
    }
}