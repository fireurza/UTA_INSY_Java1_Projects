/**
*
*@author Aaron Kurth
*/

public class Person{

   private String firstName;

   private String lastName;

   private String socialSecurityNumber;

   private String state;

   //constructors
   Person(String firstName,String lastName,String socialSecurityNumber,String state){

      this.firstName=firstName;

      this.lastName=lastName;

      this.socialSecurityNumber=socialSecurityNumber;

      this.state=state;

   }
  
   //get for first name
   public String getFirstName(){

      return firstName;

   }
 
   //get for last name
   public String getLastName(){

      return lastName;

   }
  
   //get for social
   public String getSocialSecurityNumber(){

      return socialSecurityNumber;

   }
  
   //get for state
   public String getState(){

      return state;

   }
  
   //to string method for formatting
   public String toString(){

      String answer="First name: "+getFirstName()+" \nLast name: "+getLastName()+"\nSocial security number:  "+getSocialSecurityNumber()+" \nState: "+getState();

      return answer;

   }

}