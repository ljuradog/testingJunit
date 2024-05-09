package com.adaschool.person;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Person {

    private final String id;

    private final String name;
}
