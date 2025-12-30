package ObjectAndConstructorPrograms;
class Dog {

    String name;
    String breed;

    // Constructor
    Dog(String n, String b) {
        name = n;
        breed = b;
    }

    // Setter methods
    void setName(String n) {
        name = n;
    }

    void setBreed(String b) {
        breed = b;
    }

    // Method to display dog details
    void display() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }
}

public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog("Tommy", "Labrador");
        Dog d2 = new Dog("Bruno", "German Shepherd");

        // Updating attributes using setter methods
        d1.setName("Max");
        d1.setBreed("Golden Retriever");

        d2.setName("Rocky");
        d2.setBreed("Husky");

        // Printing updated values
        d1.display();
        d2.display();
	}

}
