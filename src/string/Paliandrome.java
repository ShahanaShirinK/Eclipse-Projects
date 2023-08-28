package string;

import java.util.Scanner;

public class Paliandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//																	paliandrome
		
		System.out.println("Enter the string");
		Scanner obnm= new Scanner (System.in);
		String s1=obnm.next();
		
		
		int length= s1.length();
		
		String reverse="";
		String temp=s1;
		
		for(int i=length-1; i>=0; i--)
			{
			
			reverse=reverse+s1.charAt(i);
			
			}
		
		System.out.println(reverse);

		if(reverse.equals(temp))
		{
			System.out.println("paliandrome");
		}
		else
		{
			System.out.println("not paliandrome");
		}
		
		
		
	}

}
