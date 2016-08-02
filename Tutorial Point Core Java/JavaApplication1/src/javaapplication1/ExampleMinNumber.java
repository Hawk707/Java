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
public class ExampleMinNumber {
    public static void main(String[] args){
        int a = 11;
        int b = 6;
        int c = minFunction(a,b);
        System.out.println("Minimum Value =" + c);
        
    }
    
    /**returns the minimum of two number **/
    public static int minFunction(int n1, int n2){
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        
        return min;
    }
}
