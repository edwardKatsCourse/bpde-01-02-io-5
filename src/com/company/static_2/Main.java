package com.company.static_2;

public class Main {
    public static void main(String[] args) {
        //Printer.connect(); // -> Lazy, because was called intentionally!!
        Printer.printInfo(); //Eager (нетерпеливый) -> because was called, regardless of who did we call.
        // We did not call .connect() directly
    }
}
