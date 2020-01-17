package com.github.vitalliuss.helloci.main_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ArgsClass {

    public static void printNumbers() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        System.out.println("\nEnter any number");

        try {
            count = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("It's not Integer");
        }

        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = new Random().nextInt();
        }

        System.out.println("In column:");
        for (int x : array
        ) {
            System.out.println(x);
        }

        System.out.println("In line:");
        for (int x : array
        ) {
            System.out.print(x + " ");
        }
    }

    public static void revertArgs(String[] args) {
        System.out.println("\nCommand line args revert:");
        for (int i = args.length - 1; i >= 0; i--)
            System.out.println("args[" + i + "] : " + args[i]);
    }

    public static int calculateSum() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int sum = 0;

        System.out.println("\n\nEnter count of number for summation");

        try {
            count = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("It's not Integer");
        }

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

        for (int x : array
        ) {
            sum += x;
        }

        return sum;
    }

}
