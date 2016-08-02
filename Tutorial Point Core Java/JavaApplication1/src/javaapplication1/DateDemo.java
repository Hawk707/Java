/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.util.*;
import java.text.*;
/**
 *
 * @author haytham
 */
public class DateDemo {
public static void main(String args[]){
    //Instantiate a date object
    Date date = new Date();
    
    //display time and date using toString()
    System.out.println(date.toString());
    
    Date dNow = new Date();
    SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
    
    System.out.println("Current Date: " + ft.format(dNow));
    
    // display time and date using toString()
     String str = String.format("Current Date/Time : %tc", date );

     System.out.printf(str);
     
     
      SimpleDateFormat ftt = new SimpleDateFormat ("yyyy-MM-dd"); 

      String input = args.length == 0 ? "1818-11-11" : args[0]; 

      System.out.print(input + " Parses as "); 

      Date t; 

      try { 
          t = ftt.parse(input); 
          System.out.println(t); 
      } catch (ParseException e) { 
          System.out.println("Unparseable using " + ftt); 
      }
     
}    
}
