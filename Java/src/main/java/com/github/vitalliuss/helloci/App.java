package com.github.vitalliuss.helloci;

public class App {
    public static void main(String[] args) {

        /** MainTask 1 */
        Greeting.toGreet();

        /** MainTask 2 */
        args = new String[]{"1", "2", "3", "4", "5"};
        ArgsClass.revertArgs(args);

        /** MainTask 3 */
        ArgsClass.printNumbers();

        /** MainTask 4 */
        System.out.println("Amount: " + ArgsClass.calculateSum());

        /** MainTask 5 */
        MyCalendar.checkMonth();

    }

    public static void doNothing() {
        // do nothing
    }
}
