package questions;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		do
		{
			System.out.println("enter 2 numbers");
			Scanner obnm= new Scanner(System.in);
			int a=obnm.nextInt();
			int b=obnm.nextInt();
			
			int c=a+b;
			System.out.println("sum of the numbers="+c);
			
			System.out.println("you want to continue the operation?  enter y/Y for yes; n/N for no");
			char option= obnm.next().charAt(0);
			if(option=='N' || option=='n')
			{
				break;
			}
		}
		while(true) ;
		
		
		
		
		
		
		
		
		
		
	}

}
