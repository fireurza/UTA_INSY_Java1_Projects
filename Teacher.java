/**
*
*@author Aaron Kurth
*/

public class Teacher extends Person{

   private int numberOfCourses;

   //constructors
   Teacher(String firstName,String lastName,String socialSecurityNumber,String state,int numberOfCourses){

      super(firstName,lastName,socialSecurityNumber,state);

      this.numberOfCourses=numberOfCourses;

   }

   //get for number of courses
   public int getNumberOfCourses(){

      return numberOfCourses;

   }

   //toStrong for printing
   public String toString(){

      String answer="First name: "+getFirstName()+"\nLast name: "+getLastName()+"\nSocial security number: "+getSocialSecurityNumber()+"\nState: "+getState()+"\nTeaches: "+numberOfCourses+" courses.\n";

      return answer;

   }

}
