package bank;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Enter the account number");
		System.out.println("Enter the deposit amount");
		System.out.println("Enter the withdrawal amount");
		
		
		federalbank objectname= new federalbank();
		objectname.personaldetails("shirin");
		objectname.deposit();
		objectname.balance();
		objectname.withdraw();

	}

}

interface Bankapplication
{
	public void personaldetails(String name);
	public void balance();
	public void deposit();
	public void withdraw();

}

class federalbank implements Bankapplication
{
	
	
	Scanner obnm= new Scanner(System.in);
	long accountnumber= obnm.nextInt();
	long deposit= obnm.nextInt();
	long withdrawamount= obnm.nextInt();
	
	long balance=10_000l;
	
	

	@Override
	public void personaldetails(String name) 
	{
		System.out.println("Name of the Bank= Federal Bank");
		System.out.println("Account holder name="+name);
		System.out.println("Account number="+accountnumber);
		System.out.println("Account balance="+balance);
		
	}

	@Override
	public void balance() 
	{
		
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("Enter the deposit amount");
		balance = balance+deposit;
		
		System.out.println("Final account balance is" +balance);
		
		
	}

	@Override
	public void withdraw() 
	{
		System.out.println("Enter the withdrawal amount");
		balance = balance-withdrawamount;
		
		System.out.println("Final account balance is" +balance);
		
	}
	

}


		
		
	
	

