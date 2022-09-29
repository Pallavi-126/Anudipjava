package MemberTest;

public class Member {

	private String name;
	private int age;
	private String mobileNo;
	private String address;
	protected String salary;
	
	public Member() {   //default Constructor
		super();
   	}

	public Member(String name, int age, String mobileNo, String address, String salary) {     // parameterized constructor
		super();
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.address = address;
		this.salary = salary;
	}

	public String getName() {     // getter setter to get and set the values
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public void printSalary() {
		System.out.println(salary);
	}
	

}
