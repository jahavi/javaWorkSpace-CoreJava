package StringPrograms;

public class StringCompareIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Stephen Edwin King";
        String s2 = "Walter Winchell";
        String s3 = "stephen edwin king";

        System.out.println("\"" + s1 + "\" equals \"" + s2 + "\"? " + s1.equalsIgnoreCase(s2));
        System.out.println("\"" + s1 + "\" equals \"" + s3 + "\"? " + s1.equalsIgnoreCase(s3));
    }
}

