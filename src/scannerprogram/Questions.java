package scannerprogram;

import java.util.Scanner;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


// 																				REVERSE THE NUMBER
		
		System.out.println("Enter the number");
		Scanner obnm= new Scanner(System.in);
		int n = obnm.nextInt();
		
		
		int reverse=0; 
		int reminder;
		
		while(n>0)
		{
			reminder=n%10;
			reverse=reverse*10+reminder;
			n=n/10;
		}
			
		System.out.println("reversed number="+reverse);
		
		
		
//																		   	COUNT OF THE NUMBER
		 
		
		System.out.println("enter the number");
		Scanner obnm= new Scanner(System.in);
		int n = obnm.nextInt();
		
		int c=0;
		while(n>0)
		{
			n=n/10;
			c++;
		}
		System.out.println("count="+c);		
		

		
//																				ARMSTRONG NUMBER
		
		System.out.println("enter the number");
		Scanner obnm= new Scanner(System.in);
		int n = obnm.nextInt();
		
		int temp=n;
		int original=n;
		int c=0;
		double reminder=0;
		double sum=0;
		
		while(n>0)
		{
			n=n/10;
			c++;
		}
		 
		System.out.println("count="+c);
		
		while(temp>0)
		{
			reminder = temp%10;
			sum = sum + Math.pow(reminder,c);
			temp=temp/10;
		}
		
		
		 if(sum==original)
		 {
			 System.out.println("number is armstrong");
		 }
		 else
		 {
			 System.out.println("number is not armstrong");
		 }
		
		
//																					FACTORIAL
		 
		 
		 System.out.println("enter the number");
			Scanner obnm= new Scanner (System.in);
			int n= obnm.nextInt();
			
			int factorial =1;
			
			for(int i=n; i>0 &&i<=n; i--)
			{
				factorial= factorial*i;
				
			}
			
			System.out.println(factorial);	 
		 
		 
		 
// 																				SUM OF NUMBERS		 
		 
		 
		 
		 
		 
		 
		 
	}

}
