package polymorphism;



public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child obnm= new child();
		obnm.method();
		obnm.method11();
		
		
	}

}


class parent
{
	public void method()
	{
		System.out.println("gold parent");
	}
	
	
	public void method11()
	{
		System.out.println("gold gold parent");
	}
	

}

class child extends parent
{

	@Override
	public void method() 
	{
		System.out.println("heeheee parent");
		
		super.method();
	}

	@Override
	public void method11() 
	{
		System.out.println("hoohooo child");
		
	}
	

}



