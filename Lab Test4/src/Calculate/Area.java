package Calculate;

public class Area implements Shape{
	

	@Override
	public int RectangleArea(int length, int breadth) {         //to print area of rectangle 
		
		return length*breadth;
	}


	@Override
	public int CircleArea(int radius) {                         // to print area of circle
		
		return (22/7)*radius^2;
	}


	@Override 
	public int SquareArea(int side) {
		return side^2;
	
		
	}
	
}	

     
     
     
     

