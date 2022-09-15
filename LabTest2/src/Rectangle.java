
public class Rectangle {
	int length;
	int width;
	Rectangle()
	{
		length=0;
		width=0;
	}
	Rectangle(int length,int width)
	{
	this.length=length;
	this.width=width;
	}
	void Area()
	{
		System.out.println("Area of Rectangle =" +(length*width));
	}

	public static void main(String[] args) {
    Rectangle R1=new Rectangle();
    R1.Area();
	
    Rectangle R2=new Rectangle(30,60);
    R2.Area();
	}

}
