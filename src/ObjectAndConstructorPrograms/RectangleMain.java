package ObjectAndConstructorPrograms;
class Rectangle {

    double width;
    double height;

    // Constructor to set values
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    // Method to calculate area
    double area() {
        return width * height;
    }

    // Method to calculate perimeter
    double perimeter() {
        return 2 * (width + height);
    }
}
public class RectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(12.5, 8.5);

        // Printing area and perimeter
        System.out.println("Width: " + rect.width);
        System.out.println("Height: " + rect.height);
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
	}

}
