package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Exceptionprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			int a=10, b=0;
		 
			double c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("hello");
		
		
		
		
		
		int [] arrayname= new int [2];
		arrayname[0]=10;
		arrayname[1]=10;
		try {
		arrayname[2]=10;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(arrayname[0]);
		
		
		
		
		try (FileInputStream file = new FileInputStream("e:")) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
