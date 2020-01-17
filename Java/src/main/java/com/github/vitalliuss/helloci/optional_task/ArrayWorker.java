package com.github.vitalliuss.helloci.optional_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayWorker {

    public static int[] generateArray() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;


        System.out.println("\nEnter size of array");

        try {
            count = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("It's not Integer");
        }

        System.out.println("\nEnter numbers");
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            try {
                array[i] = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("It's not Integer. Enter please correct number");
                i--;
            }
        }
        return array;
    }

    public static ArrayList<ArrayElement> findShortestElementList(int[] array) {
        ArrayElement shortestElement = new ArrayElement(0, 0, 999);
        int minLength = 999;
        ArrayList<ArrayElement> shortestElements = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            String stringValue = String.valueOf(array[i]);
            if (minLength > stringValue.length()) {
                minLength = stringValue.length();
            }
        }

        for (int i = 0; i < array.length; i++) {
            String stringValue = String.valueOf(array[i]);
            if (stringValue.length() == minLength) {
                shortestElements.add(new ArrayElement(array[i], i, stringValue.length()));
            }
        }
        return shortestElements;
    }

}
