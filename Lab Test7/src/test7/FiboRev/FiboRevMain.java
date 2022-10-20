package test7.FiboRev;

import java.util.*;

public class FiboRevMain {

	public static void main(String[] args) {
		 int x=10;
		 
		 FiboRevOrder fn=new FiboRevOrder(x);
		 
		 Rev th1=new Rev(fn);      //Thread1
		 Fib th2=new Fib(fn);      //Thread 2
		th1.start();
		th2.start();

	}

}
