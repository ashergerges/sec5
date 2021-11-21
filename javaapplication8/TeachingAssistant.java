package javaapplication8;

public class TeachingAssistant implements Staff {

  @Override
    public void GetSalary(int salary) {
        System.out.println(salary);
    }


    @Override
    public void getYearsOfWork(int years) {
        System.out.println( years );
    }
   
}
