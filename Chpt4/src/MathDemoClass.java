import java.util.Scanner;

public class MathDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abs1 = Math.abs(10);
		int abs2 = Math.abs(-20);
		double ceil = Math.ceil(7.343);
		double floor = Math.floor(7.343);
		int min = Math.min(10,  20);
		int max = Math.max(10, 20);
		int max1 = 10;
				int min1 = 1;
				int random = (int)(Math.random() * max1) + min1;
				
				System.out.println(" abs1 "+abs1+"\n abs2 "+abs2+ "\nceil "+ceil+"\nfloor "+floor+"\nmin "+min+"\nmax "+max+"\nmax1 "+max1+"\nmin1 "+min1+" \nrandom "+random);
				char ch = 'b';
				if (ch >= 'A' && ch <= 'Z')
				System.out.println(ch + " is an uppercase letter");
				else if (ch >= 'a' && ch <= 'Z')
				System.out.println(ch + " is an lowercase letter");	
				else if(ch >= '0' && ch <= '9')
				System.out.println(ch + " is an numeric character");
				
				
				System.out.println("isDigit('a') is " + Character.isDigit('a'));
				System.out.println("isLetter('a') is " + Character.isLetter('a'));
				System.out.println("isLowerCase('a') is "
				+Character.isLowerCase('a'));
				System.out.println("isUpperCase('a') is "
				+Character.isUpperCase('a'));
				System.out.println("toLowerCase('T') is "
						+Character.toLowerCase('T'));
				System.out.println("toUpperCase('q') is "
						+Character.toUpperCase('q'));
				
			
				String message = "Welcome to Java";
				System.out.println("The length of " + message + " is " + message.length());
				System.out.println(message.substring(0, 11) + "HTML"+" Index of w is "+message.indexOf('W'));
				String s1 ="hello ";
				String s2="World ";
				String s3= s1 + s2;
				String s4="hello ";
				
				System.out.println("comparison S1 an s2 "+s1.equals(s2));
				System.out.println("comparison s1 and s4 "+ s1.equals(s4));
				
				System.out.println("s1+s2= "+s3);
				
				Scanner input = new Scanner(System.in);
				System.out.print("Enter a character: ");
				String s = input.nextLine();
				char ch1 = s.charAt(0);
				System.out.println("The charcter entered is " + ch1);
				
				
				System.out.println("Enter the first city: ");
				String city1 = input.nextLine();
				System.out.println("Enter the second city: ");
				String city2 = input.nextLine();
				if (city1.compareTo(city2) <0)
				System.out.println("The cities in alphbetical order are " + city1 + " " + city2);
				else
				System.out.println("The cities in alphabetical order are " + city2 + " " + city1);
				
				System.out.printf("%3d#%2s#4.2f\n", 1234, "Java", 51.6653);
				System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 5.63);
				System.out.printf("%-8d%-8s%-8.1f \n", 1234, "Java", 5.63f);
				
	
				
				
				
				
				
	}

}
