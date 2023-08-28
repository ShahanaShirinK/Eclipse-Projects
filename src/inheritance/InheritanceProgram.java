package inheritance;

public class InheritanceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee obnm1= new Employee();
		Manager obnm2= new Manager();
		
		obnm1.specialization=1205;
		obnm2.department= "electrical" ;
		
		
		
		obnm1.name="shirin";
		obnm1.age=24;
		obnm1.phonenmbr=7902767576l;
		obnm1.address="punnakkad";
		obnm1.salary=30000;
		
		obnm1.printdetails();
		
		System.out.println(obnm1.specialization);
		System.out.println(obnm2.department);
		
		
	}

}



class Member 
{
	String name;
	int age;
	long phonenmbr;
	String address;
	int salary;
	
	public void printdetails()
	{																				
	System.out.println("name="+name);
	System.out.println("age="+age);
	System.out.println("phonenmbr="+phonenmbr);
	System.out.println("address="+address);
	System.out.println("salary="+salary);
	}
}


class Employee extends Member
{
	int specialization;

}

class Manager extends Member
{
	String department;

}