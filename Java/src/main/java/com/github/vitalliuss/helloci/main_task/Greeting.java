package com.github.vitalliuss.helloci.main_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeting {

    public static void toGreet() {

        System.out.println("Hi, what is your name?");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = "";

        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Welcome " + name + "!");

    }
}
