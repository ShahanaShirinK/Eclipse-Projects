package questions;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car obnm= new Car();
		obnm.drive();
		
		
	}
	
	public void drive()												
	{
		
	}

}

 class Car extends Vehicle
{

	@Override
	public void drive() 
	{
		System.out.println("repairing a car");
		
	}
	
}
