package com.proxyPattern.example1;

/**
 * JDK動態代理
 */
public class Main {

    public static void main(String[] args) {
        PrintHandler printHandler = new PrintHandler();
        Person person = (Person) printHandler.bind(new Man());
        person.print();

        Person person2 = (Person) printHandler.bind(new Woman());
        person2.print();
    }

}