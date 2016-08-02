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
public class Employee_TP_Variable_Types {
    //this instance variable is visible for any child class.
    public String name;
    
    //salary varaible is visible in Employee class only.
    private double salary;
    
    //The name variable is assigned in the constructor.
    public Employee_TP_Variable_Types(String empName){
        name = empName;
    }
    
    //The salary variable is assigned a value.
    public void setSalary(double empSal){
        salary = empSal;
    }
    
    //This method prints the employees details.
    public void printEmp(){
        System.out.println("name : " + name);
        System.out.println("salary : " + salary);
    }
    
    //salary variable is a private static variable (class var)
    private static double salary1;
    
    //DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development";
    
    
    public static void main(String args[]){
        Employee_TP_Variable_Types empOne = new Employee_TP_Variable_Types("Ransika");
        empOne.setSalary(1000);
        empOne.printEmp();
        //class vars:
        salary1 = 1000;
        System.out.println(DEPARTMENT + "average salary:" + salary1);
    }
}
