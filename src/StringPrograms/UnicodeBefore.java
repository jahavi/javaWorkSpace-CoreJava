package StringPrograms;

public class UnicodeBefore {

	public static void main(String[] args) {
		String str = "ramaresource.com";

        System.out.println("Original String : " + str);

        // Unicode code point BEFORE index 1 (character at index 0)
        int code1 = str.codePointBefore(1);
        System.out.println("Character(unicode point) = " + code1);

        // Unicode code point BEFORE index 14 (index 13 character)
        int code2 = str.codePointBefore(14);
        System.out.println("Character(unicode point) = " + code2);
    }
}