package com.github.vitalliuss.helloci.optional_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

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

    public static ArrayList<ArrayElement> findLongestElementList(int[] array) {
        ArrayElement longestElement = new ArrayElement(0, 0, 999);
        int maxLength = 0;
        ArrayList<ArrayElement> longestElements = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            String stringValue = String.valueOf(array[i]);
            if (maxLength < stringValue.length()) {
                maxLength = stringValue.length();
            }
        }

        for (int i = 0; i < array.length; i++) {
            String stringValue = String.valueOf(array[i]);
            if (stringValue.length() == maxLength) {
                longestElements.add(new ArrayElement(array[i], i, stringValue.length()));
            }
        }
        return longestElements;
    }

    public static void printShortestElements(ArrayList<ArrayElement> list) {
        System.out.println("Number of the shortest element in array: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + " element:" +
                    " Index=" + list.get(i).getIndex() +
                    " Value=" + list.get(i).getValue() +
                    " Length=" + list.get(i).getLength()
            );
        }
    }

    public static void printLongestElements(ArrayList<ArrayElement> list) {
        System.out.println("Number of the longest element in array: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + " element:" +
                    " Index=" + list.get(i).getIndex() +
                    " Value=" + list.get(i).getValue() +
                    " Length=" + list.get(i).getLength()
            );
        }
    }

    public static void sortByLength(int[] array) {
        boolean flag = true;
        do {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                String element = String.valueOf(array[i]);
                String nextElement = String.valueOf(array[i + 1]);
                if (element.length() > nextElement.length()) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    flag = true;
                }
            }
        } while (flag);

        System.out.println(Arrays.toString(array));

    }

    public static double findAverageLengthOfElementInArray(int[] array) {
        int averageLength = 0;
        for (int i = 0; i < array.length; i++) {
            String stringValue = String.valueOf(array[i]);
            averageLength += stringValue.length();
        }
        return averageLength / (double) array.length;
    }

    public static void printMoreLongerElements(int[] array, double averageLength) {
        System.out.println("\nAverage length = " + averageLength);
        System.out.println("More longer elements:");
        for (int i = 0; i < array.length; i++) {
            String stringValue = String.valueOf(array[i]);
            if ((double) stringValue.length() > averageLength) {
                System.out.println("Value=" + array[i] + " length= " + stringValue.length());
            }
        }
    }

    public static void printMoreShoterElements(int[] array, double averageLength) {
        System.out.println("\nAverage length = " + averageLength);
        System.out.println("More shorter elements:");
        for (int i = 0; i < array.length; i++) {
            String stringValue = String.valueOf(array[i]);
            if ((double) stringValue.length() < averageLength) {
                System.out.println("Value=" + array[i] + " length= " + stringValue.length());
            }
        }
    }

    public static int calculateDifferntNumbers(int number) {
        String stringValue = String.valueOf(number);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < stringValue.length(); j++) {
                if (Character.getNumericValue(stringValue.charAt(j)) == i) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void findMoreUniqueNumber(int[] array) {
        int minCountOfDifferentNumbers = 999;
        for (int i = 0; i < array.length; i++) {
            int countOfDifferentNumbers = calculateDifferntNumbers(array[i]);
            if (countOfDifferentNumbers < minCountOfDifferentNumbers) {
                minCountOfDifferentNumbers = countOfDifferentNumbers;
            }
        }

        for (int i = 0; i < array.length; i++) {
            int countOfDifferentNumbers = calculateDifferntNumbers(array[i]);
            if (countOfDifferentNumbers == minCountOfDifferentNumbers) {
                System.out.println("Number with Min different numbers: " + array[i]);
                break;
            }
        }
    }
}

