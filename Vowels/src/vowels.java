import java.util.Scanner;

public class vowels {

	public static void main(String args[]) {
		char letter;
	       Scanner input = new Scanner(System.in);
		 System.out.print("enter a letter of the alphabet");
	       letter = input.next().charAt(0);

		
		if(letter=='a' || letter=='A' || letter=='e' || letter=='E'
				   || letter=='i' || letter=='I' 
				   || letter=='o' || letter=='O'
				   || letter=='u' || letter=='U')
				   
		System.out.println("letter is a vowel");
		else
			System.out.println("letter is a consonant");
		//else if
			//System.out.print(""+letter+" is invalid"+input");	   
	   }
	}