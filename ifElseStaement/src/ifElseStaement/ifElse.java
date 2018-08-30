package ifElseStaement;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a score: ");
		int score = input.nextInt();
		
		
		
		
		if(score >= 90)
			System.out.print("A");
		else if (score >= 80)
			System.out.print("B");
		else if (score >= 70)
			System.out.print("C");
		else if (score >= 60)
			System.out.print("D");
		else
			System.out.print("F");
				
	}

}
