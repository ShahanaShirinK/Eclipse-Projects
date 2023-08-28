package inheritance;

public class Heirarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tiger obnm1= new tiger();
		lion obnm2= new lion();

		obnm1.method1();
		obnm1.method2();
		
		obnm2.method1();
		obnm2.method3();
	}

}


class animal
{
	public void method1()
	{
		System.out.println("animal details");
	}

}

class tiger extends animal
{
	public void method2()
	{
		System.out.println("tiger details");
	}

}

class lion extends animal
{
	public void method3()
	{
		System.out.println("lion details");
	}
}