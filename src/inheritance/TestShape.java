package inheritance;
class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double getArea() {
        return length * width;
    }
}
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(10, 5);

        System.out.println("Area of Rectangle = " + r.getArea());
	}

}
