package StringPrograms;

public class AlphabetIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "The quick brown fox jumps over the lazy dog.";

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alphabet.length(); i++) {
            System.out.print(alphabet.charAt(i) + "  ");
            if (alphabet.charAt(i) == 'j' || alphabet.charAt(i) == 't')
                System.out.println("\n=========================");
        }

        System.out.println();

        for (int i = 0; i < alphabet.length(); i++) {
            int index = sentence.toLowerCase().indexOf(alphabet.charAt(i));
            System.out.print(index + " ");
            if (alphabet.charAt(i) == 'j') {
                System.out.println("\n");
            }
            if (alphabet.charAt(i) == 't') {
                System.out.println();
            }
        }
    }
}
