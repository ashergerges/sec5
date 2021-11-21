package javaapplication8;

public class Doctor implements Staff {
 
    @Override
    public void GetSalary(int salary) {
        System.out.println(salary);
    }


    @Override
    public void getYearsOfWork(int years) {
        System.out.println( years );
    }
   
}
