package StringPrograms;

public class CanonicalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Java");
        String str2 = new String("Java");

        // Get canonical representation using intern()
        String str3 = str1.intern();

        System.out.println("str1 == str2? " + (str1 == str2));
        System.out.println("str1 == str3? " + (str1 == str3));
    }
}
