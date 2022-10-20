package test7.PrintName;

public class MyThread extends Thread{
	
	private String[] s1;


	public MyThread(String[] s1) {            //parametruzed constructor
		super();
		this.s1 = s1;
		
	}


	public void run() {                //method to print nmaes
		for (int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}
		
		
	}
	

}
