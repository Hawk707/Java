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
public class MammalInt implements Animal2 {
    
    public void eat(){
        System.out.println("Mammal eats");
    }
    
    public void travel(){
        System.out.println("Mammal travels");
    }
    
    public int noOfLegs(){
        return 0;
    }
    
    public static void main(String args[]){
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}
