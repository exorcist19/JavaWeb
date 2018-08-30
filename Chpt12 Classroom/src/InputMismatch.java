import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        
     do {
        	try {
        
		  
		System.out.println(" Enter an Integer: ");
	    int number = input.nextInt();
	    
	    System.out.println(" the number inputted is " + number);
	    
	    continueInput = false;
      	}
        catch (InputMismatchException ex)
      	{
        System.out.println("Try again. (" + "Incorrect input: an integer is required)");
        input.nextLine();
        }
	} while (continueInput);
	}
}