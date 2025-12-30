package inheritance;
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}
public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
        a.makeSound();

        Cat c = new Cat();
        c.makeSound();
	}

}
