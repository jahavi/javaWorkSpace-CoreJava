package ObjectAndConstructorPrograms;
class Restaurant {

    String[] items = new String[5];
    double[] prices = new double[5];
    int[] ratings = new int[5];

    int count = 0;

    void addItem(String itemName, double price, int rating) {
        if (count < items.length) {
            items[count] = itemName;
            prices[count] = price;
            ratings[count] = rating;
            count++;
            System.out.println("Item Added: " + itemName);
        } else {
            System.out.println("Menu Full");
        }
    }

    void removeItem(String itemName) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (items[i].equals(itemName)) {
                found = true;

                for (int j = i; j < count - 1; j++) {
                    items[j] = items[j + 1];
                    prices[j] = prices[j + 1];
                    ratings[j] = ratings[j + 1];
                }

                items[count - 1] = null;
                prices[count - 1] = 0;
                ratings[count - 1] = 0;

                count--;
                System.out.println("Item Removed: " + itemName);
                break;
            }
        }

        if (!found) {
            System.out.println("Item Not Found");
        }
    }

    double calculateAverageRating() {
        if (count == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + ratings[i];
        }

        return (double) sum / count;
    }

    void displayMenu() {
        if (count == 0) {
            System.out.println("Menu is empty");
            return;
        }

        System.out.println("Menu:");
        for (int i = 0; i < count; i++) {
            System.out.println(items[i] + " - Rs." + prices[i] + " - Rating: " + ratings[i]);
        }
    }
}
public class RestaurantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant r = new Restaurant();

        r.addItem("Burger", 120.0, 4);
        r.addItem("Pizza", 250.0, 5);
        r.addItem("Pasta", 180.0, 3);

        r.displayMenu();

        System.out.println("Average Rating: " + r.calculateAverageRating());

        r.removeItem("Pizza");

        r.displayMenu();

        System.out.println("Average Rating: " + r.calculateAverageRating());
	}

}
