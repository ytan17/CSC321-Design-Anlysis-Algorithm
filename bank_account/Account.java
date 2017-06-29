package test;

public class Account
{
	// The instance variables are public on purpose
	// This is bad style!
	public String name;
	public String acctNum;
	public double balance;

	// Default constructor
	public Account()
	{
	 	System.out.println("Account default constructor called.");
	}

	// Other constructor
	public Account(String inName, String number, double amount)
	{
		System.out.println("Account constructor called.");
		name = inName;
		acctNum = number;
		balance = amount;
	}

	public void deposit(double depositAmount)
	{
		balance = balance + depositAmount;
	}

	public void withdraw(double withdrawAmount)
	{
		balance = balance - withdrawAmount;
	}

	public void display()
	{
		System.out.printf("Name: %s, account #: %s, balance = $%.2f\n", name, acctNum, balance);
	}
}
