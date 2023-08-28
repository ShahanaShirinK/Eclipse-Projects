package firstpackage;

public class Iterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1																					FOR LOOP	
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}

//2		
		
		for(int i=1; i<=5; i++)
		{
			System.out.println("shirin");
		}
			
		
		
//3
		for(char i='a'; i<='z'; i++)
		{
			System.out.print(i);
		}
		System.out.println();
		
//4		
		

		int n=5;
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+"*"+n+"="+(i*n));
		}
		
		
		
		
//1																			NESTED FOR LOOP
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();				
		}
		
		
		
		
//2
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=(i); j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();				
		}
		
		
		
//3	
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=(i); j++)
			{
				System.out.print(j);
			}
			System.out.println();				
		}
		
		
//4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		int k=1;
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=(i); j++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println();				
		}
		
/* 5                                                                                          *
		         																		    * *
		         																	      * * *
		      */
		
		
		for(int i=1; i<=3; i++)                                         
		{
			for(int j=i; j<=3; j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		
/*6																				  * 
 																				* * * 
 																			  * * * * * 
 																			 * * * * * * * 
 																		   * * * * * * * * *
		
		*/
		
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*"+" ");
			}
			for(int j=1; j<i; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
//                                             										WHILE LOOP	

		
		int y=1;
		
		while(y<=10)
		{
			System.out.println(y);
			y++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
