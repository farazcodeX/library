import java.io.InvalidObjectException;
import java.net.Socket;
import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {

        books = new ArrayList<>();

    }

    public void addBook(Book book) throws InvalidObjectException {

        System.out.println("----------------------");

        if(book == null) {
            throw new InvalidObjectException("book must not be empty");
            
        }
        else {
           
            System.out.println("Book : " + book.getTitle() + " has been added ");
            books.add(book);
        }

    }

    public Book findBook(String title) {

        System.out.println("-*--*--*--*--*--*--*--*--*--*--*--*-");

        for(int i = 0; i < books.size(); ++i) {
            if(books.get(i).getTitle() == title) {

                System.out.println("Book  : " + title + "  has been founded");
               
                return books.get(i);
            }
        }
        return null;
    }

    public void borrowBook(String title) throws EmptyLibraryException, BookNotFoundException {

        System.out.println("--------------------------");

        if(books == null) {
            throw new EmptyLibraryException("Library is empty");
        }
        // this temprary but forgive me
        Book book = findBook(title);
        
        if(book == null) {
            throw new BookNotFoundException("book : " + title + "  not found");
            
        }
       
        else {
           
            System.out.println("Book  : " + book.getTitle() + "  has been borrowed successfully");
           
        }
    }
    public void returnBook(String title) throws BookNotFoundException {

        System.out.println("------------------------------");

        for(int i = 0; i < books.size(); ++i) {
            if(books.get(i).getTitle() == title) {
                System.out.println("Book  :  " + title + "  pages  : " + books.get(i).getCount() + "  has been returned successfully");
                
                return;

            }
        }

        

        // if not found 
        throw new BookNotFoundException("Book : " + title + "  Not founded");   
    }
    public void listBooks() throws EmptyLibraryException {

        System.out.println("------------------------------");
        if(books == null) {
            throw new EmptyLibraryException("Library is empty");
        }
        else {
            for(int i = 0; i < books.size(); ++i) {
                if(i != 0) {
                    System.out.println("---------------------------------");
                }
               
               System.out.println();
               System.out.println("Book  :  " + books.get(i).getTitle() + "   pages :  " + books.get(i).getCount());
            }
        }
        System.out.println("-----------------------------------");

        
        
    }

}
