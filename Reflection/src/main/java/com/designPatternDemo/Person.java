package com.designPatternDemo;

public class Person {

    private String name;

    public void hello() {
        System.out.println("Nice to meet you.");
    }

    private void talk(String name) {
        System.out.println("My name is " + name + ".");
    }

}
