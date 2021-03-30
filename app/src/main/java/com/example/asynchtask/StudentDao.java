package com.example.asynchtask;

import java.util.ArrayList;

public class StudentDao {
    private ArrayList<Student> students = new ArrayList<>();
    public StudentDao () {
        Student student;

        student = new Student();
        student.setFirstName("John");
        student.setLastName("Smith");
        student.setMajor("Computer Science");
        students.add(student);
        student = new Student();
        student.setFirstName("Jane");
        student.setLastName("Doe");
        student.setMajor("Biochemistry");
        students.add(student);
        student = new Student();
        student.setFirstName("Norville");
        student.setLastName("Rogers");
        student.setMajor("Swooce Studies");
        students.add(student);
        student = new Student();
        student.setFirstName("Jek");
        student.setLastName("Porkins");
        student.setMajor("Aerospace Navigation");
        students.add(student);
        student = new Student();
        student.setFirstName("Paul");
        student.setLastName("Blart");
        student.setMajor("Segway");
        students.add(student);
    }
    public ArrayList<Student> getAllStudents(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return students;
    }
}
