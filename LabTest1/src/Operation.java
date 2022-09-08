
public class Operation {

	public static void main(String[] args) {
		int n1=8;
		int n2=4;
		char operator='%';
		
		switch(operator)
		{
		case '+': System.out.println("Addition= "+""+(n1+n2));
		break;
		
		case '-': System.out.println("Subtraction= "+""+(n1-n2));
		break;
		
		case '*': System.out.println("Multiplication= "+""+(n1*n2));
		break;
		
		case '/': System.out.println("Division= "+""+(n1/n2));
		break;
		
		case '%': System.out.println("Modulus= "+""+(n1%n2));
		break;
		
		
		}
	}

}
