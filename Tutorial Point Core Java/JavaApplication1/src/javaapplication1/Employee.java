/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author haytham
 */
import java.io.*;
public class Employee {
    
    String name;
    int age;
    String designation;
    double salary;
    
    //This is the constructor fo the class Employee
    public Employee(String name){
        this.name = name;
    }
    
    //Assign the age of the Employee to the variable age.
    public void empAge( int empAge){
        age = empAge;
    }
    
    /*Assign the designation to the variable designation*/
    public void empDesignation( String empDesig ){
        designation = empDesig;
    }
    
    /*Assign the salary to the variable salary .*/
    public void empSalary (int empSalary ){
        salary = empSalary;
    }
    
    /*print the employee details*/
    public void printEmployee(){
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
