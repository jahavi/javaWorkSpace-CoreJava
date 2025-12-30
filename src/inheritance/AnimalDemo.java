package inheritance;
class BaseAnimal {
    void move() {
        System.out.println("Animal moves");
    }
}

class FastCheetah extends BaseAnimal {
    @Override
    void move() {
        System.out.println("Cheetah runs fast!");
    }
}
public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastCheetah c = new FastCheetah();
        c.move();
	}

}
