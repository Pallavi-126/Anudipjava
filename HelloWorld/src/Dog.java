package helloWorldProject;

public class Dog {
	
	//static int count=0;
	String color;
	int height;
	String name;
	
	 Dog()
	{
		System.out.println("\n\nConstructor is  called .......");
		color="white";
		height=1;
		name=null;
	}
	
	
	void eating()
	{
		
		System.out.println(name +" is  Eating.....");
    }
	
	
	void barking()
	{
	  System.out.println(name+" is  Barking.....");
	}
	
	
	
	public static void main(String[] args) {
		
		//Instantiation  ...creating instance
		Dog  d=new Dog();
		
		/*d.color="Black";
		d.height=2;*/
		d.name="Puffy";
		
		System.out.println("values of d..... ");
		
		
		
		d.eating();	
		
		d.barking();
		
		System.out.println("Color :"+d.color);
		System.out.println("Height "+d.height);
		
		Dog d1=new Dog();
		
		System.out.println("\n\nvalues of d1..... ");
		/*d1.color="Brown";
		d1.height=3;*/
		d1.name="Browny";
		
		
		d1.eating();
		
		d1.barking();
		
		System.out.println("Color :"+d1.color);
		System.out.println("Height "+d1.height);
		
		
		
		
	}

}
