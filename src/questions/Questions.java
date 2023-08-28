package questions;

import java.util.Scanner;

import practicequestions.Practice;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//1
		
		System.out.println("enter the no of elements to add");
		Scanner obnm= new Scanner(System.in);
		int n= obnm.nextInt();
		
		
		int sum =0;
		
		for(int i=0; i<=n; i++)
		{
			sum = sum+i;
		}
		
		System.out.println("sum="+sum);
		
		
		
		
		
//2
		
		
		
		System.out.println("enter the array size");
		Scanner obnm= new Scanner(System.in);
		int size= obnm.nextInt();
		
		System.out.println("enter the elements of array");
		int [] array= new int [size];
		
		for(int i=0; i<size; i++)
		{
			array[i]=obnm.nextInt();
		}
		
		
		int greatest=0;
		
		for(int i=0; i<size; i++)
		{
			if(array[i]>greatest)
			{
				greatest=array[i];
			}
		}
		
		System.out.println("greatest element="+greatest);
		
		
		
		
//3
		
		
		
		System.out.println("enter the string");
		Scanner obnm= new Scanner(System.in);
		String s= obnm.next();
		
		if(s.endsWith("language"))
		{
			System.out.println("string is ends with language");
		}
		else 
		{
			System.out.println("string is not ends with language");
		}

		
		

//4
		
		
		System.out.println("enter elements");
		Scanner obnm= new Scanner(System.in);
		
		int a= obnm.nextInt();
		int b= obnm.nextInt();
		int c= obnm.nextInt();
		
		System.out.println("average="+(a+b+c)/3);
		

		
//5
		
		
		
		System.out.println("enter the string");
		Scanner obnm= new Scanner(System.in);
		String s= obnm.next();
		
		
		int length= s.length();
		
		System.out.println("count="+length);
		
		
		

//6
		
		
		
		
		int firstelement=0;
		int seconfelement=1;
		
		int nextelement=0;
		
		System.out.print(firstelement+","+seconfelement+",");
		
			for(int i=2; i<=10; i++)
			
		{
				nextelement=firstelement+seconfelement;
			
			System.out.print(nextelement+",");
			
			firstelement=seconfelement;
			seconfelement=nextelement;
			
		}
			
			
			
			
//7			
	}

}
