package Bank;



public class BankMain {

	public static void main(String[] args) {
		BankA bA=new BankA();                       //object to print balace of bank A,B,C
		System.out.println("Money deposited by boy in Bank A : "+bA.getBalance());
		
		BankB bB=new BankB();
		System.out.println("Money deposited by boy in Bank B : "+bB.getBalance());

		BankC bC=new BankC();
		System.out.println("Money deposited by boy in Bank C : "+bC.getBalance());

		

	}

}