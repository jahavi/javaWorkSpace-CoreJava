package inheritance;
class BaseShape {
    double getPerimeter() {
        return 0;
    }

    double getArea() {
        return 0;
    }
}

class RoundShape extends BaseShape {
    double radius;

    @Override
    double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    double getArea() {
        return 3.14 * radius * radius;
    }
}
public class MainShapeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoundShape r = new RoundShape();
        r.radius = 5;

        System.out.println("Perimeter of RoundShape: " + r.getPerimeter());
        System.out.println("Area of RoundShape: " + r.getArea());
	}

}
