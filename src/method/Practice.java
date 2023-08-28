package method;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter thr string");
		Scanner obnm= new Scanner (System.in);
		String s=obnm.next();
		
		Practice objectname= new Practice();
		objectname.name(s);

	}
	
	public void name(String s)
	{
		int length=s.length();
		int c=0;
		for(int i=length-1; i>=0; i--)
		{
			
			char letter= s.charAt(i);
			
			if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
			{
				c++;
			}
		}
		System.out.println("count of vowels="+c);
	}

}
