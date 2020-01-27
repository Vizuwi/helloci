package com.github.vitalliuss.helloci;

import com.github.vitalliuss.helloci.main_task.ArgsClass;
import com.github.vitalliuss.helloci.main_task.Greeting;
import com.github.vitalliuss.helloci.main_task.TaskCalendar;
import com.github.vitalliuss.helloci.optional_task.ArrayElement;
import com.github.vitalliuss.helloci.optional_task.ArrayWorker;
import com.github.vitalliuss.helloci.taskclasses.Customer;
import com.github.vitalliuss.helloci.taskclasses.DataBase;
import com.github.vitalliuss.helloci.taskclasses.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // MainTask 1
        Greeting.toGreet();

        // MainTask 2
        args = new String[]{"1", "2", "3", "4", "5"};
        ArgsClass.revertArgs(args);

        // MainTask 3
        ArgsClass.printNumbers();

        // MainTask 4
        System.out.println("Amount: " + ArgsClass.calculateSum());

        // MainTask 5
        TaskCalendar.checkMonth();

        // OptonalTask 1
        int[] array = ArrayWorker.generateArray();
        ArrayList<ArrayElement> shortestElements = ArrayWorker.findShortestElementList(array);
        ArrayList<ArrayElement> longestElements = ArrayWorker.findLongestElementList(array);
        ArrayWorker.printShortestElements(shortestElements);
        ArrayWorker.printLongestElements(longestElements);

        // OptonalTask 2
        ArrayWorker.sortByLength(array);

        // OptonalTask 3
        double averageLength = ArrayWorker.findAverageLengthOfElementInArray(array);
        ArrayWorker.printMoreLongerElements(array, averageLength);
        ArrayWorker.printMoreShoterElements(array, averageLength);

        // OptonalTask
        ArrayWorker.findMoreUniqueNumber(array);

        //Java Classes. Main Task
        DataBase dataBase = new DataBase();
        Student[] arrayOfStudent = dataBase.arrayOfStudent;
        Customer[] arrayOfCustomer = dataBase.arrayOfCustomer;

        // MainTask Student
        List<Student> studentsByFaculty = Student.findByFaculty("Architecture", arrayOfStudent);
        List<Student> studentsByBirthday = Student.findByBirthday(LocalDate.of(1985, 01, 01), arrayOfStudent);
        List<Student> studentsByGroop = Student.findByGroop(210, arrayOfStudent);

        Student.printArrayOfStudent(studentsByFaculty);
        Student.printArrayOfStudent(studentsByBirthday);
        Student.printArrayOfStudent(studentsByGroop);

        Student.printAllByFacultyAndCourse(arrayOfStudent);

        // MainTask Customer
        List<Customer> sortedListByLastName = Customer.sortByLastName(arrayOfCustomer);
        List<Customer> listByCard = Customer.findByCard(4000_0000_0000_0000L, 8000_0000_0000_0000L, arrayOfCustomer);

        Customer.printArrayOfCustomer(sortedListByLastName);
        Customer.printArrayOfCustomer(listByCard);


    }


    public static void doNothing() {
        // do nothing
    }
}
