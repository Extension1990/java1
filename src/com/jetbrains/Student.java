package com.jetbrains;

public class Student {
    private String name, course;
    private int studentID;

    // This is the constructor of the class Student
    public Student(String name, String course, int studentID) {

        this.name = name;
        this.course = course;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getStudentID(){
        return studentID;
    }
}
