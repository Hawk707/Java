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
public class InstanceCounter {
    private static int numInstances = 0;
    protected static int getCount() {
        return numInstances;
        }
    private static void addInstance() {
        numInstances++;
        }
    InstanceCounter() {
        InstanceCounter.addInstance();
    }
    
    public static void main(String[] arguments){
        System.out.println("STarting with " +
                InstanceCounter.getCount() + " instances");
        for (int i = 0; i < 500; ++i){
            new InstanceCounter();
            
        }
        System.out.println("created " + 
                InstanceCounter.getCount() + " instance");
    }
}

