package resume;

public class Build {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		resume obnm= new resume();
		obnm.CareerObjective();
		obnm.manualtesting();
		obnm.sql();
		obnm.corejava();
		obnm.strength();
		obnm.declaration();

	}

}


interface buildresume
{
	public void CareerObjective ();
	public void manualtesting ();
	public void sql ();
	public void corejava ();
	public void strength ();
	public void declaration ();

}

class resume implements buildresume
{

	@Override
	public void CareerObjective() 
	{
		System.out.println("CareerObjective");
		System.out.println("_________________");
		System.out.println("Seeking an entry level job position in reputed engineering firm in order to build a long term career investing the best ");
		System.out.println("of my technical knowledge and educational qualifications to serve the organization with an outstanding output"); 
		System.out.println("________________________________________________________________________________________________________________________");
	}

	@Override
	public void manualtesting() 
	{
		System.out.println("manualtesting");
		System.out.println("_________________");
		System.out.println("•	Very good knowledge in manual testing\r\n"
				+ "•	Good knowledge of white box testing and black box testing\r\n"
				+ "•	Good knowledge in smoke, functionality, integration, system, acceptance testing\r\n"
				+ "•	Good knowledge in compatibility testing, regression, ad hoc, exploratory\r\n"
				+ "•	Good knowledge of writing test cases\r\n"
				+ "•	Good knowledge of execution and reviewing of test cases\r\n"
				+ "•	Knowledge in Test Plan, Test case, Transability matrix\r\n"
				+ "•	Having very good knowledge in bug life cycle\r\n"
				+ "");
		System.out.println("________________________________________________________________________________________________________________________");
		
	}

	@Override
	public void sql() 
	{
		System.out.println("sql");
		System.out.println("_________________");
		System.out.println("•	Good knowledge in writing SQL queries.\r\n"
				+ "•	Good knowledge in DDL, DML, TCL.\r\n"
				+ "•	Good knowledge in Grouping and Functions.\r\n"
				+ "•	Having very good knowledge in Sub-queries and Co-Related Sub-queries.\r\n"
				+ "•	Good knowledge in Joins and its types.\r\n"
				+ "•	Basic knowledge in Normalization.\r\n"
				+ "•	Practiced extensively on Oracle 10g database.\r\n"
				+ "");
		System.out.println("________________________________________________________________________________________________________________________");
		
	}

	@Override
	public void corejava() 
	{
		System.out.println("corejava");
		System.out.println("_________________");
		System.out.println("•	Very strong knowledge on OOPS concepts like Method overloading and Method overriding.\r\n"
				+ "•	Good knowledge on Inheritance, Polymorphism.\r\n"
				+ "•	Having good knowledge on Abstraction and Encapsulation.\r\n"
				+ "•	Strong knowledge on Up casting and Down casting.\r\n"
				+ "•	Very good knowledge on Constructors and interface.\r\n"
				+ "•	Good practical knowledge on Collection Framework like List and Set. \r\n"
				+ "•	Good in Exception Handling and written many custom Exceptions.\r\n"
				+ "•	Having basic Knowledge on Threads.\r\n"
				+ "");
		System.out.println("________________________________________________________________________________________________________________________");
		
	}

	@Override
	public void strength() 
	{
		System.out.println("strength");
		System.out.println("_________________");
		System.out.println("•	Quality oriented mindset \r\n"
				+ "•	creativity \r\n"
				+ "•	good communication and drafting skills \r\n"
				+ "•	good judgement skills\r\n"
				+ "•	hardworking and committed\r\n"
				+ "•	Leadership skill\r\n"
				+ "•	Quick learner\r\n"
				+ "•	Honesty\r\n"
				+ "");
		
		System.out.println("________________________________________________________________________________________________________________________");
		
	}

	@Override
	public void declaration() 
	{
		System.out.println("declaration");
		System.out.println("_________________");
		System.out.println("I hereby declare that the information furnished above is true up to the best of my knowledge and belief");

		
	}
	

}