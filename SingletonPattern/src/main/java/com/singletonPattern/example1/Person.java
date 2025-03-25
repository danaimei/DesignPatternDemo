package com.singletonPattern.example1;

public class Person {

    private static volatile Person person;

    private Person() {
    }

    public static Person getInstance() {
        if (person == null) { //非同步：避免多個執行緒阻塞
            synchronized (Person.class) { //同步：避免多個執行緒同時進入此區塊
                if (person == null) {
                    person = new Person();
                }
            }
        }
        return person;
    }

}
