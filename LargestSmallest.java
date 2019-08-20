import java.util.Scanner;
/**
*
*@author Aaron Kurth
*/
public class LargestSmallest
{

	public static void main(String[] args)
	{
		//initiate min, max and num
		int min = 0;
		int max = 0;
		int num = 0;

		//create a scanner to get user input
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter the 15 numbers one by one.");

		for(int i = 1; i <= 15; i++)
		{
			//ask and convert user input to int
			System.out.print("Enter the #:");
			num = userInput.nextInt();

			if(i == 1)
			{
				//set base numbers
				max = min = num;
			}

			else
			{
				if(num > max)
				{
					//check if largest number
					max = num;
				}
				if(num < min)
				{
					//check if smallest number
					min = num;
				}
			}
		}

		//output
		System.out.printf("%nThe maximum number was %d", max);
		System.out.printf("%nThe minimum number was %d", min);
	}
}