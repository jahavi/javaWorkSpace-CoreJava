package StringPrograms;

public class ReplaceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The quick brown fox jumps over the lazy dog.";

        System.out.println("Original string: " + str);

        String newStr = str.replace('d', 'f');

        System.out.println("New String: " + newStr);

	}

}
