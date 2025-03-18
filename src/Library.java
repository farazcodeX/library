import java.io.InvalidObjectException;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {

        books = new ArrayList<>();

    }

    public void addBook(Book book) throws InvalidObjectException {

        if(book == null) {
            throw new InvalidObjectException("book must not be empty");
            
        }
        else {
            books.add(book);
        }

    }

    public Book findBook(String title) {
        
        for(int i = 0; i < books.size(); ++i) {
            if(books.get(i).getTitle() == title) {
                return books.get(i);
            }
        }
        return null;
    }

    public void borrowBook(String title) throws EmptyLibraryException {

        if(books == null) {
            throw new EmptyLibraryException("Library is empty");
        }




    }

}
