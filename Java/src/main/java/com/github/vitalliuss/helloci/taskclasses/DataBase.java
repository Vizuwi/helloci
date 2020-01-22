package com.github.vitalliuss.helloci.taskclasses;

import java.time.LocalDate;

public class DataBase {
    public Student[] arrayOfStudent = {
            new Student(1, "Ivanov", "Petr", "Ivanovich", LocalDate.of(1988, 10, 4), "Kiev", 8589625, "Civil", 5, 250),
            new Student(2, "Petrov", "Alex", "Aleksandrovich", LocalDate.of(1978, 10, 10), "Minsk", 7589625, "Civil", 1, 210),
            new Student(3, "Sidorov", "Alexksandr", "Olegovich", LocalDate.of(1968, 10, 10), "Moscow", 6589625, "Architecture", 5, 210),
            new Student(4, "Goncharov", "Oleg", "Ivanovich", LocalDate.of(1958, 12, 5), "Minsk", 23489625, "Civil", 2, 210),
            new Student(5, "Potapov", "Slava", "Ivanovich", LocalDate.of(1987, 5, 1), "Kiev", 7449625, "Architecture", 3, 320),
            new Student(6, "Chrapov", "Petr", "Petrovich", LocalDate.of(1989, 11, 10), "Minsk", 3459625, "Civil", 3, 220),
            new Student(7, "Zonin", "Vlad", "Ivanovich", LocalDate.of(1982, 10, 2), "Moscow", 2589625, "Civil", 4, 450),
            new Student(8, "Pleshkun", "Boris", "Petrovich", LocalDate.of(1983, 7, 3), "Moscow", 2589625, "Architecture", 3, 320),
            new Student(9, "Roshen", "Petr", "Ivanovich", LocalDate.of(1988, 8, 10), "Kiev", 2389625, "Civil", 2, 210),
    };

    public Customer[] arrayOfCustomer = {
            new Customer(1, "Ivanov", "Petr", "Olegovich", "Minsk", 1000_0000_0000_000L, 10_00_00),
            new Customer(2, "Roshen", "Boris", "Petrovich", "Kiev", 1111_1111_1111_1111L, 20_00_00),
            new Customer(3, "Zonin", "Petr", "Ivanovich", "Moscow", 2222_0000_0000_0000L, 30_00_00),
            new Customer(4, "Potapov", "Petr", "Petrovich", "Kiev", 3333_3333_3333_3333L, 40_00_00),
            new Customer(5, "Sidorov", "Vlad", "Aleksandrovich", "Moscow", 4444_4444_4444_4444L, 50_00_00),
            new Customer(6, "Fedorov", "Petr", "Aleksandrovich", "Minsk", 5555_5555_5555_5555L, 60_00_00),
            new Customer(7, "Petrov", "Slava", "Olegovich", "Kiev", 6666_6666_6666_6666L, 70_00_00),
            new Customer(8, "Ivanov", "Oleg", "Ivanovich", "Moscow", 7777_7777_7777_7777L, 80_00_00),
            new Customer(9, "Chrapov", "Petr", "Aleksandrovich", "Minsk", 8888_8888_8888_8888L, 90_00_00),
            new Customer(10, "Ivanov", "Alex", "Olegovich", "Moscow", 9999_9999_9999_9999L, 11_00_00),
    };
}
