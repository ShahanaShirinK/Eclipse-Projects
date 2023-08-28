package practicequestions;

import java.util.Scanner;

public class PP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] array = {{9,7,5},{1,3,4}};
		int row = array.length;
		int column = array[0].length;
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		
		

	}

}



