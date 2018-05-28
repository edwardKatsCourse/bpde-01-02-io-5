package com.company.sstatic.demo;


public class Person {
    private static Person object = getResult();

    private int o;

    public static void getInfo() {}

    public static Person getResult() {
        System.out.println("getResult");
        return new Person();
    }

    public Person() {

        try {
            Thread.sleep(20000);
        } catch (Exception e) {

        }

        System.out.println("constructor - 2 phase");
    }

    static {
        System.out.println("static block - 1 phase");
    }

}
