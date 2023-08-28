package constuctor;

public class Constructor 

	{
	String empname;
	String empdesignation;
	int empid;
	

	public Constructor(String empname, String empdesignation,int empid )
	{
		this.empname=empname;
		this.empdesignation=empdesignation;
		this.empid=empid;
	}
	
	
	
	
	
	public void method()
	{
		System.out.println(empname);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor obnm= new Constructor("arya", "tester",101);
		Constructor obnm1= new Constructor("surya", "developer",105);
		
		
			System.out.println(obnm.empdesignation );
		obnm.method();
		obnm1.method();
		
		
	}
	
	
	
	
	
	
	
	
	

}
