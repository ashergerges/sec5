/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author asher
 */
public class Pro {
     public static Abstract_Factory Get_Kind(boolean n)
    {
        if(n)
        {
            return new Doctor();
            
        }
        else
        {
            return new Teaching_assistant();
        }
    }
}
