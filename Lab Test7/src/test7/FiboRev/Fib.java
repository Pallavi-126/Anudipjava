package test7.FiboRev;

public class Fib extends Thread{
	private FiboRevOrder fr;

	public Fib(FiboRevOrder fr) {     //parametrized cons
		super();
		this.fr = fr;
	}

	
	public void run() {         //run methoad to print fibo series
		fr.Fibo();
		
	}

}
