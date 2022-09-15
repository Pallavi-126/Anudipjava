
public class Prime {
    void primeNum(int n) {
	int x;
	for(int i=1;i<=n;i++)  // To print prime no from 1 to 20
	{
	    x=0;
	    for (int j=2;j<=i/2;j++)
	    {
		if (i%j==0)
		{
			x++;
			break;
			
		}	
		}
		if(x==0) 
		{
			System.out.println(i);
			
		}
		
	    
	}
}

	public static void main(String[] args) {
		Prime N1=new Prime();
		N1.primeNum(20);

	}
}

	
