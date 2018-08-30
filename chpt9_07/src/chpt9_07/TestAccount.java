package chpt9_07;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Account account = new Account(1122, 2000);
    Account.setAnnualInterestRate(4.5);
    
    account.withdraw(2500);
    account.deposit(3000);
    System.out.println("Balance is " + account.getBalance());
    System.out.println("Monthly interest is " + 
    	account.getMonthlyInterest());
    System.out.println("This account was created at " + 
    	account.getDateCreated());
	}

}


