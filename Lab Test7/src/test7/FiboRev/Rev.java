package test7.FiboRev;

public class Rev extends Thread {         //created thread
	private FiboRevOrder fb;

	public Rev(FiboRevOrder fb) {
		super();
		this.fb = fb;
	}


	public void run() {        //run method to print rev order
		fb.Rev();
		
	}
	
	

}
