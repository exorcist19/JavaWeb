import java.util.Scanner;

public class NumberOfDaysInMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int choice; int year;
Scanner input=new Scanner(System.in);
System.out.println("Enter number between 1 & 12: ");
choice=input.nextInt();
System.out.println("Enter year: ");
year = input.nextInt();

		switch(choice)
		{
		case 1:
		System.out.println("January has 31 days");
		break;
		case 2:
		
		// Needs a fixxer upper
		if( ((year%4 == 0) && (year%100 !=0)) || (year%400 == 0))
		System.out.println("The number days in February  is 29");
		else
		System.out.println("The number of days in February is 28");
		break;
		case 3: 
		System.out.println("March has 31 days");
		break;
		case 4:
		System.out.println("April has 30 days");
		break;
		case 5:
		System.out.println("May has 31 days");
		break;
		case 6:
		System.out.println("June has 30 days");
		break;	
		case 7:
		System.out.println("July has 31 days");
		break;
		case 8:
		System.out.println("August has 31 ");
		break;
		case 9:
		System.out.println("September has 30 days");
		break;
		case 10:
		System.out.println("October has 31 days");
		break;
		case 11:
		System.out.println("November has 30 days");
		break;
		case 12:
		System.out.println("December has 31 days");
		break;
		default:
			System.out.println("Please enter the correct choice");
		}
		
		
		
		
		
		
		
	}

}