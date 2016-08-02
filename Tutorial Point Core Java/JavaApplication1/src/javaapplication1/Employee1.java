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
public class Employee1 {
    private String name;
    private String address;
    private int number;
    public Employee1(String name, String address, int number)
    {
        System.out.println("Constructing an Employee1");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }
    public String toString()
    {
        return name + " " + address + " " + number;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }
    public int getNumber()
    {
        return number;
    }
}
