
public class Loan {
	public double annualInterestRate;
public int numOfYears;
public double loanamount;


public  Loan()
{
	//this(2, 5, 1, 1000);
}

public Loan(double annualInterestRate, int numOfYears, double loanAmount)
{
	
	if (loanAmount <= 0)
		throw new IllegalArgumentException("Loan amount should be positive. ");
	
	if (annualInterestRate <= 0)
		throw new IllegalArgumentException("Annual interest rate should be positive.");
	
    if (numOfYears <= 0)
    	throw new IllegalArgumentException("Number of years should be positive.");
    
    setLoanAmount(loanamount);
    
    setAnnualInterestRate(annualInterestRate);
    
    setNumOfYears(numOfYears);
    
}

public double getAnnualInterestRate()
{
	return annualInterestRate;
}

public void setAnnualInterestRate(double annualInterestRate)
{
	if (annualInterestRate <= 0)
		throw new IllegalArgumentException("Annual interest rate should be positive.");
	else
	    this.annualInterestRate = annualInterestRate;
}    
public int getNumOfYears()
{
	return numOfYears;
}

public void setNumOfYears(int numOfYears)
{
	if (numOfYears <= 0)
		throw new IllegalArgumentException("Number of years should be positive.");
	 		this.numOfYears = numOfYears;	
}
	public double getLoanAmount()
{
		return loanamount;
}
	
public void setLoanAmount(double loanAmount)
{
	if (loanAmount <= 0)
		throw new IllegalArgumentException("Loan amount should be positive.");
	this.loanamount = loanAmount;
}
public double monthlyPayment()
{
	double monthlyInterestRate = (annualInterestRate / (1 -(Math.pow(1/(1 - annualInterestRate),numOfYears * 12))));
	return monthlyInterestRate;
}
public double totalPayment()
{
		return monthlyPayment() * numOfYears * 12;

  }
	
}

