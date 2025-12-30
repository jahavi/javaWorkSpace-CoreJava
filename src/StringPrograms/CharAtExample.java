package StringPrograms;

public class CharAtExample {

	public static void main(String[] args) {
		String str = "Java Exercises!";

        System.out.println("Original String = " + str);

        // character at index 0
        char ch1 = str.charAt(0);
        System.out.println("The character at position 0 is " + ch1);

        // character at index 10
        char ch2 = str.charAt(10);
        System.out.println("The character at position 10 is " + ch2);
    }
}

