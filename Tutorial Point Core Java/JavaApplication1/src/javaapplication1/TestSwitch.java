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
public class TestSwitch {
    public static void main(String args[]){
        char grade = 'C';
        
        switch(grade)
        {
            case 'A':
                System.out.println("Excellent");
                break;
                
            case 'B':
                System.out.println("B");
                break;
             
            case 'C':
                System.out.println("Well done");
                break;
                
            case 'D':
                System.out.println("You Passed");
                break;
                
            case 'F':
                System.out.print("Better try again");
                break;
               
            default:
                System.out.println("Invalid grade");
                
        }
        System.out.println("Your grade is "+grade);
    }
}
