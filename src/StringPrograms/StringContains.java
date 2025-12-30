package StringPrograms;

public class StringContains {

	public static void main(String[] args) {
		String str = "PHP Exercises and Python Exercises";
        String sequence = "and";

        System.out.println("Original String: " + str);
        System.out.println("Specified sequence of char values: " + sequence);

        // Check if the string contains the sequence
        boolean result = str.contains(sequence);

        System.out.println(result);
    }
}