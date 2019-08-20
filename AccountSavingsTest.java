/**
*
*@author Aaron Kurth
*/

public class AccountSavingsTest{

   public static void main(String[] args){

      AccountSavings saver1=null,saver2=null; //Initialize

      try{

          //Try catch for exceptions in savings

          saver1=new AccountSavings(2000);

          saver2=new AccountSavings(3000);

      }

      catch(Exception e){

          System.out.println("Not valid balance to begin with");

      }

      try{

          //try catch for exceptions in modifyInterestRate

          saver1.modifyInterestRate(0.04);

      }

      catch(Exception e){

          System.out.println("Rate should be within 0 to 1 or 0% to 100%");

      }


      System.out.println("Monthly balances at 0.04 interest rate");

      System.out.println("Balances:");

      System.out.printf("%-20s%-20s%-20s\n","","Saver1","Saver2");

      System.out.printf("%-20s%-20s%-20s\n","Base","$2000.00","$3000.00");

      //Loops for 12 months

      for(int i=1;i<=12;i++){

          saver1.calculateMontlyInterest();

          saver2.calculateMontlyInterest();

          double saver1Balance=Math.round(Double.parseDouble(saver1.toString()) * 100.0) / 100.0;

          double saver2Balance=Math.round(Double.parseDouble(saver2.toString()) * 100.0) / 100.0;

          System.out.printf("%-20s%-20s%-20s\n","Month "+i,"$"+saver1Balance,"$"+saver2Balance);

      }

   }

}