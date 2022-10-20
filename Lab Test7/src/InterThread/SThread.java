package InterThread;

public class SThread extends Thread{   //create thread 1
	private Producer pr;

	public SThread(Producer pr) {   //parameterized cons
		super();
		this.pr = pr;
	}
	
	public void run() {           //method overriden to give supply
		pr.supply(50);
	}

}
