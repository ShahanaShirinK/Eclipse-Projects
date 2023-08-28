package inheritance;

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		children obnm= new children();
		
		obnm.method1();
		obnm.method2();
		obnm.method3();
	}

}


class grandparents
{
	
	public void method1()
	{
		System.out.println("granparents names");
	}

}


class parents extends grandparents
{
	public void method2()
	{
		System.out.println("parents name");
	}

}


class children extends parents
{
	public void method3()
	{
		System.out.println("childrens names");
	}

}