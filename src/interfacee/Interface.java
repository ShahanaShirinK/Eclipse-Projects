package interfacee;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		classname obnm= new classname();
		obnm.method1();		
	}

}

interface cardetails
{
	public void method1();

}

interface carmodification
{
	public void method2();

}

class classname implements cardetails,carmodification
{

	@Override
	public void method2() {
		System.out.println("methooooodd2222");
		
	}

	@Override
	public void method1() {
		System.out.println("method11111");
		
	}
	
}