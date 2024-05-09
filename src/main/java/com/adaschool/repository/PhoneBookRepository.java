package com.adaschool.repository;

public interface PhoneBookRepository {
    Boolean contains(String name);
    void insert(String name, String phone);
    String getPhoneNumberByContactName(String name);
}
