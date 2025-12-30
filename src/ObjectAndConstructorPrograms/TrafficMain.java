package ObjectAndConstructorPrograms;
class TrafficLight {

    String color;
    int duration;

    void setLight(String c, int d) {
        color = c;
        duration = d;
    }

    void changeColor(String newColor) {
        color = newColor;
    }

    void checkLight() {
        if (color.equals("red")) {
            System.out.println("Stop! The light is RED");
        } 
        else if (color.equals("green")) {
            System.out.println("Go! The light is GREEN");
        } 
        else if (color.equals("yellow")) {
            System.out.println("Slow Down! The light is YELLOW");
        } 
        else {
            System.out.println("Invalid Light Color");
        }
    }

    void display() {
        System.out.println("Current Light: " + color + " | Duration: " + duration + " seconds");
    }
}
public class TrafficMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight t = new TrafficLight();

        t.setLight("red", 30);
        t.display();
        t.checkLight();

        t.changeColor("green");
        t.display();
        t.checkLight();
	}

}
