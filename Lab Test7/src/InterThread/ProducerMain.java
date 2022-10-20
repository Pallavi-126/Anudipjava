package InterThread;

public class ProducerMain {

	public static void main(String[] args) {
		Producer p=new Producer();
		
		DThread dt=new DThread(p);         //thread 1
		SThread st=new SThread(p);         	//thread 2
		
		dt.start();                   //run the thread1 &2
		st.start();
		
	}

}
