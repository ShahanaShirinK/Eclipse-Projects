package string;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("enter the values");
		Scanner obnm= new Scanner (System.in);
		int a= obnm.nextInt();
		int b= obnm.nextInt();
		
		Practice objectname= new Practice();
		int returnvalue= objectname.name(a,b);
		
		
		System.out.println(returnvalue);
		
		
	}	
	public int name(int a,int b)
	{
		int c= a/b;
		
		//System.out.println(c);
		
		return c;
	}
		

	
}

