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
class Animal{
    
}

class Mammal extends Animal{
    
}

class Reptile extends Animal{
    
}

public class Dogg extends Mammal{
    public static void main(String args[]){
        Animal a = new Animal();
        Mammal m = new Mammal();
        Dogg d   = new Dogg();
        
        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
    }
    
}
