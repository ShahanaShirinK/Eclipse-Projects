package practicequestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import firstpackage.Switch;

public class Practice {
	
	public static void main(String[] args) {
		
		
	String s= "shirin";
	int length = s.length();
	String reverse= "";
	
	for(int i=length-1; i>=0; i--)
	{
		char letter= s.charAt(i);
		String stringletter= String.valueOf(letter);
		reverse = reverse+  stringletter;
	}
	
	System.out.println(reverse);
}

}




















