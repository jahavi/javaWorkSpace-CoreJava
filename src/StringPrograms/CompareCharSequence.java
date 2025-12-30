package StringPrograms;

public class CompareCharSequence {

	public static void main(String[] args) {
		String str1 = "example.com";
        CharSequence str2 = "example.com";

        System.out.println("Comparing " + str1 + " and " + str2 + ": " + str1.contentEquals(str2));

        String str3 = "Example.com";  // capital E
        CharSequence str4 = "example.com";

        System.out.println("Comparing " + str3 + " and " + str4 + ": " + str3.contentEquals(str4));
    }
}
