package inheritance;
class BaseVehicle {
    String make;
    String model;
    int year;
    String fuelType;

    double fuelEfficiency() {
        return 0;
    }

    double distanceTraveled(double hours, double speed) {
        return hours * speed;
    }

    double maxSpeed() {
        return 0;
    }
}

// Truck subclass
class HeavyTruck extends BaseVehicle {

    @Override
    double fuelEfficiency() {
        return 5.0; 
    }

    @Override
    double maxSpeed() {
        return 120;
    }
}

// Car subclass
class LightCar extends BaseVehicle {

    @Override
    double fuelEfficiency() {
        return 15.0; 
    }

    @Override
    double maxSpeed() {
        return 180;
    }
}

// Motorcycle subclass
class SpeedBike extends BaseVehicle {

    @Override
    double fuelEfficiency() {
        return 35.0; 
    }

    @Override
    double maxSpeed() {
        return 200;
    }
}
public class VehicleDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LightCar car = new LightCar();
        car.make = "Honda";
        car.model = "Civic";
        car.year = 2020;
        car.fuelType = "Petrol";

        System.out.println("Car: " + car.make + " " + car.model);
        System.out.println("Fuel Efficiency: " + car.fuelEfficiency() + " kmpl");
        System.out.println("Max Speed: " + car.maxSpeed() + " km/h");
        System.out.println("Distance Traveled in 2 hours at 80 km/h: " 
                            + car.distanceTraveled(2, 80) + " km");

        System.out.println();

        HeavyTruck truck = new HeavyTruck();
        truck.make = "Tata";
        truck.model = "Prima";
        truck.year = 2018;
        truck.fuelType = "Diesel";

        System.out.println("Truck: " + truck.make + " " + truck.model);
        System.out.println("Fuel Efficiency: " + truck.fuelEfficiency() + " kmpl");
        System.out.println("Max Speed: " + truck.maxSpeed() + " km/h");

        System.out.println();

        SpeedBike bike = new SpeedBike();
        bike.make = "Yamaha";
        bike.model = "R15";
        bike.year = 2022;
        bike.fuelType = "Petrol";

        System.out.println("Bike: " + bike.make + " " + bike.model);
        System.out.println("Fuel Efficiency: " + bike.fuelEfficiency() + " kmpl");
        System.out.println("Max Speed: " + bike.maxSpeed() + " km/h");
	}

}
