package com.github.vitalliuss.helloci.main_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyCalendar {

    public static void checkMonth() {

        int number = 0;
        String month = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nPlease, enter the number of the month");

        try {
            number = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            number = -1;
        }

        switch (number) {
            case 1:
                month = Month.January.name();
                break;
            case 2:
                month = Month.February.name();
                break;
            case 3:
                month = Month.March.name();
                break;
            case 4:
                month = Month.April.name();
                break;
            case 5:
                month = Month.May.name();
                break;
            case 6:
                month = Month.June.name();
                break;
            case 7:
                month = Month.July.name();
                break;
            case 8:
                month = Month.August.name();
                break;
            case 9:
                month = Month.September.name();
                break;
            case 10:
                month = Month.October.name();
                break;
            case 11:
                month = Month.January.name();
                break;
            case 12:
                month = Month.January.name();
                break;
            case -1:
                month = "It's not number!";
            default:
                month = "Wrong number!";
        }
        System.out.println(month);
    }
}
