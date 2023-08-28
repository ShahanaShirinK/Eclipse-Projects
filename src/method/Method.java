package method;

import method.Method;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method obnm= new Method();
		
		obnm.add();
		
		int subtration= obnm.sub();
		System.out.println(subtration);
		
		obnm.mul(60, 1);
		
		double division= obnm.div(50, 10);
		System.out.println(division);
				

	}





//without return type and without parameter

		public void add ()
		{
			int a=20;
			int b=30;
			int c=a+b;
			System.out.println(c);
		}
		
		
// with return type and without parameter
		
		public int sub()
		{
			int a=10;
			int b=5;
			int c=a-b;
			 return c;
		}
		
// without return type and with parameter		
		
		
		public void mul(int a, int b)
		{
			int c=a*b;
			System.out.println(c);
		}
		
// with return type and with parameter		
		
		
		public double div(int a,int b)
		{
			double c=a/b;
			return c;
			
		}
		
		
		
		
		
		
		
}
