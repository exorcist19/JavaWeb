import java.util.Scanner;

public class Quotient {

	public static int quotient(int number1, int number2) {
		if (number2 == 0 )
			throw new ArithmeticException("Number can not be negative");
		
		return number1 / number2;
	}
	
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter an Integer for x: ");
		 int number1 = input.nextInt();
		 System.out.println("Enter an Integer for y: ");
		 int number2 = input.nextInt();
		// TODO Auto-generated method stub
try {		
	int result = quotient(number1, number2);
	System.out.println(number1 + " / " + number2 + " is " + result);
	
	
	
	
	

 
System.out.println(number1 /number2);
		 
}
catch(java.lang.ArithmeticException ex) {
	System.out.println("Incorrect input: An integer is needed");
}
		 
	}

}
