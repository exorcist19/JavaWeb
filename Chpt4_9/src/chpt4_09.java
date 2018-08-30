import java.util.Scanner;

public class chpt4_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String str;
		char ch;
		
		System.out.print("Enter a character:");
		str = s.nextLine();
		ch = str.charAt(0);
		System.out.print("The Unicode for the character " + ch + " is " + (int)ch + ".");
	}

}
