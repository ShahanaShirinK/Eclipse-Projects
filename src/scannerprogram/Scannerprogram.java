package scannerprogram;

import java.util.Scanner;

public class Scannerprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//1 
		
	System.out.println("Enter a number");
	
	Scanner obnm = new Scanner(System.in);
	 int number = obnm.nextInt();
	 System.out.println("number="+number);
	 
	 
	
//2		
		
	System.out.println("enter 2 numbers");
	
	Scanner objnm = new Scanner(System.in);
	int a = objnm.nextInt();
	int b = objnm.nextInt();
	
	System.out.println("sum of the numbers="+(a+b));
		
	
	
	
//3		
		
	System.out.println("Enter 2 numbers");
	
	Scanner objctnm= new Scanner(System.in);
	int c = objctnm.nextInt();
	int d = objctnm.nextInt();

		
	
	System.out.println("choose the choice");
	char e = objctnm.next().charAt(0);
	
	switch(e)
	{
	
	case '+': System.out.println("sum of 2 values="+(c+d));
				break;
	case '-' : System.out.println("difference of 2 values="+(c-d));
				break;
	case '*' : System.out.println("multiplication of 2 values="+(c*d));
				break;
	case '/' : if(d==0)
					{
					System.out.println("number cannot be divisible by zero");
					}
				else
					{
					System.out.println("division of 2 values="+(c/d));	
					}
				break;
	default : System.out.println("invalid choice");
				
	}	
		
		
		
	objctnm.close();
		
	}
	

}
