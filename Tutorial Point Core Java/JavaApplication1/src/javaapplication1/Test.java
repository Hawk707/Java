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
public class Test {
    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is :" + age);
       
    }
    
    public static void main(String args[]){
        Test test = new Test();
        test.pupAge();
    }
}
