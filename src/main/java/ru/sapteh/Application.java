package ru.sapteh;

import ru.sapteh.dao.StudentDao;
import ru.sapteh.dao.impl.StudentDaoImpl;
import ru.sapteh.model.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Application {
    public static void main(String[] args) {
//        StudentDao studentDao = new StudentDaoImpl();
//
//        Student student = new Student(5, "Petr", "Petrov", LocalDate.of(2005, 3, 2));
//
//        studentDao.save(student);
//
//        studentDao.findAll().forEach(System.out::println);

    }

    private static LocalDate parseDate(String date) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("d-MM-yyyy"));
    }
}
