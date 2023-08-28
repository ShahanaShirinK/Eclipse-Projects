package questions;

import java.util.Scanner;

public class Arrayp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the size of array");
		Scanner obnm= new Scanner(System.in);
		int size=obnm.nextInt();
		
		int [] array= new int [size];
		int positivecount=0;
		int negativecount=0;
		int zerocount=0;
		
		System.out.println("enter the elements of array");
		for(int i=0; i<size; i++)
		{
			array[i]=obnm.nextInt();
			
			if(array[i]>0)
			{
				positivecount++;
			}
			else if (array[i]<0)
			{
				negativecount++;
			}
			else
			{
				zerocount++;
			}
		}
		
		System.out.println(positivecount);
		System.out.println(negativecount);
		System.out.println(zerocount);
		

	}

}


