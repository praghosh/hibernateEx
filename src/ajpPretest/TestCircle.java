package ajpPretest;
 
abstract class Shape {
protected int sides;

public Shape(int sides) {
   this.sides = sides;
}

public abstract double calculateArea();
}

class Circle extends Shape {
private double radius;

public Circle(double radius) {
   super(1);
   this.radius = radius;
}

public double calculateArea() {
   return Math.PI * radius * radius;
}
}

class Triangle extends Shape {
private double base;
private double height;

public Triangle(double base, double height) {
   super(3);
   this.base = base;
   this.height = height;
}

public double calculateArea() {
   return 0.5 * base * height;
}
}

public class TestCircle {
public static void main(String[] args) {
   Shape circle = new Circle(5.0);
   Shape triangle = new Triangle(4.0, 3.0);

   System.out.println("Area of circle: " + circle.calculateArea());
   System.out.println("Area of triangle: " + triangle.calculateArea());
}
}
 
