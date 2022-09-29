package MemberTest;

public class Manager extends Member {
	private String department;   //to take department
	
	public Manager() {
		super();
	}

	public Manager(String name,int age,String mobileNo,String address,String salary,String department) {
		super(name, age, mobileNo, address, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public void printSalary() {
		System.out.println(salary);

		
	}

	


}
