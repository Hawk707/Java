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

class Animal1{
    public void move(){
        System.out.println("Animals can move");
    }
}

class Dog extends Animal1{
    public void move(){
        System.out.println("Dogs can walk and run");
    }
}
public class TestDog {
    public static void main(String args[]){
        Animal1 a = new Animal1(); //Animal reference and object
        Animal1 b = new Dog(); //Animal reference but dog object
        
        a.move(); //runs the method in Animal class
        b.move(); //Runs the method in Dog class
    }
}
