package bank;

import java.util.Scanner;

public class Bankapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the account number");
		Scanner obnm= new Scanner(System.in);
		String accountnumber= obnm.next();
		
		
		long balance= 10_000;
		
		
		
		switch (accountnumber)
		{
		case "132126481526" :System.out.println("Name of the Bank= Federal Bank");
							 System.out.println("Account holder name= SHIRIN");
							 System.out.println("Account number="+accountnumber);
							 System.out.println("Account balance="+balance);
							 System.out.println("enter the withdrawal amount");
							 int withdraw= obnm.nextInt();
							 if(withdraw != 0)
							 {
								 balance= balance- withdraw;
								 System.out.println("final account balance="+balance);
							 }
							 
							 System.out.println("enter the deposit amount");
							 int deposit= obnm.nextInt();
							 if(deposit != 0)
							 {
								 balance= balance+ deposit;
								 System.out.println("final account balance="+balance);
							 }
		
		default: System.out.println("you are entering invalid account number");
							 
		}
		
		
	}

}

	
	

