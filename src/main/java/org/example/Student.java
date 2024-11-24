package org.example;

public class Student {
    protected int age;
    protected String name;
    protected int course;
    protected char sex;
    double avgGrade;
    public Student( int age, String name, int course, char sex, double avgGrade){
        this.age = age;
        this.name = name;
        this.course = course;
        this.sex = sex;
        this.avgGrade = avgGrade;
    }
    @Override
    public String toString(){
        return "Student{" +
                "age" + age +
                "name" + name +
                "course" + course +
                "sex" + sex +
                "avgGrade" +avgGrade;
    }
}
