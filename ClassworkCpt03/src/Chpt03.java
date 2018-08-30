import java.util.Scanner;

public class Chpt03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int choice;
System.out.println("Enter number between 1 & 7: ");
Scanner input=new Scanner(System.in);
choice=input.nextInt();
		switch(choice)
		{
		case 1:
		System.out.println("Today is Monday");
		break;
		case 2:
		System.out.println("Today is Tuesday");
		break;
		case 3:
		System.out.println("Today is Wednesday");
		break;
		case 4:
		System.out.println("Today is Thursday");
		break;
		case 5:
		System.out.println("Today is Friday");
		break;	
		case 6:
		System.out.println("Today is Saturday");
		break;
		case 7:
		System.out.println("Today is Sunday");
		break;	
		default:
			System.out.println("Please enter the correct choice");
		}
		
		
		
		
		
		
		
	}

}
