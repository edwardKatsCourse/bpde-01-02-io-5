package com.company.single;

import java.io.*;

public class Main {


    public static void main(String[] args) {


        //Serialization/Deserialization
        /**
         * 1. What is serialization/deserialization
         * 2. ObjectInputStream/ObjectOutputStream
         * 3. Marker interfaces (Serializable)
         * 4. transient
         * --> you are here
         * 5. Object serial version UID
         * 6. False cases examples (write with version 1, read with version 2)
         * 7. Nested objects' serialization/deserialization
         * 8. Missing fields serialization/deserialization
         */

        write();

        read();
    }


    private static void write() {
        Owner owner = new Owner("John", "Smith");
        Building building = new Building(
                "Baker St.",
                46,
                5,
                25,
                false,
                true);

//        building.setOwner(owner);

        String buildingInfoFile = "C:\\Dev\\BPDE-01-02. Java IO 5\\baker.st";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(buildingInfoFile))) {
            oos.writeObject(building);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read() {
        String buildingInfoFile = "C:\\Dev\\BPDE-01-02. Java IO 5\\baker.st";

        /**
         * try {
         *     out code
         * } catch (IOException e) {
         *     some error processing
         * }
         *
         *
         * try (out input/output streams) {
         *     out code
         * } catch (IOException e) {
         *     some error processing
         * }
         * // -> auto closing all opened streams, since they were created within try with resources
         *
         */

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(buildingInfoFile))) {

            Building bakerSt = (Building) ois.readObject();
            System.out.println(bakerSt.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }



















}
