package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obnm=new MethodOverloading();
		
		obnm.method();
		obnm.method(5, 10);
		obnm.method(5, 10.5);
		obnm.method(10.5, 10);
		
		daa obn= new daa();
		obn.method1();
	}
	
	public void method()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public void method(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void method(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	
	
	public void method(double a, int b)
	{
		double c=a+b;
		System.out.println(c);
	}

}


class daa
{
	public void method1()
	{
		System.out.println("IAM 1111");
	}
	
	
}
