package com.singletonPattern.example1;

/**
 * 單例模式
 * 用volatile + synchronized實現
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