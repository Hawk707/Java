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
public class TestArray {
    public static void main(String[] args){
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        
        //print all the array elements
        for(int i = 0; i<myList.length; i++){
            System.out.println(myList[i] + " ");
        }
        
        //Summing all elements
        double total = 0;
        for (int i = 0; i<myList.length; i++){
            total += myList[i];
        }
        System.out.println("total "+ total);
        
        //Finding the largest element
        double max = myList[0];
        for (int i = 1; i <myList.length; i++){
            if (myList[1] > max) {
                max = myList[1];
            }
        }
        System.out.println("max is "+ max);
        
        //Foreach loop
        for (double element: myList){
            System.out.println(element);
        }
        
        printArray(myList);
    }
    
    public static void printArray(double[] array){
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i] + " ");
            
        }
    }
}
