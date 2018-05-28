package com.company.inheritance;

import com.company.single.Building;
import com.company.single.Owner;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        write();
        read();
    }

    private static void write() {

        Parent serializable = new Child("parent field", "child field" );

        String filename = "C:\\Dev\\BPDE-01-02. Java IO 5\\inheritance.st";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(serializable);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read() {
        String filename = "C:\\Dev\\BPDE-01-02. Java IO 5\\inheritance.st";


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {

            Parent object = (Parent) ois.readObject();
            System.out.println(object.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
