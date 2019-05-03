package com.jetbrains;
import com.sun.codemodel.internal.JOp;

import java.util.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name, course, empName, jobTitle, empDep, surname;
        int studentID, empNum, age, id;

        // Student details
        name = JOptionPane.showInputDialog(null, "Enter student name: ");
        course = JOptionPane.showInputDialog(null, "Enter student course of study: ");
        studentID = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter student number: "));

//        Student studentDetails = new Student(int id, int age, String name, String surname, int stuNum, int stipend, int recess);
//        JOptionPane.showMessageDialog(null, studentDetails.getName()+ " of student number "+studentDetails.getStudentID()+ " is studying "+studentDetails.getCourse()+ ".", "Student Details", JOptionPane.INFORMATION_MESSAGE);

        // Employee details
        empName = JOptionPane.showInputDialog(null, "Enter employee name: ");
        jobTitle = JOptionPane.showInputDialog(null, "Enter employee job title: ");
        empDep = JOptionPane.showInputDialog(null, "Enter employee department: ");
        empNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter employee number: "));



/*
        employeeDetails.setName(empName);
        employeeDetails.setJobTile(jobTitle);
        employeeDetails.setDep(empDep);
        employeeDetails.setEmpNum(empNum);
        JOptionPane.showMessageDialog(null, employeeDetails.getEmpName()+ " with title "+employeeDetails.getJobTile()+ " works in "+employeeDetails.getDep()+ " and has number "+employeeDetails.getEmpNum(), "Student Details", JOptionPane.INFORMATION_MESSAGE);
*/
    }
}
