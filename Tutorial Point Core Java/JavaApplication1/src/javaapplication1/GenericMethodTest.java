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
public class GenericMethodTest {
    //generic method printArray
    public static < E > void printArray(E[] inputArray)
    {
        //Display array elements
        for (E element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        //Create arrays of Intger Double and Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.0, 2.0, 3.0, 4.0};
        Character[] charArray = {'H', 'E', 'L', 'L','O'};
        
        System.out.println("Array integerArray contains:");
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }
    
}
