import java.util.ArrayList;
import java.util.Scanner;
/**
*
*@author Aaron Kurth
*/

public class MyTest {
	//Declaring 2 arraylists
	static private ArrayList<String> questions = new ArrayList<String>();
	static private ArrayList<Integer> answers = new ArrayList<Integer>();
	public static void main(String[] args) 
	{
		//Play again 
		boolean playAgain = false;
		//Create a new scanner
		Scanner input = new Scanner(System.in);
		//Calling loadQuestion to load the question and answers into the array list before starting the quiz
		loadQuiz();
		do 
		{
			//Declaring and initializing count to store the number of correct answers
			int correctCount = 0;
			//Iterating through the questions
			for(int i=0; i<questions.size(); i++) {
				//Gets the question
				System.out.println("Q "+(i+1)+". "+questions.get(i));
				System.out.println("Choose the correct answer: \nType 0 to exit anytime.\n");
				//Gets the answer
				int choice = input.nextInt();
				//If it is the correct answer then prints that it is
				if(answers.get(i)== choice) 
				{
					System.out.println("Answer is correct./n");
					correctCount++; //Increments the correct counter
				}else if(choice == 0) 
				{
					//leaves quiz if 0
					break;
				}else 
				{
					//If wrong answer chosen then the correct answer is given
					System.out.println("Correct Answer is: "+answers.get(i) + "\n");
				}
			}
			//Displays the results
			displayScore(correctCount);
			//Asks if user wants to play again
			System.out.println("Want to play again? true or false");
			playAgain = input.nextBoolean();
		}
		while(playAgain);//Continues the loop if the user wants to play again
		System.out.println("Thanks for playing");
	}
	//Loads the quiz and the correct answers
	private static void loadQuiz() 
	{
		questions.add("How do you convert a String to an Int?\n1. Integer.parseInt()\n2. Int.string\n3. None of the above\n4. Both 1 and 2\n");
		answers.add(1);
		questions.add("Which class are we using to read inputs from a user?\n1. ArrayList\n2. Scanner\n3. Both of the above\n4. None of the above");
		answers.add(2);
		questions.add("Who is the founder of java?\n1. James Gosling\n2. Dennis Ritchie\n3. Bill Joy\n4. None of the above.");
		answers.add(1);
	}
	//Displays results based on score
	private static void displayScore(int correctCount) 
	{
		//If user answers 3 question correctly
		if(correctCount == 3)
		{
			System.out.println("Excellent\n");
		}
		else if(correctCount == 2)
		{ //If user answers 2 questions correctly
			System.out.println("Very Good\n");
		}
		else
		{// If user answer 1 or less than that
			System.out.println("It is time to start to learning Java\n");
		}
	}
}
