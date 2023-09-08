package Week3Session1;

 

public class ShapeExample {
	
	public static void main(String[] args) {
		 
		
		Circle c = new Circle (10.5);
		System.out.println("The area of the circle=" + c.getArea());
		
		Square sq = new Square(10.0);
		System.out.println("The area of the square=" + sq.getArea());
		
		Rectangle rec = new Rectangle(10.0, 8.0);
		System.out.println("The area of the rectangle=" + rec.getArea());
		
	}

}

class Shape   {

	double getArea () {
		return 0;
	}

}
class Circle extends Shape   {

	final double PI=3.14;
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	double  getArea ()   {

		double area = PI * radius * radius;
		return area;
	}
}
class Square extends Shape   {

	double length;

	public Square(double length) {
		this.length = length;
	}

	double  getArea ()   {	
		double area =  length* length;
		return area;
	}
}
class Rectangle extends Shape {
	double length;
	double width;

	 
	 

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}




	double  getArea ()   {	
		double area =  width* length;
		return area;
	}

}
