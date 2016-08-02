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
public class TestDoWhileLoop {
    public static void main(String args[]){
        int x = 10;
        do{
            System.out.println("value of x :" + Integer.toString(x));
            x++;
            System.out.print("\n");
        }while(x<20);
}
}
