package StringPrograms;

public class RegionMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Welcome to Java World";
        String str2 = "I love the Java World programming language";

        boolean result1 = str1.regionMatches(0, str2, 28, 8);
        boolean result2 = str1.regionMatches(9, str2, 9, 7);

        System.out.println("str1[0 - 7] == str2[28 - 35]? " + result1);
        System.out.println("str1[9 - 15] == str2[9 - 15]? " + result2);
    }
}

