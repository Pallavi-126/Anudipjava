package test7.FiboRev;

public class FiboRevOrder {
	private int n=10;
	
	public FiboRevOrder(int n) {           //parameterized cons
		super();
		this.n = n;
	}

	synchronized public void Fibo() {           // method to print fibo series
		System.out.print("Fibonacci Series : ");
		int n1=0,n2=1,x;
		for (int i=0;i<n;i++) {
			x=n1+n2;
			n1=n2;
			n2=x;
		System.out.print(x+" ");
			
		}
		
	}
	synchronized void Rev() {         //method to print rev order
		System.out.print(" Reverse Order : ");
		for(int i=n-1;i>=0;i--) {
			System.out.print(i+" ");	
		}
	}
		
	}
