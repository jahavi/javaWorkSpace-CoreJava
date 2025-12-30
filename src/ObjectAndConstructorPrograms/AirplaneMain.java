package ObjectAndConstructorPrograms;
class Airplane {

    String flightNumber;
    String destination;
    String departureTime;
    boolean delayed;

    void setDetails(String fno, String dest, String time, boolean isDelayed) {
        flightNumber = fno;
        destination = dest;
        departureTime = time;
        delayed = isDelayed;
    }

    void checkStatus() {
        if (delayed) {
            System.out.println("Flight " + flightNumber + " is DELAYED");
        } else {
            System.out.println("Flight " + flightNumber + " is ON TIME");
        }
    }

    void markDelayed() {
        delayed = true;
    }

    void markOnTime() {
        delayed = false;
    }

    void display() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Delayed: " + delayed);
    }
}
public class AirplaneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airplane a = new Airplane();

        a.setDetails("AI202", "New York", "10:30 AM", false);

        a.display();
        a.checkStatus();

        a.markDelayed();

        a.checkStatus();
	}

}
