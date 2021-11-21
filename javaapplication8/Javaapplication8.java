package javaapplication8;
import java.util.Scanner;
class Javaapplication8 {

   
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);        
        System.out.println("Please,Enter your persone name == ");
        String person=input.next();
        System.out.println("Please,Enter salary == ");
        int salary =input.nextInt();
        System.out.println("Please,Enter years == ");
        int years=input.nextInt();
        MemberFactory getMember=new MemberFactory();
        Staff s =getMember.getMemberFactory(person);
        s.GetSalary(salary);
        s.getYearsOfWork(years);
    
    }
    
}
