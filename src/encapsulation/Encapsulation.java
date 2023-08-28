package encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employee obnm= new employee();
		obnm.setEmpname("shirin");
		obnm.setEmpname("anu");
		obnm.setDesignation("tester");
		System.out.println(obnm.getEmpname());
		System.out.println(obnm.getEmpname());
		System.out.println(obnm.getDesignation());
	}

}


class employee
{
	private String empname;
	private String designation;
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}