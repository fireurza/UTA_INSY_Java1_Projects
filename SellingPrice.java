import java.util.Scanner;
/**
*
*@author Aaron Kurth
*/
public class SellingPrice
{
	public static void main (String[] args)
	{
		//initiates scanner, variables, and array
		Scanner userInput = new Scanner(System.in);
		int sales = 1;
		int sold;
		int year = 0;
		double totalSales = 0;
		double totalSold = 0;
		double combined;

		//while loop to ask for user input and gather variables for the array
		while(sales != 0)
		{
			System.out.println("Enter the sales or press 0 to end.");
			System.out.print("Enter the sales for year " + (year+1) +":");

			//grab user input and convert to int
			sales = userInput.nextInt();

			//checks if sales is 0. if not then it processes the user inputs
			if(sales > 0)
			{
				double sellPrice = 0;
				System.out.print("Enter the number of products sold: ");
				sold = userInput.nextInt();
				//calculates sell price
				sellPrice = sales / sold;
				System.out.printf("%nSelling price for year %d is: $%.2f%n%n", year, sellPrice);
				totalSales += sales;
				totalSold += sold;
				year++;
			}
		}

		//calculates combined sales
		combined = totalSales / totalSold;
		//displays data
		System.out.printf("%nTotal sales revenue is $%.2f%n",totalSales);
		System.out.printf("Total number of products sold is %.2f%n", totalSold);
		System.out.printf("Combined selling price is $%.2f%n", combined);
	}
}