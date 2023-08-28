package constuctor;



public class Practice {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		name3 obnm3= new name3();
		obnm3.method1();
	
	}
	
}


class name1
{
	public void method1()
	{
		System.out.println("father");
	}

}

class name2 extends name1
{
	public void method2()
	{
		System.out.println("grand father");
	}

}

class name3 extends name2
{
	public void method1()
	{
		System.out.println("grand grand father");
	}

}
