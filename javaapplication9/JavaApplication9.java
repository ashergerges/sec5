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
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Abstract_Factory teach=Pro.Get_Kind(false);
        System.out.println("CS Teching : ");
        Kind_teaching k =teach.Get_Kind("CS");
        k.printdepart();
        teach.getYearsOfWork(7);
        teach.GetSalary(6000);        
        System.out.println("IS Teching :");
        Kind_teaching k2=teach.Get_Kind("IS");
        k2.printdepart();
        teach.getYearsOfWork(8);
        teach.GetSalary(8000);
        System.out.println("IT Teching :");
        Kind_teaching k3=teach.Get_Kind("IT");
        k3.printdepart();
        teach.getYearsOfWork(10);
        teach.GetSalary(9000);
        System.out.println("===========================================================/n");
        Abstract_Factory doc=Pro.Get_Kind(true);
        System.out.println("CS Doctor : ");
        Kind_teaching D=doc.Get_Kind("CS");
        D.printdepart();
        doc.getYearsOfWork(7);
        doc.GetSalary(12000);
        System.out.println("IS Doctor : ");
        Kind_teaching D2=doc.Get_Kind("IS");
        D2.printdepart();
        doc.getYearsOfWork(8);
        doc.GetSalary(14000);
        System.out.println("IT Doctor : ");
        Kind_teaching D3=doc.Get_Kind("IT");
        D3.printdepart();
        doc.getYearsOfWork(10);
        doc.GetSalary(17000);
          
    }
    
}
