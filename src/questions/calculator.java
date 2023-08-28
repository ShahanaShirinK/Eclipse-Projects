package questions;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner obnm= new Scanner(System.in);
		System.out.println("do you want to do another operation? (enter y/Y/N/n)");
		char yesorno= obnm.next().charAt(0);
		
		do
		{

		
		System.out.println("Enter the numbers");
		float a= obnm.nextInt();
		float b= obnm.nextInt();
		
		System.out.println("Enter your option");
		char option= obnm.next().charAt(0);
		
		
			switch(option)
			{
			case '+': System.out.println("addition of 2 numbers="+(a+b));
						break;
			case '-': System.out.println("substraction of 2 numbers="+(a-b));
						break;
			case '*': System.out.println("multiplication of 2 numbers="+(a*b));
						break;
			case '/': System.out.println("division of 2 numbers="+(a/b));
						break;
			default: System.out.println("invalid option entered");	
			
			
			}
			
				
		}while(yesorno=='y' || yesorno=='Y');
		
	
		
		
		
	
	}

}
