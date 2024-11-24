package org.example;

import java.util.ArrayList;

public class StudentInfo {
    public static void main(String[]args){
        Student st1 = new Student(21, "Roman", 3, 'm', 4.2);
        Student st2 = new Student(26, "Ivan", 2, 'm', 4.6);
        Student st3 = new Student(19, "Nikolay", 1, 'm', 3.2);
        Student st4 = new Student(16, "Anatasia", 1, 'f', 5.0);
        Student st5 = new Student(24, "Zhenya", 6, 'm', 3.8);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);students.add(st2);students.add(st3);students.add(st4);students.add(st5);
    }
    void printStudentOverGrade(ArrayList<Student> al, double grade){
        Student.forEach()

    }
}
