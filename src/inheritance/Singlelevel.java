package inheritance;

public class Singlelevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		parents obnm= new parents();
		
		obnm.method1();
		obnm.method2();
		
		
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
