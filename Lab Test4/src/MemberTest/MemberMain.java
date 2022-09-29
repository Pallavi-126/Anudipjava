package MemberTest;

public class MemberMain {

	public static void main(String[] args) {
		System.out.println("Information Of Manager");   
		Manager m=new Manager();                   //object of manager
		m.setName("Pallavi");
		m.setAge(22);
		m.setAddress("Ahmednagar");
		m.setMobileNo("9457839");
		m.setDepartment("Electronics");
		m.setSalary("35k");	
		
		System.out.println(m.getName());
		System.out.println(m.getAge());
		System.out.println(m.getMobileNo());
		System.out.println(m.getAddress());
		System.out.println(m.getDepartment());
		System.out.println("Salary :");
		m.printSalary();
		
		System.out.println("\nInformation Of Employee");
		Employee e=new Employee();                    //object of employee
		e.setName("Sayli");
		e.setAge(22);
		e.setAddress("Sinner");
		e.setMobileNo("764556");
		e.setSpe("Electronics");
		e.setSalary("23k");	
		
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getMobileNo());
		System.out.println(e.getAddress());
		System.out.println(e.getSpe());
		System.out.println("Salary :");
		e.printSalary();
		

		

	}

}

