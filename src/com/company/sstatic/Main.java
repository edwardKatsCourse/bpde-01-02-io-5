package com.company.sstatic;

import com.company.sstatic.demo.Person;

public class Main {

    //Eager - when you call any static method and your singleton creates simultaneously
    //Lazy - when you intend to create the class, by calling .connect() -> .createSingletonObject()

    public static void main(String[] args) {

        Person.getInfo();
    }
}
