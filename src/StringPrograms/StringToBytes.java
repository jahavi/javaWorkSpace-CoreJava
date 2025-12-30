package StringPrograms;

public class StringToBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a sample String.";

        byte[] arr = str.getBytes(); // convert to byte array

        String newString = new String(arr); // convert back from byte[]

        System.out.println("The new String equals " + newString);
    }
}
