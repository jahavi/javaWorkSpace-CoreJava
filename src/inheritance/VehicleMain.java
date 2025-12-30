package inheritance;
class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Repairing a car");
    }
}
public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
        v.drive();

        Car c = new Car();
        c.drive();
	}

}
