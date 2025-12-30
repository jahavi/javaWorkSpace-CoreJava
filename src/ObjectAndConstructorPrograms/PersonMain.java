package ObjectAndConstructorPrograms;
class Person {
    
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Rakesh", 25);
        Person p2 = new Person("Anjali", 30);

        p1.display();
        p2.display();
	}

}
