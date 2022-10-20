package InterThread;

public class DThread extends Thread {  //create thread
	private Producer pr;

	public DThread(Producer pr) {     //parameterized cons
		super();
		this.pr = pr;
	}
	
	public void run() {         //method overridden to get demand
		pr.demand(100);
		
	}

}
