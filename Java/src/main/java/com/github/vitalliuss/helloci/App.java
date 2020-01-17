package com.github.vitalliuss.helloci;

import com.github.vitalliuss.helloci.optional_task.ArrayElement;
import com.github.vitalliuss.helloci.optional_task.ArrayWorker;

import java.util.ArrayList;

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

        /** OptonalTask 1*/
        int[] array = ArrayWorker.generateArray();
        //  ArrayList<ArrayElement> shortestElements = ArrayWorker.findShortestElementList(array);
        //   ArrayList<ArrayElement> longestElements = ArrayWorker.findLongestElementList(array);
        //   ArrayWorker.printShortestElements(shortestElements);
        //   ArrayWorker.printLongestElements(longestElements);

        /** OptonalTask 2*/
        //  ArrayWorker.sortByLength(array);

        /** OptonalTask 3*/
        double averageLength = ArrayWorker.findAverageLengthOfElementInArray(array);
        ArrayWorker.printMoreLongerElements(array, averageLength);
        ArrayWorker.printMoreShoterElements(array, averageLength);
    }

    public static void doNothing() {
        // do nothing
    }
}
