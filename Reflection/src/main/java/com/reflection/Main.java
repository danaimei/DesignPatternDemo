package com.reflection;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        //動態載入Class
        Class<?> clazz = Class.forName("com.reflection.Person");

        //Class名
        System.out.println(clazz.getName());

        //所有屬性
        Arrays.stream(clazz.getDeclaredFields()).forEach(field -> System.out.println(field.getType().getName() + ":" + field.getName()));

        //所有方法
        Arrays.stream(clazz.getDeclaredMethods()).forEach(method -> System.out.println(method.getName()));

        //實例化
        Object object = clazz.newInstance();

        //執行無參數方法
        Method method1 = clazz.getDeclaredMethod("hello");
        method1.invoke(object);

        //執行有參數方法
        Method method2 = clazz.getDeclaredMethod("talk", String.class);
        method2.setAccessible(true); //可存取private成員
        method2.invoke(object, "Jack");
    }

}