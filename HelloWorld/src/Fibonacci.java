
public class Fibonacci {
	
	int fibo(int n)
	{
		int f=0 ,n1=0, n2=1;
		for(int i=1;i<=n;i++)
		{
			f = n1 + n2;
		    n1 = n2;
		    n2 =f;

		    //System.out.println(f);
		}
        return f;
		
	}
	
	

	public static void main(String[] args) {
		Fibonacci fib=new Fibonacci();
		fib.fibo(5);
		
		System.out.println("Fibonacci oF n numbers:"+fib.fibo(5));
	}

}
