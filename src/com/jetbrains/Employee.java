package com.jetbrains;

public class Employee {

    String empName, jobTitle, empDep;
    int empNum;

    public Employee (){
    }
    // Set employee name
    public void setName(String emplyee){
        this.empName = emplyee;
    }
    // Get employee name
    public String getEmpName(){
        return empName;
    }

    // Set employee job title
    public void setJobTile(String title){
        this.jobTitle = title;
    }
    // Get employee job title
    public String getJobTile(){
        return jobTitle;
    }

    // Set employee department
    public void setDep(String dep){
        this.empDep = dep;
    }
    // Get employee department
    public String getDep(){
        return empDep;
    }

    // Set employee department
    public void setEmpNum(int number){
        this.empNum = number;
    }
    // Get employee department
    public int getEmpNum(){
        return empNum;
    }

}
