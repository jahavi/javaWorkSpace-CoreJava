package ObjectAndConstructorPrograms;
class BookLibrary {

    String[] books = new String[5];
    int count = 0;

    void addBook(String bookName) {
        if (count < books.length) {
            books[count] = bookName;
            count++;
            System.out.println("Book Added: " + bookName);
        } else {
            System.out.println("Library is Full");
        }
    }

    void removeBook(String bookName) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (books[i].equals(bookName)) {
                found = true;

                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }

                books[count - 1] = null;
                count--;

                System.out.println("Book Removed: " + bookName);
                break;
            }
        }

        if (!found) {
            System.out.println("Book Not Found");
        }
    }

    void displayBooks() {
        if (count == 0) {
            System.out.println("No Books in Library");
        } else {
            System.out.println("Books in Library:");
            for (int i = 0; i < count; i++) {
                System.out.println(books[i]);
            }
        }
    }
}
public class BookLibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookLibrary lib = new BookLibrary();

        lib.addBook("Java Programming");
        lib.addBook("Data Structures");
        lib.addBook("Operating Systems");

        lib.displayBooks();

        lib.removeBook("Data Structures");

        lib.displayBooks();
	}

}
