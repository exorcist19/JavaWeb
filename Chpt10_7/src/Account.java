

import java.util.Scanner;
//create class account
 class Account 
 {
//declare variable balance
private double balance;
//create a constructor account
Account()
{
	
	balance = 100;
}
public void setBalance(double Num)
{
//assign num to balance
	
	balance = Num;
}public double getBalance()
{
	//return balance
	return balance;
}
public double withdraw(double Num)
{
//checks if the balance is available or not
	if(Num > 0 || Num > balance)
		return -1;
	System.out.println("Withdrawing of amount " + Num);
	balance = balance - Num;
	return Num;
}
//create method withdraw
public double getWithDraw()
{
	return balance;
}
public double Deposit(double Num)
{
	if(Num <= 0)
	return -1;
//ask for deposit amount
System.out.println("Depositing of amount " + Num);
	balance = balance + (double)Num;
	return Num;
}
public double getDeposit()
{
//	return balance
	return balance;
}
public void zerobalance(double Num)
{
// close account if value is 0
System.out.println("Closing the Account");
   	balance = 0.0;
}
}
