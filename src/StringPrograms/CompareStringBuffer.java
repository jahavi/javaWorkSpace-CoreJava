package StringPrograms;

public class CompareStringBuffer {

	public static void main(String[] args) {
		String str1 = "example.com";
        StringBuffer sb1 = new StringBuffer("example.com");

        System.out.println("Comparing " + str1 + " and " + sb1 + ": " + str1.contentEquals(sb1));

        String str2 = "Example.com";  // capital E
        StringBuffer sb2 = new StringBuffer("example.com");

        System.out.println("Comparing " + str2 + " and " + sb2 + ": " + str2.contentEquals(sb2));
    }
}
