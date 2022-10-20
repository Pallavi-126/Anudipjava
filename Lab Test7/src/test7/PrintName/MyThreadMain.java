package test7.PrintName;

public class MyThreadMain {

	public static void main(String[] args) {
		String[] s1= {"Dhanu","Asawari","Trupti",
				"satwani","Pallavi","Tanu","Aish","Vaishnavi","Komal","Punam"};
		
		MyThread th1=new MyThread(s1);   // Thread 1 & 2 &3
		
		MyThread th2=new MyThread(s1);
		
		MyThread th3=new MyThread(s1);
		
		/*th1.setPriority(0);          //sets priority
		th2.setPriority(4);
		th3.setPriority(10);*/
		
		th1.start();               //starts thread
		th2.start();
		th3.start();
	}

}
