import java.util.Scanner;
/**
*
*@author Aaron Kurth
*/
public class Sales
{

	public static void main(String args[])
    {
    	//initiates the variables
        double price;
        int quantity;
        int item = 1;
        double totalValue = 0;

        //creates a new scanner called userInput
        Scanner userInput = new Scanner(System.in);

        //loop that ends when user selects muffin #0
        while(item != 0)
        {
            System.out.println("0 - Exit");
            System.out.println("1 - Blueberry Muffin");
            System.out.println("2 - Chocolate Chip Muffin");
            System.out.println("3 - Banana Muffin");
            System.out.print("Enter the muffin number: ");

            //converts user input to an int
            item = userInput.nextInt();

            //verifies that the user selected either 0, 1, 2, or 3
            if(item < 0 || item > 3)
            {
                System.out.println("Choose a valid number%n");
            }

            //if user did not choose 0 it asks for the quantity of muffins and places it in the quantity variable
            else if(item != 0)
            {
                System.out.print("Enter the quantity: ");
                quantity = userInput.nextInt();

                //receives the price of the selected muffin from the getValue method
                price = getValue(item);

                //calculates the total retail value of all muffins
                totalValue += (quantity * price);

                System.out.println();
            }
        }
        
        //output
        System.out.printf("%nTotal retail value of all muffins sold is: $%.2f%n", totalValue);

    }
    // method to return the price of the muffin selected 
    public static double getValue(int itemType)
    {
        switch(itemType)
        {
        case 1:
            return 2.98;//blueberry
        case 2:
            return 4.50;//chocolate chip
        case 3:
            return 9.98;//banana
        default:
            return 0.0;
        }
    }

}
