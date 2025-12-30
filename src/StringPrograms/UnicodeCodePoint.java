package StringPrograms;

public class UnicodeCodePoint {

	public static void main(String[] args) {
		String str = "google.com";

        System.out.println("Original String : " + str);

        // Unicode code point at index 0
        int code1 = str.codePointAt(0);
        System.out.println("Character(unicode point) = " + code1);

        // Unicode code point at index 5
        int code2 = str.codePointAt(5);
        System.out.println("Character(unicode point) = " + code2);
    }
}
