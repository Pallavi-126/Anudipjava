
public class ReturnValue {
	static int add (int a, int b) 
	{
	     return(a+b);
	}
	
	static int sub (int a, int b) 
	{
	return(a-b);
     }
	
	
    static int mul (int a, int b) 
	{
	return (a*b);
	}
	
	
    static int div (int a, int b) 
	{
	return(a/b);
	}
	public static void main(String[] args) {
		
      //  add(30,50);
        System.out.println("Addition"+" "+add(30,50));
        System.out.println("Substraction"+" "+sub(40,30));
        System.out.println("Multiplication"+" "+mul(10,30));   
        System.out.println("division"+" "+div(40,20));
	}	
	}


