import java.util.Scanner;

public class Ex3_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
	    System.out.print("Enter an integer: ");
		int number = input.nextInt();
	
		if ((number % 5 == 0) && (number % 6 == 0))
			System.out.println("Divisible by both");
		
		if ((number % 5 == 0) || (number % 6 == 0))
			System.out.println("Divisible 5 or 6");
		
	
	
	}

}
