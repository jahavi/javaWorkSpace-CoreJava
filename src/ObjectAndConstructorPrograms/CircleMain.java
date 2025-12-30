package ObjectAndConstructorPrograms;
class Circle {
    double radius;

    void setRadius(double r) {
        radius = r;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

    double getCircumference() {
        return 2 * 3.14 * radius;
    }
}
public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
        c.setRadius(5);

        System.out.println("Radius = " + c.radius);
        System.out.println("Area = " + c.getArea());
        System.out.println("Circumference = " + c.getCircumference());
	}

}
