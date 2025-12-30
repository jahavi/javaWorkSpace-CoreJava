package ObjectAndConstructorPrograms;
class Book {
    String title;
    String author;
    String isbn;
}

class Library {
    Book[] books = new Book[5];
    int count = 0;

    void addBook(String t, String a, String i) {
        if (count < books.length) {
            Book b = new Book();
            b.title = t;
            b.author = a;
            b.isbn = i;

            books[count] = b;
            count++;
            System.out.println("Book Added: " + t);
        } else {
            System.out.println("Library is full!");
        }
    }

    void removeBook(String isbnNumber) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (books[i].isbn.equals(isbnNumber)) {
                found = true;

                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }

                books[count - 1] = null;
                count--;

                System.out.println("Book Removed");
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }
    }

    void displayBooks() {
        if (count == 0) {
            System.out.println("No books in library");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(books[i].title + " | " + books[i].author + " | " + books[i].isbn);
        }
    }
}
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();

        lib.addBook("Java Basics", "James", "101");
        lib.addBook("OOPS Concepts", "Dennis", "102");

        lib.displayBooks();

        lib.removeBook("101");

        lib.displayBooks();
	}

}
