package StringPrograms;

public class SubstringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The quick brown fox jumps over the lazy dog.";

        System.out.println("old = " + str);

        String newStr = str.substring(10, 27); // start index inclusive, end exclusive

        System.out.println("new = " + newStr);
    }
}
