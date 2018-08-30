import java.util.Scanner;

public class integerCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
	    System.out.print("Enter an integer: ");
		int ans = input.nextInt();
	
		if (ans > 1)
			System.out.print("This is a positive number");
		else if (ans == 0)
			System.out.print("This number is 0");
		else if (ans < 0)
			System.out.print("This number is a negative number");
	
	
	
	}

}
