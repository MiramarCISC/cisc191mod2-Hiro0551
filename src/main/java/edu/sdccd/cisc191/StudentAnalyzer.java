package edu.sdccd.cisc191;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentAnalyzer {
        private StudentAnalyzer(){
            
        }
    public static List<Student> filter(List<Student> students, StudentFilter filter) {

        List<Student> results = new ArrayList<>();

        for (Student student : students) {
            if (filter.test(student)) {
                results.add(student);
            }
        }

        return results;
    }

    public static void sortByGpa(List<Student> students) {
        students.sort(Comparator.comparingDouble(Student::getGpa).reversed());
    }

    public static double averageGpa(List<Student> students) {

        if (students.isEmpty()) {
            return 0.0;
        }

        double total = 0;

        for (Student student : students) {
            total += student.getGpa();
        }

        return total / students.size();
    }
}