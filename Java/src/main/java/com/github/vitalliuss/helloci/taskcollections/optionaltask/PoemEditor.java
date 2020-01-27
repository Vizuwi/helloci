package com.github.vitalliuss.helloci.taskcollections.optionaltask;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PoemEditor {

    public static ArrayList<String> readPoetryFromFile(String path) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void writePoetryToFile(String path, ArrayList<String> list) {

        try {
            FileWriter out = new FileWriter(path);
            try {
                for (int i = list.size() - 1; i >= 0; i--) {
                    out.write(list.get(i) + "\n");
                }
            } finally {
                out.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void sortByLineLength(ArrayList<String> list) {
        list.sort((o1, o2) -> o2.length()-o1.length());
    }
}
