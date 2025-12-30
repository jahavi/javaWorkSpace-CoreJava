package ObjectAndConstructorPrograms;
class TravelService {

    String[] flights = {"AI101", "BA202", "EK303", "QR404", "UA505"};
    String[] hotels = {"Hilton", "Marriott", "Taj", "Hyatt", "ITC"};

    String[] reservations = new String[10];
    int reservationCount = 0;

    void searchFlights(String keyword) {
        System.out.println("Available Flights:");
        boolean found = false;

        for (int i = 0; i < flights.length; i++) {
            if (flights[i].contains(keyword)) {
                System.out.println(flights[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching flights found.");
        }
    }

    void searchHotels(String keyword) {
        System.out.println("Available Hotels:");
        boolean found = false;

        for (int i = 0; i < hotels.length; i++) {
            if (hotels[i].contains(keyword)) {
                System.out.println(hotels[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching hotels found.");
        }
    }

    void bookReservation(String item) {
        if (reservationCount < reservations.length) {
            reservations[reservationCount] = item;
            reservationCount++;
            System.out.println("Reservation Booked: " + item);
        } else {
            System.out.println("Reservation list full!");
        }
    }

    void cancelReservation(String item) {
        boolean found = false;

        for (int i = 0; i < reservationCount; i++) {
            if (reservations[i].equals(item)) {
                found = true;

                for (int j = i; j < reservationCount - 1; j++) {
                    reservations[j] = reservations[j + 1];
                }

                reservations[reservationCount - 1] = null;
                reservationCount--;

                System.out.println("Reservation Cancelled: " + item);
                break;
            }
        }

        if (!found) {
            System.out.println("Reservation Not Found");
        }
    }

    void displayReservations() {
        if (reservationCount == 0) {
            System.out.println("No Reservations");
            return;
        }

        System.out.println("Current Reservations:");
        for (int i = 0; i < reservationCount; i++) {
            System.out.println(reservations[i]);
        }
    }
}

public class TravelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelService ts = new TravelService();

        ts.searchFlights("AI");
        ts.searchHotels("Taj");

        ts.bookReservation("AI101");
        ts.bookReservation("Taj Hotel");

        ts.displayReservations();

        ts.cancelReservation("AI101");

        ts.displayReservations();
	}

}
