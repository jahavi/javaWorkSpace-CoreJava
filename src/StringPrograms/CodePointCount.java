package StringPrograms;

public class CodePointCount {

	public static void main(String[] args) {
		String str = "ramaresource.com";

        System.out.println("Original String : " + str);

        // Count code points between index 2 (inclusive) and index 11 (exclusive)
        int count = str.codePointCount(2, 11);

        System.out.println("Codepoint count = " + count);
    }
}
