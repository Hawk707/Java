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
public class Puppy {
    int puppyAge;
    public Puppy(String name){
        // This constructor has one parameter, name.
        System.out.println("Passed Nmae is :" + name);
    }
    
    public void setAge( int age ){
        puppyAge = age;
    }
    
    public int getAge(){
        System.out.println("Puppy's age is :" + puppyAge);
        return puppyAge;
    }
    
    public static void main(String []args){
        //Following statement would create an object myPuppy
         /* Object creation */
        Puppy myPuppy = new Puppy("tommy");
        
         /* Call class method to set puppy's age */
         myPuppy.setAge( 2 );
         
         /* Call another class method to get puppy's age */
         myPuppy.getAge();
         
         
         /* You can access instance variable as follows as well */
         System.out.println("Variable Value :" + myPuppy.puppyAge);
    }
}
