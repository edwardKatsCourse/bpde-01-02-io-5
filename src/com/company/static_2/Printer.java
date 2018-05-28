package com.company.static_2;

public class Printer {

    private static Printer printer = createConnection();

    private static Printer createConnection() {
        return new Printer();
    }

    public static void connect() {
        if (printer == null) {
            printer = createConnection();
        }
    }

    public Printer() {

        try {
            System.out.println("Connecting....");
            Thread.sleep(10_000);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection lost. Printer is finally dead!!");
        }

        System.out.println("Successfully connected!");
    }

    public static void printInfo() {
        System.out.println("This printer was supposed to go on retirement 5 years ago");
    }

    public static void getPrinterLocation() {
        System.out.println("Printer was detected in room #4");
    }
}
