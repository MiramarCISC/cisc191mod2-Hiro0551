package edu.sdccd.cisc191;

public class Student {

    private double id;
    private String name;
    private double gpa;

    public Student(String name,double gpa , double id) {

        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }

        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }

        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public double getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + '\'' + ", gpa=" + gpa + '}';
    }
}