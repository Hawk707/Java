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
class Superclass{
    int age;
    
    Superclass(int age){
        this.age = age;
    }
    
    public void getAge(){
        System.out.println("The value of the variable named age in super class is: "+age);
    }
}

public class Subclass extends Superclass{
    Subclass(int age){
        super(age);
    }
    
    public static void main(String args[])
    {
        Subclass s = new Subclass(24);
        s.getAge();
    }
    
}
