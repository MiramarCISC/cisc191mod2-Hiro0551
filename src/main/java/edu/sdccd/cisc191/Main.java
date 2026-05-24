package edu.sdccd.cisc191;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // create students
        List<Student> students = new ArrayList<>();

        students.add(new Student("Jessie",3.8 ,1 ));
        students.add(new Student("Manson", 2.9, 2));
        students.add(new Student("Mike", 3.5, 3));
        students.add(new Student("Jeffery",4.0 , 4));

        // demonstrate filtering
        System.out.println("Students with GPA >= 3.5:");

        List<Student> highGpaStudents =
                StudentAnalyzer.filter(students, student -> student.getGpa() >= 3.5);

        for (Student student : highGpaStudents) {
            System.out.println(student);
        }

        // demonstrate sorting
        System.out.println("\nStudents sorted by GPA:");

        StudentAnalyzer.sortByGpa(students);

        for (Student student : students) {
            System.out.println(student);
        }

        // print average GPA
        double average = StudentAnalyzer.averageGpa(students);

        System.out.println("\nAverage GPA: " + average);
    }
}