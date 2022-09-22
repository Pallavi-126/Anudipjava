
public class Calculator {
//for addition
	int Addition(int... n1)
	{
		int sum=0;
		for(int i=0;i<n1.length;i++)
		{
			sum+=n1[i];
		}
		return sum;//returns the value of sum to addition method
	}
	double Addition(double... n1)
	{
		double sum=0;
		for(int i=0;i<n1.length;i++)
		{
			sum+=n1[i];
		}
		return sum;
	}
//for subtraction	
	int Subtraction(int...n2)
	{
		int m=0;
		for(int i=0;i<n2.length;i++)
		{
			m=n2[i]-m;
		}
		return m;
	}
	double Subtraction(double...n2)
	{
		double m=0;
		for(int i=0;i<n2.length;i++)
		{
			m=n2[i]-m;
		}
		return m;
	}
//For multiplication
	int Multiplication(int...n1)
	{
		int sum=1;
		for(int i=0;i<n1.length;i++)
		{
			sum =sum*n1[i];
		}
		return sum;
	}
	double Multiplication(double...n1)
	{
		double sum=1;
		for(int i=0;i<n1.length;i++)
		{
			sum =sum*n1[i];
		}
		return sum;
	}
	
//for division	
	int Division(int... n1)
	{
		int sum=n1[0];
		for(int i=1;i<n1.length;i++)
		{		
				sum/=n1[i];
						
		}
		return sum;
	}
	
	double Division(double... n1)
	{
		double sum=n1[0];
		for(int i=1;i<n1.length;i++)
		{
			sum /=n1[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Calculator add=new Calculator();        //for Addition of int and double
		System.out.println("Addition 1: "+add.Addition(30,40));
		System.out.println("Addition 2: "+add.Addition(30.9,40.7));
		
		Calculator sub=new Calculator();        //for subtraction
		System.out.println("Subtraction 1: "+sub.Subtraction(50,30));
		System.out.println("Subtraction 2: "+sub.Subtraction(50.5,30));
	
		Calculator mul=new Calculator();        //for multiplication
		System.out.println("Multiplication 1: "+mul.Multiplication(50,5));
		System.out.println("Multiplication 2: "+mul.Multiplication(50.5,5));

		Calculator div=new Calculator();        //for division
		System.out.println("Division 1: "+div.Division(30,6));
		System.out.println("Division 2: "+div.Division(30.5,6));
	}

}
