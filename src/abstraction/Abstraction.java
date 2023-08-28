package abstraction;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Name22 obnm= new Name22();
		obnm.method1111();
		obnm.method2222();
		obnm.xx();
		
		

	}

}



abstract class Name11
{
	abstract public void method11();
	
	public void method1111()
	{
		System.out.println("method1111");
	}
	
	abstract public void xx();

}



 class  Name22 extends Name11
{

	@Override
	public void method11() 
	{
		System.out.println("heehhee");
		
	}
	
	public void method2222()
	{
		System.out.println("hoohhooooooo");
	}

	@Override
	public void xx() {
		// TODO Auto-generated method stub
		
	}
	
	

}


abstract class Name33 extends Name22
{

	@Override
	public void method11()
	{
		
		System.out.println("jbedv");
	}

	@Override
	public void method2222() 
	{
		System.out.println("ego");
		
	}
	
	abstract public void method44();

	
	}
	
	
	





















