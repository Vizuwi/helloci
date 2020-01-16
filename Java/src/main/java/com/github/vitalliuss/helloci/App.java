package com.github.vitalliuss.helloci;

public class App {
    public static void main(String[] args) {
        Greeting.toGreet();
        MyCalendar.checkMonth();
        ArgsClass.printNumbers();

        args = new String[]{"1", "2", "3", "4", "5"};
        ArgsClass.revertArgs(args);
    }

    public static void doNothing() {
        // do nothing
    }
}
