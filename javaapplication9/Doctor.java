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
public class Doctor extends Abstract_Factory{
     
    @Override
    void GetSalary(int salary) {
         System.out.println("the salary of teaching assistant is: "+salary);
        //To change body of generated methods, choose Tools | Templates.
    }
     @Override
    public void getYearsOfWork(int years)
     {
     System.out.println("the number of years for the teacher assistant is: "+years);
    }

    @Override
    public  Kind_teaching Get_Kind(String name)
    {     
    if(name.equalsIgnoreCase("is"))
    { 
        return new IS();
    }
    
    else if(name.equalsIgnoreCase("cs"))
    {
        return new CS();
    }
    else if(name.equalsIgnoreCase("it"))
    {
        return new IT();
    }
    else
    {
        return null;
    }
    
    }
    
}
