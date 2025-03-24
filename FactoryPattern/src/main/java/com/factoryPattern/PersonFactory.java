package com.factoryPattern;

public class PersonFactory {

    public static Person createPerson(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return (Person) clazz.newInstance();
    }

}
