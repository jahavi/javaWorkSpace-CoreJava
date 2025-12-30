package ObjectAndConstructorPrograms;
abstract class Shape {

    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class MyRectangle extends Shape {

    double length;
    double width;

    MyRectangle(double l, double w) {
        length = l;
        width = w;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class MyCircle extends Shape {

    double radius;

    MyCircle(double r) {
        radius = r;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}

class MyTriangle extends Shape {

    double a;
    double b;
    double c;

    MyTriangle(double side1, double side2, double side3) {
        a = side1;
        b = side2;
        c = side3;
    }

    double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double calculatePerimeter() {
        return a + b + c;
    }
}

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rect = new MyRectangle(5, 4);
        Shape circ = new MyCircle(3);
        Shape tri = new MyTriangle(3, 4, 5);

        System.out.println("Rectangle Area: " + rect.calculateArea());
        System.out.println("Rectangle Perimeter: " + rect.calculatePerimeter());

        System.out.println("Circle Area: " + circ.calculateArea());
        System.out.println("Circle Perimeter: " + circ.calculatePerimeter());

        System.out.println("Triangle Area: " + tri.calculateArea());
        System.out.println("Triangle Perimeter: " + tri.calculatePerimeter());
	}

}
