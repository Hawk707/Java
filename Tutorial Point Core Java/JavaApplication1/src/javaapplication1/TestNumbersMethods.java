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
public class TestNumbersMethods {
    public static void main(String args[]){
        Integer x = 5;
        Integer y = 10;
        Integer z = 5;
        Short a = 5;
        
        System.out.println("xxxxxValue method");
        //Returns byte primitve data type
        System.out.println( x.byteValue() );
        
        //REturn double primitive data type
        System.out.println(x.doubleValue());
        
        //Returns long primitive data type
        System.out.println( x.longValue() );
        
        System.out.println("compareTo method");
        System.out.println( x.compareTo(3));
        System.out.println( x.compareTo(5));
        System.out.println( x.compareTo(8));
        
        System.out.println("equals method");
        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        System.out.println(x.equals(a));
        
    }
}
