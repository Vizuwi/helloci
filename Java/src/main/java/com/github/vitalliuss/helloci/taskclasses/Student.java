package com.github.vitalliuss.helloci.taskclasses;

import java.time.LocalDate;
import java.util.*;


public class Student {
    private int id;
    private String lastName;
    private String name;
    private String dadName;
    private LocalDate birthday;
    private String address;
    private int phoneNumber;
    private String faculty;
    private int course;
    private int groop;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDadName() {
        return dadName;
    }

    public void setDadName(String dadName) {
        this.dadName = dadName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroop() {
        return groop;
    }

    public void setGroop(int groop) {
        this.groop = groop;
    }

    public Student(int id, String lastName, String name, String dadName, LocalDate birthday, String address, int phoneNumber, String faculty, int course, int groop) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.dadName = dadName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.groop = groop;


    }

    public Student(int id, String lastName, String name) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", dadName='" + dadName + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", groop='" + groop + '\'' +
                '}';
    }

    public static void printArrayOfStudent(Student[] arrayOfStudent) {
        for (Student student : arrayOfStudent
        ) {
            System.out.println(student);
        }
    }

    public static void printArrayOfStudent(List<Student> arrayOfStudent) {
        for (Student student : arrayOfStudent
        ) {
            System.out.println(student);
        }
    }

    public static List<Student> findByFaculty(String faculty, Student[] arrayOfStudent) {
        List<Student> studentsByFaculty = new ArrayList<>();
        for (Student student : arrayOfStudent) {
            if (student.faculty.equals(faculty)) {
                studentsByFaculty.add(student);
            }
        }
        return studentsByFaculty;
    }

    public static List<Student> findByCourse(int course, Student[] arrayOfStudent) {
        List<Student> studentsByCourse = new ArrayList<>();
        for (Student student : arrayOfStudent) {
            if (student.course == course) {
                studentsByCourse.add(student);
            }
        }
        return studentsByCourse;
    }

    public static List<Student> findByBirthday(LocalDate birthday, Student[] arrayOfStudent) {
        List<Student> studentsByBirthday = new ArrayList<>();
        for (Student student : arrayOfStudent) {
            if (student.birthday.isAfter(birthday)) {
                studentsByBirthday.add(student);
            }
        }
        return studentsByBirthday;
    }

    public static List<Student> findByGroop(int groop, Student[] arrayOfStudent) {
        List<Student> studentsByGroop = new ArrayList<>();
        for (Student student : arrayOfStudent) {
            if (student.groop == groop) {
                studentsByGroop.add(student);
            }
        }
        return studentsByGroop;
    }

    public static void printAllByFacultyAndCourse(Student[] arrayOfStudent) {
        HashSet<String> listOfFaculty = new HashSet<>();
        for (Student student : arrayOfStudent) {
            listOfFaculty.add(student.faculty);
        }

        HashSet<Integer> listOfCourse = new HashSet<>();
        for (Student student : arrayOfStudent) {
            listOfCourse.add(student.course);
        }
        List<Integer> sortedListOfCourses = new ArrayList<>(listOfCourse);
        Collections.sort(sortedListOfCourses);

        System.out.println("List of students by Faculty");
        for (String faculty : listOfFaculty) {
            System.out.println("Faculty: " + faculty);
            for (int course : sortedListOfCourses) {
                System.out.println("Course: " + course);
                for (Student student : arrayOfStudent) {
                    if (student.faculty.equals(faculty) && student.course == course) System.out.println(student);
                }
            }
        }
    }
}