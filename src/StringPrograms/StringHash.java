package StringPrograms;

public class StringHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Python Exercises.";

	        int hash = str.hashCode();  // built-in hash function for Strings

	        System.out.println("The hash for " + str + " is " + hash);
	    }
	}