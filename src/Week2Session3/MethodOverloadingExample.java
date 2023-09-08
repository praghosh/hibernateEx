package Week2Session3;

/*
 * Example of Method Overloading
 *
 *Figure class has two methods with the same name 
 * getArea() but they take different number 
 * of parameters.
 * 
 * Return types are also different in this example. 
 * However, return type can be same also for method overloading 
 */

public class MethodOverloadingExample {

 

	public static void main(String[] args) {
		Figure obj = new Figure();
		System.out.println("Area of Rectangle: " +obj.getArea(7.25, 6)); 
		System.out.println("Area of Square: " +obj.getArea(5)); 
	}
}

class Figure  {

	// Return Area of a Rectangular Figure
	double getArea(double l, int b) //two double parameters, return type double
	{
		return (l*b);
	}

	// Return area of a square
	float getArea(float  s) //one float parameter,  return type float
	{
		return (s*s);
	}

}