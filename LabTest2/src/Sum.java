
public class Sum {
	
	void AddNumber(int i,int n)
	{
	int j=0;
	for( i=1;i<=100;i++)	// To increase value of i from 1 To 100
	{
		
		j=j+i;  // add previous number
		
	}
	System.out.print("Addition of Numbers from 1 to 100 ="+" " +j);
	
	}

	public static void main(String[] args) {
		Sum add= new Sum();
		add.AddNumber(1,100); 
		

	}

}

