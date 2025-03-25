package com.singletonPattern.example2;

public class Person {

    private static final Person person = new Person();

    private Person() {
    }

    public static Person getInstance() {
        return person;
    }

}
