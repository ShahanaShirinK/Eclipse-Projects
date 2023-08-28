package constuctor;


public class All {

	int u=20;
	static int a;
	String name;
	
	public static void method()
	{
		//method
		System.out.println("method he");
		
	}
	
	public All(String name)
	{
		//constructor
		this.name = name;
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		//constructor
		All obnm = new All("shirin");
		
		// variable
		System.out.println(a);
		System.out.println(obnm.u);
		
		//method
		method();
		
		
		
		
		
		
	}

}
