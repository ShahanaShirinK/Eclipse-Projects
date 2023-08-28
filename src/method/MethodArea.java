package method;

import java.util.Scanner;

public class MethodArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodArea obnm= new MethodArea();
		
		
		obnm.rec();
		
		
		double triarea= obnm.triangle();
		System.out.println(triarea);
		
		
		System.out.println("enter radius of the circle");
		Scanner objectname= new Scanner(System.in);
		double radius= objectname.nextDouble();
		obnm.circle(radius);
		
		
		System.out.println("enter the length of the side of square");
		double sidelength= objectname.nextDouble();
		obnm.square(sidelength);
		
	}

	
// Area of rectangle : without return type and without parameter
	
	
	
	public void rec()
	{
		int length=10;
		int breadth=20;
		int areaREC = length*breadth;
		System.out.println(areaREC);
	}
	
// Area of Triangle : with return type and without parameter
	
	public double triangle()
	{
		double base=20;
		double height=10;
		double areaTRIANGLE=0.5*base*height;
		return areaTRIANGLE;
	}
	
	
// without return type and with parameter	
	
	public void circle(double radius)
	{
		double areaCIRCLE=3.14*radius*radius;
		System.out.println(areaCIRCLE);
	}
	
	
// with return type and with parameter	
	
	public double square(double sidelength)
	{
		double areaSQUARE=sidelength*sidelength;
		System.out.println(areaSQUARE);
		return areaSQUARE;
	}
	
	
	
	
	
	
	
}
