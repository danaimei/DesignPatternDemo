package com.proxyPattern.example2;

/**
 * CGLib動態代理
 */
public class Main {

    public static void main(String[] args) {
        PrintInterceptor printInterceptor = new PrintInterceptor(new Man());
        ((Man) printInterceptor.getProxy()).print();

        PrintInterceptor printInterceptor2 = new PrintInterceptor(new Woman());
        ((Woman) printInterceptor2.getProxy()).print();
    }

}