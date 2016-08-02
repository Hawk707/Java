/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*;
/**
 *
 * @author haytham
 */
public class DirList {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haytham
 */
  public static void getList(String directory)
                    
  {
      File path = new File( directory );
      String[] list = path.list();
      String element;
  
      for(int i = 0; i < list.length; i++)
      {
          element = list[i];
          System.out.println(element);
      }
  }
  
  }


