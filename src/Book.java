public class Book {
    private String title;
    private int pageCount;

    public Book(String title, int pageCount) throws InvalidBookException {

        if(title == null || title.equals("")) {
            throw new InvalidBookException("Title cannot be empty");
        }
        else {
             this.title = title;
        }

        if(pageCount < 0) {

            throw new InvalidBookException("Page count must be positive");

        }
        else {
          this.pageCount = pageCount;
        }
        
       
       

    }
    public String getTitle() {
        return title;
    
    }
    public int getCount() {
        return pageCount;

    }
    
}
