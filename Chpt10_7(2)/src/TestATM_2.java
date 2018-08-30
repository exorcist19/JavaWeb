import java.util.Scanner;

public class TestATM_2 {

	

	

	

		public static void main(String[] args) 
		{
			//assign numbers 0 through 9
		
			int id[] = {0,1,2,3,4,5,6,7,8,9};
			//set balance $100 dollars in each account
			float ibal[] = {100,100,100,100,100,100,100,100,100,100};
			
	char ch;
	String str;
	float amt;
	boolean c = false;
	//declare scanner
	Scanner input = new Scanner(System.in);

		int sid;
		while(true)
	{
	System.out.println("Enter an id from 0 to 9 ");
		sid = input.nextInt();
		if(sid < 10)
	{
		Account2 account1 = new Account2(ibal[sid]);
	//while loop begins
		while(true)
		{
			if(!c)
			{	
	System.out.println("\n1. (check balance)\n2. (Withdraw)\n3. (Deposit)\n4. (exit)\n Enter Choice");
	
		str = input.nextLine();
		if(str.length() == 1)
			ch = str.charAt(0);
		/*	else
			{ c= true;
	continue;
	}
		c = false;
		try {
*/	//if 1 then display balance
	if(ch == '1')
	{
	System.out.println(" The balance is " + account1.getBalance());
	}
	//if 2 then withdraw
			else
	if(ch == '2')
	{
	System.out.println("Enter the amount to withdraw: ");
		amt = input.nextFloat();
	if(account1.withdraw(amt)!=1)
		//withdraw success
	System.out.println("Withdrawal sucess");
		else
	System.out.println("Can't withdraw this amount "+ amt);

	System.out.println("Enter amount to deposit: ");
		amt = input.nextFloat();
	if(account1.Deposit(amt)!=1)
		//deposit success
	System.out.println("Deposit Success");
		else
	System.out.println("Deposit Failure");
	}
		else
	if (ch == '4')
		break;
	}
			/*catch(Exception e) {
			System.out.println("Invalid input ");*/
		continue;
		}
		}
		     }
		//se
			break;
		 }
		    }
		}
	




