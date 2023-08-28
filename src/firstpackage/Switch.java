package firstpackage;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice=10;
		
		switch(choice)
		{
		case 1: System.out.println("monday");
				break;
		case 2: System.out.println("tuesday");
				break;
		case 3: System.out.println("wednesday");
				break;
		case 4: System.out.println("thursday");
				break;
		case 5: System.out.println("friday");
				break;
		case 6: System.out.println("saturday");
				break;
		case 7: System.out.println("sunday");
				break;
				
		default:System.out.println("invalid choice");
				
		
//
		
		
		char c='#';
		switch(c)
		{
		case '-': System.out.println("monday");
				break;
		case '@': System.out.println("tuesday");
				break;
		case '#': System.out.println("wednesday");
				break;
		case '%': System.out.println("thursday");
				break;
		case '&': System.out.println("friday");
				break;
		case '*': System.out.println("saturday");
				break;
		case '$': System.out.println("sunday");
				break;
		
		default:System.out.println("invalid choice");
		}
		
		
		}
		
	
		
//
		
		int a=10,b=20;
     	switch('+')
     	{

     	case '+': System.out.println(a+b);
			break;
     	case 2: System.out.println(a-b);
     		break;
     	case 3: System.out.println(a*b);
     		break;
     	case 4: System.out.println(a/b);
     		break;
		default: System.out.println("invalid choice");
	}

	}
}
