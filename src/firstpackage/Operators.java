package firstpackage;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Arithmetic operator
		
		int a=10,b=20;
		
		System.out.println("value of a+b="+(a+b));
		System.out.println("value of a-b="+(a-b));
		System.out.println("value of a/b="+(a/b));
		System.out.println("value od a*b="+(a*b));
		System.out.println("value of a%b="+(a%b));
		
		
//Assignment operator
		
		int c=30,d=10;
		
		System.out.println("value of c="+(c));
		
		System.out.println(c);
		
		System.out.println("value of c="+(c+=d));   //+= and =+
		
		System.out.println("value of c="+(c-=d));   // 
		
		System.out.println("value of c="+(c/=d));   //
		
		System.out.println("value of c="+(c*d));    //
		
		
//Relational operator
		
		int e=20,f=10;
		
		System.out.println(e>f);
		
		System.out.println(e<f);
		
		System.out.println(e>=f);
		
		System.out.println(e<=f);
		
		System.out.println(e!=f);
		
		System.out.println(e==f);
		
		System.out.println(e!=20);
		
		
//Logical operator
		
		String username="shirin", password="12345";
		
		
		System.out.println(username=="shirin" && password=="12345");
		System.out.println(username=="shirin" && password=="123456");
		System.out.println(username=="shirin" || password=="123456");
		System.out.println(!(username=="shirin"));
		
//unary operator
		
		int g=20;
		System.out.println(++g);
		System.out.println(g++);
		System.out.println(--g);
		System.out.println(g--);
		System.out.println(g);
		
		
//Ternary operator
		
		int j=10,k=30;
		System.out.println(j<k?j:k);
		
		int m=j<k?k:j;
		System.out.println(m);
		

		int x=10;
			
		System.out.println(x++);
		System.out.println(x);

	}

}
