package Calculate;

public class ShapeMain {

	public static void main(String[] args) {
		Area a=new Area();
		
		System.out.println("Area of Rectangle :"+a.RectangleArea(20,30));          //giving inputs to instance and printing Areas
		System.out.println("Area of Circle :"+a.CircleArea(5));
		System.out.println("Area of Square :"+a.SquareArea(6));

	}

}
