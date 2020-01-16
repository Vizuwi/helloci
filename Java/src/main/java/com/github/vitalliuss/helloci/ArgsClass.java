package com.github.vitalliuss.helloci;

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
        System.out.println("\n\nCommand line args revert:");
        for (int i = args.length - 1; i >= 0; i--)
            System.out.println("args[" + i + "] : " + args[i]);
    }


}
