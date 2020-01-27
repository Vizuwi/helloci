package com.github.vitalliuss.helloci.taskcollections.optionaltask;


import java.util.ArrayList;

public class MainReader {

    public static void main(String[] args) {

        String path = "src/main/java/com/github/vitalliuss/helloci/taskcollections/optionaltask/text.txt";

        ArrayList<String> poemByLines = PoemEditor.readPoetryFromFile(path);
        PoemEditor.writePoetryToFile(path, poemByLines);
        PoemEditor.sortByLineLength(poemByLines);
    }
}
