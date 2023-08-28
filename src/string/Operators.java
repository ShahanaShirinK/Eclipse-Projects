package string;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1= "hello";
		String s2= "HELLO";
		String s3= "  hello  ";
		String s4= "welcome";
		String s5= "hello welcome";
		String s6= "hello welcome to luminar";
		
//                                                                concat();		
		
	System.out.println(s1.concat(s4));	
	System.out.println(s1.concat(s3));	
	
	
//																equals();
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
		
//																toLowercase();
//																toUppercase();
		
		
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toLowerCase());	
		
//																trim();
	
	
	System.out.println(s3.trim());
	
	
// 
	System.out.println(s5.contains(s1));
	System.out.println(s5.contains(s2));
	
	
// 
	System.out.println(s1.length());
	System.out.println(s3.length());
	
// 
	System.out.println(s1.substring(1,4));
	
	
// 
	System.out.println(s1.startsWith("hel"));
	System.out.println(s1.endsWith("hel"));
	
//	
	
	System.out.println(s5.replace("welcome", "shirin"));
	
	
// 
	System.out.println(s2.charAt(0));
	
//																		split
	
	String [] stringname= s6.split("o");
	for(String v:stringname)
	{
		System.out.println(v);
	}
	

	
	

	
//																	paliandrome
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
