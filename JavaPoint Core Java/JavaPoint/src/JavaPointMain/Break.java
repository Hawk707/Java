/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPointMain;

/**
 *
 * @author haytham
 */
public class Break {
    public static void main(String args[]){
        for(int i = 1; i <= 10; i++){
            if(i==5){
                break;
            }
            System.out.println(i);//breaks the inner most loop, unless you use 'label' which is similar to go to statement
        }
    }
}
