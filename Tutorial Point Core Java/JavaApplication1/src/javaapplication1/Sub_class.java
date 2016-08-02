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
class Super_class{
    int num = 20;
    
    //display method of superclass
    public void display(){
        System.out.println("This is the display method of superclass");
    }
}

public class Sub_class extends Super_class {
    int num = 10;
    
    //display mthod of sub class
    public void display(){
        System.out.println("This is the display method of subclass");
    }
        public void my_method(){
            
            //Instanitating subclass
            Sub_class sub = new Sub_class();
            
            //Invoking the display method of sub class
            sub.display();
            
            //Invoking the disply method of superclass
            super.display();
            
            //printing the value of variable num of subclass
            System.out.println("value of the variable named num in sub class:"+ sub.num);
            
            //printing the value of variable num of superclass
            System.out.println("value of the variable named num in super class:"+ super.num);
            
        }
        
        public static void main(String args[]){
            Sub_class obj = new Sub_class();
            obj.my_method();
        }
    }

