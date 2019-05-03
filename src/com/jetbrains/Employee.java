package com.jetbrains;

public class Employee extends Person {


    private int empNum;
    private double salary;
    private int leave;

    // Employee constructor
    public Employee(int id, int age, String name, String surname, int empNum, double salary, int leave) {
        super(id, age, name, surname);

        // Initialize sub_class
        this.empNum = empNum;
        this.salary = salary;
        this.leave = leave;

    }

    // Get employee number
    public int getEmpNum(){
        return empNum;
    }

    // Get employee salary
    public int getLeave(){
        return leave;
    }



//    String empName, jobTitle, empDep;
//    int empNum;
//
//    public Employee (){
//    }
//    // Set employee name
//    public void setName(String emplyee){
//        this.empName = emplyee;
//    }
//    // Get employee name
//    public String getEmpName(){
//        return empName;
//    }
//
//    // Set employee job title
//    public void setJobTile(String title){
//        this.jobTitle = title;
//    }
//    // Get employee job title
//    public String getJobTile(){
//        return jobTitle;
//    }
//
//    // Set employee department
//    public void setDep(String dep){
//        this.empDep = dep;
//    }
//    // Get employee department
//    public String getDep(){
//        return empDep;
//    }
//
//    // Set employee department
//    public void setEmpNum(int number){
//        this.empNum = number;
//    }
//    // Get employee department
//    public int getEmpNum(){
//        return empNum;
//    }

}
