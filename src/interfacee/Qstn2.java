package interfacee;

public class Qstn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv obnm= new Tv();
		obnm.smart11();

	}

}

interface SmartTvremote
{
	public void smart11();
	public void smart22();
	public void smart33();

}

interface Tvremote extends SmartTvremote
{
	public void smart4444();
	public void smart5555();

}


class Tv implements Tvremote
{

	@Override
	public void smart11() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void smart22() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void smart33() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void smart4444() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void smart5555() {
		// TODO Auto-generated method stub
		
	}

	
	

}
