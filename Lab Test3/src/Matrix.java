public class Matrix {
		
int[][] Multiplication(int[][] a, int[][] b)      
        {
		int[][] z = new int[a.length][a[0].length];  
			
		for(int i = 0; i < a.length; i++)    //to multiply matrix
		{        
		    for(int j=0;j < a[i].length; j++)
				{
			     z[i][j] = a[i][j]*b[i][j];             
		        }
	    }
	    return z;                             
		}
	
	    void display(int x[ ][ ])           //To display  multiplied matrix           
		{
		for(int i = 0; i < x.length; i++)          
		    {
			 for(int j = 0; j < x[i].length; j++)
				System.out.print(x[i][j]+ " ");               
		     	System.out.println();
		   }
		 }  
		
public static void main(String[ ] args)    
		{
	      Matrix obj = new Matrix();                        
		  int[][] a = {{3,4}, {5,4}};
		  int[][] b = {{1,2}, {7,8}};
		  
		  int[ ][ ] z= new int[a.length][a[0].length];  
		  z = obj.Multiplication(a, b);      	        	  				 
           
		  System.out.println("Multiplication of Matrix : ");
		    obj.display(z);        //To display  multiplied matrix                            
		 }
}