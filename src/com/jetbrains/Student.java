package com.jetbrains;

public class Student extends Person {

    int stuNum;
    int stipend;
    int recess;

    // Student constructor
    public Student(int id, int age, String name, String surname, int stuNum, int stipend, int recess) {
        super(id, age, name, surname);

        // Initialize sub_class variables
        this.stuNum = stuNum;
        this.stipend = stipend;
        this.recess = recess;
    }

    // Get student number
    public int getStuNum(){
        return stuNum;
    }

    // Get stipent
    public int getStipend(){
        return stipend;
    }

    // Get recess
    public int getRecess(){
        return recess;
    }

//    private String name, course;
//    private int studentID;
//
//    // This is the constructor of the class Student
//    public Student(String name, String course, int studentID) {
//
//        this.name = name;
//        this.course = course;
//        this.studentID = studentID;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getCourse() {
//        return course;
//    }
//
//    public int getStudentID(){
//        return studentID;
//    }
}
