package com.singletonPattern.example2;

/**
 * 單例模式
 * 用static field實現
 */
public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            Person person = Person.getInstance();
            System.out.println(person);
        });

        Thread thread2 = new Thread(() -> {
            Person person = Person.getInstance();
            System.out.println(person);
        });

        thread.start();
        thread2.start();
    }

}