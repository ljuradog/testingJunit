package com.adaschool.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import com.adaschool.repository.PhoneBookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PhoneBookServiceTest {

    PhoneBookRepository phoneBookRepository;

    PhoneBookService service;

    @BeforeEach
    void init() {
        phoneBookRepository = Mockito.mock(PhoneBookRepository.class);
        service = new PhoneBookService(phoneBookRepository);
    }

    @Test
    void whenPhoneDoesNotFound() {
        when(phoneBookRepository.contains("name")).thenReturn(false);

        String result = service.search("name");
        assertNull(result);
    }
}