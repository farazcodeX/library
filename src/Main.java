import java.io.InvalidObjectException;

public class Main {
    public static void main(String[] args) {


        Library library = new Library();

       // lets suronde these exceptions with try-catch block
        
            try {
                library.listBooks();
            } catch (EmptyLibraryException e) {
                
                e.printStackTrace();
            }
      

        
        

        Book book1 = null;
        Book book2 = null;
        Book book3 = null;
        Book book4 = null;
        
            try {
                book1 = new Book("Java Programming", 300);
            } catch (InvalidBookException e) {
               
                e.printStackTrace();
            }
            try {
                book2 = new Book("Design Patterns", -3);
            } catch (InvalidBookException e) {
                
                e.printStackTrace();
            }
            try {
                book3 = new Book(null, 100);
            } catch (InvalidBookException e) {
                
                e.printStackTrace();
            }
            try {
                book4 = new Book("", 400);
            } catch (InvalidBookException e) {
              
                e.printStackTrace();
            }
       
        

        try {
            library.addBook(book1);
        } catch (InvalidObjectException e) {
           
            e.printStackTrace();
        }
        try {
            library.addBook(book2);
        } catch (InvalidObjectException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            library.addBook(book3);
        } catch (InvalidObjectException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            library.addBook(book4);
        } catch (InvalidObjectException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            library.listBooks();
        } catch (EmptyLibraryException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            library.borrowBook("Java Programming");
        } catch (EmptyLibraryException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (BookNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            library.returnBook("Clean Code");
        } catch (BookNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            library.returnBook("Java Programming");
        } catch (BookNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            library.listBooks();
        } catch (EmptyLibraryException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}