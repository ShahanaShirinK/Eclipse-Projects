package bank;

import java.util.Scanner;

public interface Bankbank 
{
	public void personaldetails(String name);
	public void balance();
	public void deposit();
	public void withdraw();

}


class Sbi implements Bankbank
{
	static String bankname="sbi";
	int accountnumber;
	int balance=10000;
	Scanner obnm= new Scanner(System.in);
	
	
	
	@Override
	public void personaldetails(String name) 
	{
		System.out.println("ENTER THE THE ACCOUNT NUMBER");
		accountnumber= obnm.nextInt();
		System.out.println("bank name="+bankname);
		System.out.println("account number="+accountnumber);
		System.out.println("your name is "+name);
		
		
		
	}

	@Override
	public void withdraw() 
	{
		System.out.println("enter the withdrawal amount");
		int amount = obnm.nextInt();
		balance = balance-amount;
		System.out.println("balance="+balance);
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("enter the deposit amount");
		int deposit = obnm.nextInt();
		balance = balance+deposit;
		System.out.println("balance="+balance);
		
	}

	@Override
	public void balance () 
	{
		System.out.println(balance);
		
	}
	
}