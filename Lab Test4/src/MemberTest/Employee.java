package MemberTest;

public class Employee extends Member{
	private String spe;
	public Employee() {        //default constructor
		super();
	}

	public Employee(String name, int age, String mobileNo, String address, String salary) {      //parameterized constructor
		super(name, age, mobileNo, address, salary);
		this.spe = spe;
	}

	public String getSpe() {                 //getter setter
		return spe;
	}

	public void setSpe(String spe) {
		this.spe = spe;
	}

	@Override
	public void printSalary() {
		System.out.println(salary);
	}
	
    
    
    
}
