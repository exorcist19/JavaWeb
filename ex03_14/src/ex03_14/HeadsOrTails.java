package ex03_14;

import java.util.Scanner;

public class HeadsOrTails {

	private static final int Ans = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner input = new Scanner(System.in);
			 System.out.println("Heads or Tails? ");
//			System.out.print
		    int Ans = input.nextInt();

			
			if (Ans == 1)
				System.out.print("Heads");
					
			else if (Ans == 0)
			   System.out.print("Tails");
			
	

	}

}
