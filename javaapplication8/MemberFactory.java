package javaapplication8;


public class MemberFactory {
    public Staff getMemberFactory (String person)
    {
        
       if(person==null)
          {
              return null ;
          }
       if(person.equalsIgnoreCase("Doctor"))
          {
             return new Doctor();
           
          }
       else if(person.equalsIgnoreCase("TeacchingAssistant"))        
           {
               return new TeachingAssistant();
           }
     else
           return null;
       
       
       
    }
}
