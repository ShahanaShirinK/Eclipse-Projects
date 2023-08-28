package array;

import java.util.Scanner;

public class Arrayprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//1
		
		int [] a= new int [3];
		a[0] = 23;
		a[1] = 33;
		a[2] = 43;
				
			System.out.println(a[0]);                                 // for printing single value
			
			for(int i=0; i<3; i++)									// for printing multiple value 
			{
				System.out.println(a[i]);
			}
			
		
//2
			
				
			
			Scanner obnm= new Scanner(System.in);
			
			System.out.println("Enter size of the array");
			int size= obnm.nextInt();
			int [] an= new int [size];	
			
			System.out.println("Enter elements of array");
			
			for(int i=0; i<size; i++)
			{
				an[i]= obnm.nextInt();	
			}
			
			for(int i=0; i<size; i++)
			{
				System.out.println(an[i]);
			}
			
			
//3																				storing string
			
			
			String [] array= new String [5];
			System.out.println("Enter the names");
			
			Scanner obnm = new Scanner (System.in);
			 
			for(int i=0; i<5; i++)
			{
				array[i]= obnm.next();	
			}
			
			
			for(int i=0; i<5; i++)
			{
				System.out.println(array[i]);
			}
			
			
			
			
			
//4																			2 dimensional array	
			
			
			int [][] an= new int [2][3];
			Scanner obnm= new Scanner(System.in);
			
			System.out.println("Enter the values");
			
			
			for(int i=0; i<2; i++)
			{
				for(int j=0; j<3; j++)
				{
					an[i][j]=obnm.nextInt();
				}
			}
			
			
			System.out.println("entered values");
			
			for(int i=0; i<2; i++)
			{
				for(int j=0; j<3; j++)
				{
					System.out.print(an[i][j]+" ");
				}
				System.out.println();
			}
	
			
			
//5																		username and password
			
			String [][] an= new String [5][2];
			Scanner obnm= new Scanner(System.in);
			
			System.out.println("Enter user name and password");
			
			
			for(int i=0; i<5; i++)
			{
				for(int j=0; j<2; j++)
				{
					an[i][j]=obnm.next();
				}
			}
			
			
			System.out.println("entered values");
			
			for(int i=0; i<5; i++)
			{
				for(int j=0; j<2; j++)
				{
					System.out.print(an[i][j]+" ");
				}
				System.out.println();
			}
	
			
			
//6 
			
			System.out.println("Enter the size of row and column");
			
			Scanner obnm= new Scanner(System.in);
			
			int row= obnm.nextInt();
			int column= obnm.nextInt();
			
			String [][] an= new String [row][column];
			
			
			System.out.println("Enter user name and password");
			
			
			for(int i=0; i<row; i++)
			{
				for(int j=0; j<column; j++)
				{
					an[i][j]=obnm.next();
				}
			}
			
			
			System.out.println("entered values");
			
			for(int i=0; i<row; i++)
			{
				for(int j=0; j<column; j++)
				{
					System.out.print(an[i][j]+" ");
				}
				System.out.println();
			}
			
			
	
			
			
//7																	sum and average of array
			
			
			int [] array1= new int [5];
			
			Scanner objnm= new Scanner (System.in);
			
			
			
			System.out.println("enter numbers");
			
			
			int sum=0;
			for(int i=0; i<5; i++)
			{
				array1[i]= objnm.nextInt();
				sum = sum + array1[i];
			}
			
			
			System.out.println("sum="+sum);	
			System.out.println("average="+sum/5);	
			
			
			
			
			
// 8																	fetch 1D using for each loop
			
			
			Scanner obnm= new Scanner(System.in);
			
			System.out.println("Enter size of the array");
			int size= obnm.nextInt();
			int [] an= new int [size];	
			
			System.out.println("Enter elements of array");
			
			for(int i=0; i<size; i++)
			{
				an[i]= obnm.nextInt();	
			}
			
			for(int v:an)
			{
				System.out.println(v);
			}
			
			
			
// 9																	fetch 2D using for each loop	
			
			
			int [][] an= new int [2][3];
			Scanner obnm= new Scanner(System.in);
			
			System.out.println("Enter the values");
			
			
			for(int i=0; i<2; i++)
			{
				for(int j=0; j<3; j++)
				{
					an[i][j]=obnm.nextInt();
				}
			}
			
			
			System.out.println("entered values");
			
			for(int [] v:an)
			{
				for(int v1:v)
				{
					System.out.print(v1+" ");
				}
				System.out.println();
			}
			
			
			
//			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
