package com.factoryPattern;

/**
 * 工廠模式
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Person person = PersonFactory.createPerson("com.factoryPattern.Man");
        person.print();

        Person person2 = PersonFactory.createPerson("com.factoryPattern.Woman");
        person2.print();
    }

}