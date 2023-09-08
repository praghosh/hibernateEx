package ajpPretest;

                                                                                                                                                                                                                                
interface Shape1 {
void draw();
}

class Circle1 implements Shape1 {
public void draw() {
    System.out.println("Drawing a circle");
}
}

class Rectangle implements Shape1 {
public void draw() {
    System.out.println("Drawing a rectangle");
}
}

public class MainJava {
public static void main(String[] args) {
    Shape1[] shapes = new Shape1[3];
    shapes[0] = new Circle1();
    shapes[1] = new Rectangle();
    shapes[2] = new Circle1();

    for (Shape1 shape : shapes) {
        shape.draw();
    }
}
}
