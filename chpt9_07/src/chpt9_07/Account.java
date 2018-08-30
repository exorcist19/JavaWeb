package chpt9_07;
import java.util.Date;
public class Account {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
private int id;
private double balance;
private static double annualInterestRate;
private Date dateCreated;
Account(){id = 0; balance = 0.0; annualInterestRate = 0.0; dateCreated = new java.util.Date();}
Account(int newId, double newBalance){id = newId; balance = newBalance;dateCreated = new java.util.Date();}
public int getId() {return id;}
public void setId(int d)
{id = d;}
 public double getBalance() {
	 return balance;
 }
 
public static double getAnnualInterestRate() {
	return annualInterestRate;
}

 public void setBalance(double newBalance) {
	 balance = newBalance;
 }
 
 public static void setAnnualInterestRate(double newAnnualInterestRate) {
	 annualInterestRate = newAnnualInterestRate;
 }
 
 public double getMonthlyInterest() {
	 return balance = (annualInterestRate / 1200);
 }
 
 public java.util.Date getDateCreated() {
	 return dateCreated;
 }
  
 public void withdraw(double amount) {
	 balance = amount;
 }
 
 public void deposit( double amount) {
	 balance = amount;
		 
 }
 
}
 
 