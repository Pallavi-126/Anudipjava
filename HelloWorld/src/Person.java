
public class Person {
    int age;
	String name;
	 
	Person()
	{
		age=0;
		name= null;
		
	}
    void info()
	{
		
		System.out.println("Name:" +name);
		System.out.println("Age:" +age);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(" For P1");
		
		Person P1=new Person();	
		P1.info();
		
		System.out.println(" For P2");
		Person P2=new Person();
		P2.name= "Pallavi";
		P2.age=22;
		P2.info();
		
		

	}

}
/*public class Person {
	
	int age;
	String name;
	
	 Person()
	{
		age=0;
		name=null;
	}
	void info ()
	{
		
	System.out.println("name is  "+name );
	System.out.println("age "+age);
		
    }
	
	public static void main(String[] args) {
		 Person p1=new   Person();
		 p1.name="Diptish";
		 p1.age=20;
		 
	        p1.info();	
						
		  Person p2=new  Person();
		  p2.info();			
		}

	}*/