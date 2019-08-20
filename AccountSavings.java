/**
*
*@author Aaron Kurth
*/
public class AccountSavings{

   static double interestRate;

   double savings;

   //Creates account with given balance

   AccountSavings(double balance) throws Exception{

      if(balance>0){

          savings=balance;

      }

      else{

          throw new Exception();

      }

   }

   //calculates the monthly interest and puts it in savings

   void calculateMontlyInterest(){

      double montlyInterest=(savings*interestRate)/12;

      savings=savings+montlyInterest;

   }

   //modifies interest rate and validates it

   static void modifyInterestRate(double rate) throws Exception{

      if(rate>0&&rate<=1){

          interestRate=rate;

      }

      else{

          throw new Exception();

      }

   }

   public String toString(){

      return ""+savings;

   }

}
