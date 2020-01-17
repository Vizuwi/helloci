package com.github.vitalliuss.helloci;

import com.github.vitalliuss.helloci.optional_task.ArrayElement;
import com.github.vitalliuss.helloci.optional_task.ArrayWorker;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        /** MainTask 1 */
        //   Greeting.toGreet();

        /** MainTask 2 */
        //   args = new String[]{"1", "2", "3", "4", "5"};
        //   ArgsClass.revertArgs(args);

        /** MainTask 3 */
        //   ArgsClass.printNumbers();

        /** MainTask 4 */
        //   System.out.println("Amount: " + ArgsClass.calculateSum());

        /** MainTask 5 */
        //   MyCalendar.checkMonth();

        /** OptonalTask */
        int[] array = ArrayWorker.generateArray();
        ArrayList<ArrayElement> shortestElements = ArrayWorker.findShortestElementList(array);
        System.out.println("Number of shortest element in array: " + shortestElements.size());
        for (int i = 0; i < shortestElements.size(); i++) {
            System.out.println((i + 1) + " element:" +
                    " Index=" + shortestElements.get(i).getIndex() +
                    " Value=" + shortestElements.get(i).getValue() +
                    " Length=" + shortestElements.get(i).getLength()
            );
        }

    }

    public static void doNothing() {
        // do nothing
    }
}
