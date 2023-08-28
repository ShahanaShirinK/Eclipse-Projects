package method;

import java.util.Scanner;



public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Questions objectname= new Questions();
		
		System.out.println("enter the string");
		Scanner obnm= new Scanner (System.in);
		String data= obnm.next();
		
		objectname.vowel(data);
		
		

	}

	
	
	
	public void vowel(String data)
	
	{
		int length= data.length();
		int c=0;
		
		for(int i=0; i<length; i++)
		{
			char letter= data.charAt(i);
			if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
			{
				c++;
			}
		}
		System.out.println(c);
	}
		
}
