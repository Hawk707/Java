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
public class StringDemo {
    public static void main(String args[]){
        char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
        
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        System.out.println("Stringn Length is : "+ len);
        
        String string1 = "new I was ";
        System.out.println("Dot " + string1 + "Tod");
    }
}
