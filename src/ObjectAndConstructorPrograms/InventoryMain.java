package ObjectAndConstructorPrograms;
class Inventory {

    String[] products = new String[5];
    int count = 0;

    void addProduct(String productName) {
        if (count < products.length) {
            products[count] = productName;
            count++;
            System.out.println("Product Added: " + productName);
        } else {
            System.out.println("Inventory Full");
        }
    }

    void removeProduct(String productName) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (products[i].equals(productName)) {
                found = true;

                // Shift elements left
                for (int j = i; j < count - 1; j++) {
                    products[j] = products[j + 1];
                }

                products[count - 1] = null;
                count--;

                System.out.println("Product Removed: " + productName);
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found");
        }
    }

    void checkLowInventory() {
        if (count <= 1) {
            System.out.println("Low Inventory Warning!");
        } else {
            System.out.println("Inventory Level Normal");
        }
    }

    void displayProducts() {
        if (count == 0) {
            System.out.println("No Products in Inventory");
        } else {
            System.out.println("Products:");
            for (int i = 0; i < count; i++) {
                System.out.println(products[i]);
            }
        }
    }
}

public class InventoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory inv = new Inventory();

        inv.addProduct("Laptop");
        inv.addProduct("Mouse");
        inv.addProduct("Keyboard");

        inv.displayProducts();

        inv.checkLowInventory();

        inv.removeProduct("Mouse");

        inv.displayProducts();

        inv.checkLowInventory();
	}

}
