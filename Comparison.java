/**
*
*@author Aaron Kurth
*/

import java.util.Scanner;

public class Comparison
{
	public static void main(String[] args) 
	{
		//two strings to store input
		String inOne;
		String inTwo;

		//create the input
		Scanner input = new Scanner(System.in);

		//input of string inOne
		System.out.print("Enter the first string: ");
		inOne = input.nextLine();

		//input of string inTwo
		System.out.print("Enter the second string: ");
		inTwo = input.nextLine();

		//get the input for how many to compare and create an int called comp
		System.out.print("How many characters do you want to compare? ");
		int comp = input.nextInt();

		//get the input for the starting index and create and in index
		System.out.print("Enter the starting index for the comparison: ");
		int index = input.nextInt();

		//create a boolean called result and use the method regionMatches to compare inOne and inTwo at index and for comp characters ignoring case
		boolean result = inOne.regionMatches(true, index, inTwo, 0, comp);

		//if the characters match then it will say they are equal. if not it will say not equal
		if(result == true)
		{
			System.out.print("The characters are equal.");
		}else if(result == false)
		{
			System.out.print("The characters are not equal.");
		}
	}
}
