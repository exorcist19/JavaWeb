import java.util.Scanner;

public class evenLetter {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String printOddPositionChars="" ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String inputString = scanner.nextLine();
		
		//loop
		int i = 0;
		
		for(i = 0;i< inputString.length()-1; i+=2);
		{
			//printOddPositionChars=printOddPositionChars+1;
			
		printOddPositionChars=printOddPositionChars+inputString.charAt(i);			
		
		}
		System.out.println("The characters at odd positions in the given string are: "+printOddPositionChars+" "+inputString.length());
		
		
		
		
	}
}
